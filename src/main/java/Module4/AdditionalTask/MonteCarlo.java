package Module4.AdditionalTask;

public class MonteCarlo {
    private static double f(double x)
    {
        return Math.cos(x);
        //   1 / Math.pow( x , 2 )
    }

    public static double intMonteCarlo(double a, double b, long n)
    {
        double xSum;
        double sum = 0D;

        for (long i = 0; i < n; i++)
        {
            xSum = a + Math.random() * Math.abs( b - a );
            sum += f(xSum);
        }
        return Math.abs( b - a ) * sum / n;
    }
}
