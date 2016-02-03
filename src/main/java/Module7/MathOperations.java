package Module7;


public class MathOperations {
    public MathOperations(double x, double y) {
    }

    public static double plus (double x, double y) {
        return x+y;
    }
    public static double minus (double x, double y) {
        return x - y;
    }
    public static double multiply (double x, double y) {
        return x*y;
    }
    public static double divide (double x, double y) throws Exception {
        if (0 == y) { throw new Exception("You cant divide by zero"); }
        return x/y;
    }
    public static double sqrt (double x) {
        return Math.sqrt(x);
    }
    public static double cubeRoot (double x) {
        return Math.pow(x,1/3);
    }
    public static double power (double x, double y) {
        return Math.pow(x,y);
    }
    public static double sin (double x) {
        return (Math.sin(x));    }
    public static double cos (double x) {
        return (Math.cos(x));    }
}

