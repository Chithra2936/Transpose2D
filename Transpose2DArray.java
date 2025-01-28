public class Transpose2DArray {
    public static void main(String[] args) {
        // Define a 2D array
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print original array
        System.out.println("Original Array:");
        printArray(array);

        // Transpose array
        int[][] transposedArray = transpose(array);

        // Print transposed array
        System.out.println("Transposed Array:");
        printArray(transposedArray);
    }

    // Method to transpose a 2D array
    public static int[][] transpose(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;

        // Create a new 2D array with swapped dimensions
        int[][] transposedArray = new int[cols][rows];

        // Copy elements from original array to transposed array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedArray[j][i] = array[i][j];
            }
        }

        return transposedArray;
    }

    // Method to print a 2D array
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}