package Module5.AdditionalTask;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrixTest {
    public static void main(String[] args) throws NotEqualMatrixException {

        System.out.println("What do you want to do with matrices?");
        System.out.println("Print 'add' if you want to plus two matrices");
        System.out.println("Print 'multiply' if you want to multiply them");
        Scanner action = new Scanner(new BufferedInputStream(System.in));
        String chooseAction = action.nextLine();

        switch (chooseAction) {
            case "add": {
                System.out.println("!!![NOTE] Matrices should be equal");
                System.out.println("Number of rows for st matrix = number of rows for 2nd matrix. Same for columns!!!");
                List<ArrayList<ArrayList<Integer>>> matrices = MatrixRead.read();
                ArrayList<ArrayList<Integer>> A = matrices.get(0);
                ArrayList<ArrayList<Integer>> B = matrices.get(1);
                int[][] C = MatrixAdd.add(A, B);
                MatrixPrint.printMatrix(C);
                break;
            }
            case "multiply": {
                System.out.println("!!![NOTE] Number of Rows of 1st matrix = Number of Columns of 2nd matrix");
                System.out.println("and Number of Columns of 1st matrix = Number of Rows of 2nd matrix!!!");
                List<ArrayList<ArrayList<Integer>>> matrices = MatrixRead.read();
                ArrayList<ArrayList<Integer>> A = matrices.get(0);
                ArrayList<ArrayList<Integer>> B = matrices.get(1);
                int[][] C = MatrixMultiply.matrixMultiply(A, B);
                MatrixPrint.printMatrix(C);
                break;
            }
            default:
                System.out.println("[Error] Unknown choice. Please repeat");
                break;
        }

    }
}
