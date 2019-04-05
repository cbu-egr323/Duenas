public class Triangle
{

    private boolean isEquilateral = false;
    private boolean isScalene = false;
    private boolean isIsosceles = false;
    private boolean invalidTri = false;
    private double s1;
    private double s2;
    private double s3;

    //******************************************************************
    public Triangle(double sideA, double sideB, double sideC){
        this.s1 = sideA;
        this.s2 = sideB;
        this.s3 = sideC;
    }
    //******************************************************************
    public boolean invalidTri() {
        if(((s1 + s2) < s3) ||
                ((s1 + s3) < s2) ||
                ((s2 + s3) < s1)){
            invalidTri = true;
            System.out.println("Error, not a valid triangle!");
        }
        if (s1 <= 0 || s2 <= 0 || s3 <=0 ){
            invalidTri = true;
            System.out.println("The lengths of the sides of the triangle must be positive");
        }
        return invalidTri;
    }
    //******************************************************************
    public boolean isEquilateral() {
        if (s1 == s2 && s1 == s3)  {
            isEquilateral = true;
            System.out.println("The triangle is EQUILATERAL!");
        }
        return isEquilateral;
    }
    //******************************************************************
    public boolean isScalene() {
        if ( (s1 != s2 && s1 != s3 && s2 != s3)  ) {
            isScalene = true;
            System.out.println("The triangle is SCALENE!");
        }
        return isScalene;
    }
    //******************************************************************
    public boolean isIsosceles() {
        if (isEquilateral) {
            isIsosceles = false;
        }
        if (isScalene) {
            isIsosceles = false;
        }
        if (
                ( (s1 == s2) && (s1 != s3) ) ||
                ( (s1 == s3) && (s1 != s2) ) ||
                ( (s2 == s3) && (s2 != s1) ) ) {
            isIsosceles = true;
            System.out.println("The triangle is ISOSCELES!");
        }
        return isIsosceles;
    }

}