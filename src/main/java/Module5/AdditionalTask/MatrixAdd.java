package Module5.AdditionalTask;

import java.util.ArrayList;

public class MatrixAdd {
    static int[][] add(ArrayList<ArrayList<Integer>> A,
                                   ArrayList<ArrayList<Integer>> B) throws NotEqualMatrixException {


        ArrayList<Integer> firstElementA = A.get(0);
        ArrayList<Integer> firstElementB = B.get(0);
        int colsA = firstElementA.size();
        int rowsA = A.size();
        int colsB = firstElementB.size();
        int rowsB = B.size();
        if (colsA != colsB || rowsA != rowsB) {
            System.out.println("Matrices are NOT equal!");
            System.out.println("Matrix A rows: "+rowsA+" and Matrix B rows: "+rowsB);
            System.out.println("Matrix A columns: "+colsA+" and Matrix B columns: "+colsB);
            throw new NotEqualMatrixException(A.size(), B.size());
        }

        int[][] C = new int[rowsA][colsA];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                    C[i][j] += A.get(i).get(j) + B.get(i).get(j);
            }
        }
        return C;
    }

}
