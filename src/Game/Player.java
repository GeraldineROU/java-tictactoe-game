package Game;

import java.util.Scanner;

public class Player {

    private final String mark = " X ";

    protected String getMark() {
        return this.mark;
    }

    public int[] getPlayerChoice() {
        Scanner scanner = new Scanner(System.in);
        //demande à quelle ligne jouer
        System.out.println("Please choose a row to play (number between 0 and 2)");
        String rowNumberChoice = scanner.nextLine();
        int rowNumber = Integer.parseInt(rowNumberChoice);
        //demande à quelle colonne jouer
        System.out.println("Please choose a column to play (number between 0 and 2)");
        String colNumberChoice = scanner.nextLine();
        int colNumber = Integer.parseInt(colNumberChoice);
        //retourne la paire
        int[] playerChoice = {rowNumber, colNumber};
        return playerChoice;
    }
}
