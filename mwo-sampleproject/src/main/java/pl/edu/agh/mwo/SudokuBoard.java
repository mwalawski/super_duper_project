package pl.edu.agh.mwo;

public class SudokuBoard {
    public static final int BOARD_SIZE = 9;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = BOARD_SIZE;

    private int[][] board;

    public SudokuBoard(int[][] board) {
        this.board = board;
    }

    public int[][] getBoard() {
        return board;
    }
}