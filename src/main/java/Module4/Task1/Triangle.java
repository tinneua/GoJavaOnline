package Module4.Task1;

public class Triangle extends Figure {

    private double side;
    private double height;
    public void setSide(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public double getSquare(){
        return side*height*0.5;
    }
}
