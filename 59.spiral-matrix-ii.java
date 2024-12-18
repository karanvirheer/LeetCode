/*
 * @lc app=leetcode id=59 lang=java
 *
 * [59] Spiral Matrix II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int startCol = 0;
        int startRow = 0;
        int endCol = n - 1;
        int endRow = n - 1;
        int dir = 0;
        int num = 1;

        int[][] matrix = new int[n][n];

        while (startCol <= endCol && startRow <= endRow) {
            switch (dir) {
                // RIGHT
                case 0:
                    for (int col = startCol; col <= endCol; col++) {
                        matrix[startRow][col] = num;
                        num++;
                    }
                    startRow++;
                    break;
                // DOWN
                case 1:
                    for (int row = startRow; row <= endRow; row++) {
                        matrix[row][endCol] = num;
                        num++;
                    }
                    endCol--;
                    break;
                // LEFT
                case 2:
                    for (int col = endCol; col >= startCol; col--) {
                        matrix[endRow][col] = num;
                        num++;
                    }
                    endRow--;
                    break;
                // UP
                case 3:
                    for (int row = endRow; row >= startRow; row--) {
                        matrix[row][startCol] = num;
                        num++;
                    }
                    startCol++;
                    break;
            }
            dir = (dir + 1) % 4;
        }
        return matrix;
    }
}
// @lc code=end
