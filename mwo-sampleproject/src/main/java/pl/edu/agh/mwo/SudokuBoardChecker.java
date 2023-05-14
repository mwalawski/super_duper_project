package pl.edu.agh.mwo;

import java.util.HashSet;
import java.util.Set;

public class SudokuBoardChecker {

    public boolean verifyBoard(SudokuBoard sudokuBoard) {
        return verifySize(sudokuBoard) && verifyValues(sudokuBoard) && verifyRows(sudokuBoard)
                && verifyColumns(sudokuBoard) && verifySquares(sudokuBoard);
    }

    private boolean verifySize(SudokuBoard sudokuBoard){
        int[][] board = sudokuBoard.getBoard();

        if(board.length != SudokuBoard.BOARD_SIZE){
            return false;
        }
        for (int row=0; row < board.length; row++) {
            if (board[row].length != SudokuBoard.BOARD_SIZE) {
                return false;
            }
        }
        return true;
    }

    private boolean verifyValues(SudokuBoard sudokuBoard){
        int[][] board = sudokuBoard.getBoard();

        for (int row=0; row < board.length; row++) {
            for (int column=0; column<board[row].length; column++){
                if (board[row][column]< SudokuBoard.MIN_VALUE || board[row][column]> SudokuBoard.MAX_VALUE) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean verifyRows(SudokuBoard sudokuBoard){
        int[][] board = sudokuBoard.getBoard();

        for (int row=0; row<board.length; row++) {
            Set<Integer> values = new HashSet<>();
            for (int column=0; column<board[row].length; column++){
                int value = board[row][column];
                if (value!=0 && values.contains(value)) {
                    return false;
                }else {
                    values.add(value);
                }
            }
        }
        return true;
    }

    private boolean verifyColumns(SudokuBoard sudokuBoard){
        int[][] board = sudokuBoard.getBoard();

        for (int column=0; column<board[0].length; column++){
            Set<Integer> values = new HashSet<>();
            for (int row=0; row<board.length; row++) {
                int value = board[row][column];
                if (value!=0 && values.contains(value)) {
                    return false;
                }else {
                    values.add(value);
                }
            }
        }
        return true;
    }

    private boolean verifySquares(SudokuBoard sudokuBoard){

        return false;
    }
}

