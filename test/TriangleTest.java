import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void invalidTri() {
        Triangle triangle = new Triangle(1,0,0);
        assertTrue(triangle.invalidTri());
        Triangle large = new Triangle(10,10,100);
        assertTrue(large.invalidTri());
    }

    @Test
    public void isEquilateral() {
        Triangle triangle = new Triangle(1,1,1);
        assertTrue(triangle.isEquilateral());
        Triangle large = new Triangle(100,100,100);
        assertTrue(large.isEquilateral());
    }

    @Test
    public void isScalene() {
        Triangle triangle = new Triangle(1,2,3);
        assertTrue(triangle.isScalene());
        Triangle reverse = new Triangle(3,2,1);
        assertTrue(reverse.isScalene());
        Triangle large = new Triangle(50,51,52);
        assertTrue(large.isScalene());
    }

    @Test
    public void isIsosceles() {
       Triangle triangle = new Triangle(1,1,1);
       assertTrue(triangle.isIsosceles());
       Triangle same = new Triangle(155,155,155);
       assertTrue(same.isIsosceles());
       Triangle large = new Triangle(2000,2000,2000);
       assertTrue(large.isIsosceles());
    }
}