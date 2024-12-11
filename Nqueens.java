class Nqueens {
    // function to check three condition vertical,leftDiagonal,rightDiagonal
    public static boolean isSafe(char board[][], int row, int col) {
        // check vertical - rwo dec only
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // check left-Diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // check right Diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j <= board.length-1; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void solveNqueens(char board[][], int row) {
        // base case
        if (board.length == row) {
            System.out.println("---------------board-------------------------");
            printBoard(board);
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                solveNqueens(board, row + 1);
                board[row][j] = 'X';// while backtrack we have to make placed char as empty
            }
        }
    }

    public static void main(String args[]) {
        // board declaration and initialization
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }

        // calling nqueens
        solveNqueens(board, 0);
    }

}
