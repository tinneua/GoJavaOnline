package Module5.AdditionalTask;

import java.util.ArrayList;

public class MatrixMultiply {
    static int[][] matrixMultiply (ArrayList<ArrayList<Integer>> A,
                                   ArrayList<ArrayList<Integer>> B) throws NotEqualMatrixException {

        ArrayList<Integer> firstElementA = A.get(0);
        ArrayList<Integer> firstElementB = B.get(0);
        int colsA = firstElementA.size();
        int rowsA = A.size();
        int colsB = firstElementB.size();
        int rowsB = B.size();
        if (rowsA != colsB || colsA != rowsB) {
            System.out.println("[ERROR]Matrices can NOT be calculated!");
            System.out.println("Matrix A rows: "+rowsA+" and Matrix B columns: "+colsB);
            System.out.println("Matrix B rows: "+rowsB+" and Matrix A columns: "+colsA);
            throw new NotEqualMatrixException(A.size(), B.size());
        }

        int[][] C = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    C[i][j] += A.get(i).get(k) * B.get(k).get(j);
                }
            }
        }
        return C;
    }
}
