package Module4.Task3;


public class DistanceCalculator {
    public static void main(String[] args) {
        CalculateDistance calc = new CalculateDistance();
        calc.setX(2.5,3.0);
        calc.setY(1.8,3.9);
        System.out.println("Distance = "+calc.getDistance());
    }
}
