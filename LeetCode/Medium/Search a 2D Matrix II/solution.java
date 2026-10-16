class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Edge case handle karo
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Start from Top-Right corner
        int row = 0;
        int col = cols - 1;

        // Jab tak hum matrix ke bounds mein hain
        while (row < rows && col >= 0) {
            int current = matrix[row][col];

            if (current == target) {
                return true; // Target mil gaya
            } else if (current > target) {
                col--; // Current bada hai, toh left jao (chote numbers ki taraf)
            } else {
                row++; // Current chota hai, toh neeche jao (bade numbers ki taraf)
            }
        }

        return false; // Target nahi mila
    }
}