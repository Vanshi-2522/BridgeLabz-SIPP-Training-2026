package dsa.Recursion_Backtracking;

public class WordSearch {

    public static boolean exists(char[][] grid,
                                 String word) {

        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];

        for (int r = 0; r < rows; r++) {

            for (int c = 0; c < cols; c++) {

                if (backtrack(grid, word,
                        0, r, c, visited))
                    return true;
            }
        }

        return false;
    }

    private static boolean backtrack(char[][] grid,
                                     String word,
                                     int index,
                                     int row,
                                     int col,
                                     boolean[][] visited) {

        if (index == word.length())
            return true;

        if (row < 0 || row >= grid.length ||
                col < 0 || col >= grid[0].length)
            return false;

        if (visited[row][col])
            return false;

        if (grid[row][col] != word.charAt(index))
            return false;

        visited[row][col] = true;

        boolean found =
                backtrack(grid, word,
                        index + 1, row + 1, col, visited)
                        ||
                backtrack(grid, word,
                        index + 1, row - 1, col, visited)
                        ||
                backtrack(grid, word,
                        index + 1, row, col + 1, visited)
                        ||
                backtrack(grid, word,
                        index + 1, row, col - 1, visited);

        visited[row][col] = false;

        return found;
    }

    public static void main(String[] args) {

        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        System.out.println(exists(board, "ABCCED"));
        System.out.println(exists(board, "SEE"));
        System.out.println(exists(board, "ABCB"));
    }
}
