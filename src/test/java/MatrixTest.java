import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    void isSquareMatrix() {
        Matrix sMatrix = new Matrix();

        int[][] ints = new int[5][5];
        assertTrue(sMatrix.isSquareMatrix(ints));

    }

    @Test
    void isSquareMatrix2() {
        Matrix sMatrix = new Matrix();
        int[][] ints = new int[5][6];
        assertFalse (sMatrix.isSquareMatrix(ints));

    }

    @Test
    void isSquareMatrix3() {
        Matrix sMatrix = new Matrix();
        int[][] ints = new int[][]{{1, 2, 3, 4, 5}, {1, 2, 3, 4}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        assertFalse(sMatrix.isSquareMatrix(ints));

    }

    @Test
    void isSquareMatrix4() {
        Matrix sMatrix = new Matrix();
        int[][] ints = null;
        assertFalse(sMatrix.isSquareMatrix(ints));

    }

    @Test
    void getAverageCountArray() {
        Matrix sArray = new Matrix();
        int[] ints1 = new int[]{1,2,3,4};
        assertEquals(2.5,sArray.getAverageCountArray(ints1));
    }
}
