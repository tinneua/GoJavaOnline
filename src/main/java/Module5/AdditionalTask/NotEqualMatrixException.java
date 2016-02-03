package Module5.AdditionalTask;

public class NotEqualMatrixException extends Throwable {
    private int matrixA;
    private int matrixB;
    public NotEqualMatrixException(int size, int size1) {
        matrixA = size;
        matrixB = size1;
    }
    public String getMatricesSize() {
        return "Matrix A is "+matrixA+" matrixB is "+matrixB;
    }
}
