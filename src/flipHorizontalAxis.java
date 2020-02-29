public class flipHorizontalAxis {

    public static void flipHorizontalMatrix (int[][] matrix) {
        int left = 0;
        int right = matrix.length - 1;

        while (left < right) {
            swapArrays(matrix, left++, right--);
        }
    }

    private static void swapArrays (int[][] matrix, int leftMatrix, int rightMatrix) {
        int[] temp = matrix[leftMatrix];
        matrix[leftMatrix] = matrix[rightMatrix];
        matrix[rightMatrix] = temp;
    }
}
