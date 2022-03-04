import java.util.Random;

public class Doodlebug extends Organism {

    protected int starveCounter;

    public Doodlebug(int x, int y){
        this.symbol = 'X';
        this.xPos = x;
        this.yPos = y;
        starveCounter = 0;
    }

    @Override
    public void move(World world) {
        Organism[][] grid = world.getGrid();
        Random rand = new Random();
        int randInt = rand.nextInt(4);
        this.movedThisTurn = true;
        this.turnsSurvived += 1;

        if(randInt == 0 && this.yPos > 0 && grid[this.yPos - 1][this.xPos] != null && grid[this.yPos - 1][this.xPos].getSymbol() == 'O') //up
        {
            grid[this.yPos - 1][this.xPos] = this;
            grid[this.yPos][this.xPos] = null;
            this.yPos -= 1;
            this.starveCounter = 0;
        }
        else if(randInt == 1 && this.xPos < 19 && grid[this.yPos][this.xPos + 1] != null && grid[this.yPos][this.xPos + 1].getSymbol() == 'O') //right
        {
            grid[this.yPos][this.xPos + 1] = this;
            grid[this.yPos][this.xPos] = null;
            this.xPos += 1;
            this.starveCounter = 0;
        }
        else if(randInt == 2 && this.yPos < 19 && grid[this.yPos + 1][this.xPos] != null && grid[this.yPos + 1][this.xPos].getSymbol() == 'O') //down
        {
            grid[this.yPos + 1][this.xPos] = this;
            grid[this.yPos][this.xPos] = null;
            this.yPos += 1;
            this.starveCounter = 0;
        }
        else if(randInt == 3 && this.xPos > 0 && grid[this.yPos][this.xPos - 1] != null && grid[this.yPos][this.xPos - 1].getSymbol() == 'O') //left
        {
            grid[this.yPos][this.xPos - 1] = this;
            grid[this.yPos][this.xPos] = null;
            this.xPos -= 1;
            this.starveCounter = 0;
        }
        else {
            switch (randInt) {
                case 0: //up
                    this.starveCounter += 1;
                    if (this.starveCounter >= 3)
                        grid[this.yPos][this.xPos] = null;
                    if (this.yPos > 0)
                        if (grid[this.yPos - 1][this.xPos] == null) {
                            grid[this.yPos - 1][this.xPos] = this;
                            grid[this.yPos][this.xPos] = null;
                            this.yPos -= 1;
                        }
                case 1: //right
                    this.starveCounter += 1;
                    if (this.starveCounter >= 3)
                        grid[this.yPos][this.xPos] = null;
                    if (this.xPos < 19)
                        if (grid[this.yPos][this.xPos + 1] == null) {
                            grid[this.yPos][this.xPos + 1] = this;
                            grid[this.yPos][this.xPos] = null;
                            this.xPos += 1;
                        }
                case 2: //down
                    this.starveCounter += 1;
                    if (this.starveCounter >= 3)
                        grid[this.yPos][this.xPos] = null;
                    if (this.yPos < 19)
                        if (grid[this.yPos + 1][this.xPos] == null) {
                            grid[this.yPos + 1][this.xPos] = this;
                            grid[this.yPos][this.xPos] = null;
                            this.yPos += 1;
                        }
                case 3: //left
                    this.starveCounter += 1;
                    if (this.starveCounter >= 3)
                        grid[this.yPos][this.xPos] = null;
                    if (this.xPos > 0)
                        if (grid[this.yPos][this.xPos - 1] == null) {
                            grid[this.yPos][this.xPos - 1] = this;
                            grid[this.yPos][this.xPos] = null;
                            this.xPos -= 1;
                        }
            }
        }
        world.setGrid(grid);
    }

    @Override
    public void breed(World world) {
        Organism[][] grid = world.getGrid();
        if(turnsSurvived >= 8) {
            if(this.yPos > 0 && grid[this.yPos - 1][this.xPos] == null) { //up
                grid[this.yPos - 1][this.xPos] = new Doodlebug(this.xPos,this.yPos - 1);
                turnsSurvived = 0;
            }
            else if(this.xPos < 19 && grid[this.yPos][this.xPos + 1] == null) { //right
                grid[this.yPos][this.xPos + 1] = new Doodlebug(this.xPos + 1,this.yPos);
                turnsSurvived = 0;
            }
            else if(this.yPos < 19 && grid[this.yPos + 1][this.xPos] == null) { //down
                grid[this.yPos + 1][this.xPos] = new Doodlebug(this.xPos,this.yPos + 1);
                turnsSurvived = 0;
            }
            else if(this.xPos > 0 && grid[this.yPos][this.xPos - 1] == null) { //left
                grid[this.yPos][this.xPos - 1] = new Doodlebug(this.xPos - 1,this.yPos);
                turnsSurvived = 0;
            }
        }
        world.setGrid(grid);
    }
}
