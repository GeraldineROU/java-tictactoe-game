package Game;

import java.lang.reflect.Array;

public class TicTacToe {

    private final int size = 3;
    private Cell[][] board = new Cell[size][size];

    private String getCellContent() {
        Cell cell = new Cell();
        String cellContent = cell.getRepresentation();
        return cellContent;
    }

    private void displaySeparationLine() {
        System.out.println("-------------");
    }

    private void displayOneCell() {
        String cellContent = getCellContent();
        System.out.print("|");
        System.out.print(cellContent);
    }


    public void display() {

        for (int i = 0; i < board[0].length; i++) {
            displaySeparationLine();
            for (int j = 0; j < board[1].length; j++) {
                displayOneCell();
            }
            System.out.println("|");
        }
        displaySeparationLine();

    }
}
