public class Organism {
    protected char symbol;
    protected int xPos;
    protected int yPos;
    protected int turnsSurvived;
    protected boolean movedThisTurn;

    public void move(World grid){

    }

    public void breed(World grid){

    }

    public char getSymbol() {
        return symbol;
    }

    public boolean hasMovedThisTurn() {
        return movedThisTurn;
    }
}
