package Module4.Task3;


public class CalculateDistance {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public void setX(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
    public void setY(double y1, double y2) {
        this.y1 = y1;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }
    public double getDistance() {
        return Math.pow((Math.pow(x2 - x1,2)+Math.pow(y2-y1,2)),0.5);
    }
}
