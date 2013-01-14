import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

public void solveSudoku(char[][] board) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Queue<Position> blanks = new LinkedList<Position>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    blanks.add(new Position(i, j));
                }
            }
        }
        
        solveHelper(board, blanks);

    }

    public boolean solveHelper(char[][] board, Queue<Position> blanks) {
        if (blanks.isEmpty()) {
            return true;
        }

        Position p = blanks.remove();
        ArrayList<Integer> possibles = getPossibleNumbers(board, p);

        
        if (possibles.size() == 0)
            return false;

        for (Integer i : possibles) {
            char e = (char) ('0' + i);
            board[p.row][p.col] = e;
            Queue<Position> newBlanks = new LinkedList<Position>(blanks);
            boolean flag = solveHelper(board, newBlanks);
            if (flag) {
                return true;
            } else{
                board[p.row][p.col] = '.';
            }
        }
        
        return false;
    }

    public ArrayList<Integer> getPossibleNumbers(char[][] board, Position p) {
        int i = p.row;
        int j = p.col;

        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int k = 1; k <= board.length; k++) {
            result.add(k);
        }

        for (int k = 0; k < board.length; k++) {
            if (board[k][j] != '.') {
                Integer used = board[k][j] - '0';
                if (result.contains(used)) {
                    result.remove(used);
                }
            }
        }

        for (int k = 0; k < board[0].length; k++) {
            if (board[i][k] != '.') {
                Integer used = board[i][k] - '0';
                if (result.contains(used)) {
                    result.remove(used);
                }
            }
        }

        return result;
    }

}

class Position {
    int row, col;

    public Position(int x, int y) {
        row = x;
        col = y;
    }
}