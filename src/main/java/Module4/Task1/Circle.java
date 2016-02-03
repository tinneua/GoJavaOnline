package Module4.Task1;

/**
 *
 */
public class Circle extends Figure {
    private double radius;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getSquare() {
        return 2*Math.PI*radius;
    }
}
