import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    void isSquareMatrix() {
        Matrix sMatrix = new Matrix();

        int[][] ints = new int[5][5];
        assertEquals(true, sMatrix.isSquareMatrix(ints));

    }

    @Test
    void isSquareMatrix2() {
        Matrix sMatrix = new Matrix();
        int[][] ints = new int[5][6];
        assertEquals(false, sMatrix.isSquareMatrix(ints));

    }

    @Test
    void isSquareMatrix3() {
        Matrix sMatrix = new Matrix();
        int[][] ints = new int[][]{{1, 2, 3, 4, 5}, {1, 2, 3, 4}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        assertEquals(false, sMatrix.isSquareMatrix(ints));

    }

    @Test
    void isSquareMatrix4() {
        Matrix sMatrix = new Matrix();
        int[][] ints = new int[0][0];
        assertEquals(true,sMatrix.isSquareMatrix(ints));

    }

    @Test
    void getAverageCountArray() {
        Matrix sArray = new Matrix();
        int[] ints1 = new int[4];
        assertEquals(0.0,sArray.getAverageCountArray(ints1));
    }
}
