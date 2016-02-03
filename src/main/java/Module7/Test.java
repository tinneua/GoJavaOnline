package Module7;

public class Test {
    public static void main(String[] args) {


        MatchParser pm = new MatchParser();
        String f = "(((10-2)+(5+1))*5)*(3-1)";
        try {
            System.out.println("PlusMinus: " + pm.Parse(f));
        } catch (Exception e) {
            System.err.println("Error while parsing '" + f + "' with message: " + e.getMessage());
        }
    }
}
