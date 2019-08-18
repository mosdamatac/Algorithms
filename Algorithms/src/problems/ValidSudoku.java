package problems;

import java.util.*;

/**
 * 
 * @author Mara
 * Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * 	- Each row must contain the digits 1-9 without repetition.
 * 	- Each column must contain the digits 1-9 without repetition.
 * 	- Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'
 * 
 * 
 * STILL NEEDS TO BE OPTIMIZED!!
 *
 */
public class ValidSudoku {

	public static void main(String[] args) {
		ValidSudoku myClass = new ValidSudoku();
		char[][] board = {
			{'5','3','.','.','7','.','.','.','.'},
			{'6','.','.','1','9','5','.','.','.'},
			{'.','9','8','.','.','.','.','6','.'},
			{'8','.','.','.','6','.','.','.','3'},
			{'4','.','.','8','.','3','.','.','1'},
			{'7','.','.','.','2','.','.','.','6'},
			{'.','6','.','.','.','.','2','8','.'},
			{'.','.','.','4','1','9','.','.','5'},
			{'.','.','.','.','8','.','.','7','9'}
		};
		myClass.isValidSudoku(board);

	}
	
	public boolean isValidSudoku(char[][] board) {        
        for (int i = 0; i < board.length; i++) {
            if (!isRowValid(board, i) || !isColumnValid(board, i) || !isSubBoxValid(board, i)) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean isRowValid(char[][] board, int index) {
        Set<Character> row = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            if (board[index][i] == '.') 
                continue;
            if (row.contains(board[index][i])) { return false; }
            row.add(board[index][i]);
        }
        
        return true;
    }
    
    private boolean isColumnValid(char[][] board, int index) {
        Set<Character> column = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            if (board[i][index] == '.') 
                continue;
            if (column.contains(board[i][index])) { return false; }
            column.add(board[i][index]);
        }
        
        return true;
    }
    
    private boolean isSubBoxValid(char[][] board, int index) {
        Set<Character> subBox = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            int row = (index % 3) * 3 + i;
            for (int k = 0; k < 3; k++) {
                int col = (index / 3) * 3 + k;
                if (board[row][col] == '.') 
                    continue;
                if(subBox.contains(board[row][col])) { return false; }
                subBox.add(board[row][col]);
            }
        }
        
        return true;
    }

}
