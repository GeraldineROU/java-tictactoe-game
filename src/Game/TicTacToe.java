package Game;

import java.util.Objects;

public class TicTacToe {

    private int size = 3;
    private Cell[][] board;
    private Player player;
    private int turnNumber = 1;

    public TicTacToe() {
        this.size = size;
        this.board = new Cell[size][size];
        this.player = new Player();
        initializeBoard();
    }

    private void initializeBoard() {
        for (int line = 0; line < size; line++) {
            for (int col = 0; col < size; col++) {
                board[line][col] = new Cell();
            }
        }
    }


    private void displaySeparationLine() {
        System.out.println("-------------");
    }

    private void displayOneCell(Cell cell) {
        String cellContent = cell.getRepresentation();
        System.out.print("|");
        System.out.print(cellContent);
    }

    private void displayStartingGame() {
        System.out.println("Welcome to Tic-Tac-Toe!");
        displayGameBoard();
    }


    public void displayGameBoard() {
        for (int i = 0; i < board[0].length; i++) {
            displaySeparationLine();
            for (int j = 0; j < board[1].length; j++) {
                displayOneCell(board[i][j]);
            }
            System.out.println("|");
        }
        displaySeparationLine();
    }

    private boolean isCellInBoardBounds(int rowNumber, int colNumber) {
        if (rowNumber < 0 || rowNumber >= size || colNumber < 0 || colNumber >= size) {
            System.out.println("Row position or column position is out of bounds !");
            return false;
        } else {
            return true;
        }
    }

    public int[] getMoveFromPlayer(int[] playerChoice) {
        int rowNumber = playerChoice[0];
        int columnNumber = playerChoice[1];

        if (!isCellInBoardBounds(rowNumber, columnNumber)) {
            System.out.println("Invalid move !!!");
            player.getPlayerChoice();
        } else {
            int[] playerMove = playerChoice;
            return playerMove;
        }
    }


    public void setOwner(int[] playerMove) {
        int rowNumber = playerMove[0];
        System.out.println("row number = " + rowNumber);
        int columnNumber = playerMove[1];
        System.out.println("column number = " + columnNumber);

        //dans la cell, je mets la croix du joueur
        if(board[rowNumber][columnNumber].isEmpty()) {
            board[rowNumber][columnNumber].setRepresentation(player);
        } else {
            //peut pas jouer sur cette case
            System.out.println("The cell you want to play has already been played!");
            //redemande une case
            player.getPlayerChoice();
        }



    }

    public void playOneRound() {
        System.out.println("Turn number = " + turnNumber);
        int[] playerChoice = player.getPlayerChoice();
        System.out.println("player choice is : row " + playerChoice[0] + " and column " + playerChoice[1]);
        int[]playerMove = this.getMoveFromPlayer(playerChoice);
        System.out.println("player move is : row " + playerMove[0] + " and column " + playerMove[1]);
        this.setOwner(playerMove);
        this.displayGameBoard();
        turnNumber++;
    }

    public void playGame() {
        displayStartingGame();
        playOneRound();
    }

}
