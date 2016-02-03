package Module4.Task1;

/**
 *
 */
public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }
    public double getSquare() {
        return sideA*sideB;
    }
}
