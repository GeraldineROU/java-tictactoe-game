package Game;

public class Cell {
    private String representation = "   ";

    public String getRepresentation() {
        return representation;
    }

    public void setRepresentation(Player player) {
        this.representation = player.getMark();
    }

    public boolean isEmpty() {
        return representation.equals("   ");
    }



}


