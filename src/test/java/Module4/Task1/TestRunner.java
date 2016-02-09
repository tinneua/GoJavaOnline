package Module4.Task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestRunner {
    private final double DELTA = 0D;
    @Test
    public void testTriangle() throws Exception {
        Triangle triangle = new Triangle();
        triangle.setHeight(2);
        triangle.setSide(5);
        final double result = triangle.getSquare();
        assertEquals(5, result, DELTA);
    }

    @Test
    public void testRectangle() throws Exception {
    Rectangle rectangle = new Rectangle();
        rectangle.setSideA(10);
        rectangle.setSideB(5.5);
        final double result = rectangle.getSquare();
        assertEquals(55, result, DELTA);
    }

    @Test
    public void testCircle() throws Exception {
        Circle circle = new Circle();
        circle.setRadius(5);
        final double result = circle.getSquare();
        assertEquals(2*5*Math.PI, result, DELTA);
    }
}