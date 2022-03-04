import java.util.Random;

public class Ant extends Organism {

    public Ant(int x, int y){
        this.symbol = 'O';
        this.xPos = x;
        this.yPos = y;
    }

    @Override
    public void move(World world) {
        Organism[][] grid = world.getGrid();
        Random rand = new Random();
        int randInt = rand.nextInt(4);
        this.movedThisTurn = true;
        this.turnsSurvived += 1;
        switch (randInt) {
            case 0: //up
                if (this.yPos > 0)
                    if (grid[this.yPos - 1][this.xPos] == null) {
                        grid[this.yPos - 1][this.xPos] = this;
                        grid[this.yPos][this.xPos] = null;
                        this.yPos -= 1;
                    }
            case 1: //right
                if (this.xPos < 19)
                    if (grid[this.yPos][this.xPos + 1] == null) {
                        grid[this.yPos][this.xPos + 1] = this;
                        grid[this.yPos][this.xPos] = null;
                        this.xPos += 1;
                    }
            case 2: //down
                if (this.yPos < 19)
                    if (grid[this.yPos + 1][this.xPos] == null) {
                        grid[this.yPos + 1][this.xPos] = this;
                        grid[this.yPos][this.xPos] = null;
                        this.yPos += 1;
                    }
            case 3: //left
                if (this.xPos > 0)
                    if (grid[this.yPos][this.xPos - 1] == null) {
                        grid[this.yPos][this.xPos - 1] = this;
                        grid[this.yPos][this.xPos] = null;
                        this.xPos -= 1;
                    }
        }
        world.setGrid(grid);
    }

    @Override
    public void breed(World world) {
        Organism[][] grid = world.getGrid();
        if(turnsSurvived >= 3) {
            if(this.yPos > 0 && grid[this.yPos - 1][this.xPos] == null) { //up
                grid[this.yPos - 1][this.xPos] = new Ant(this.xPos,this.yPos - 1);
            }
            else if(this.xPos < 19 && grid[this.yPos][this.xPos + 1] == null) { //right
                grid[this.yPos][this.xPos + 1] = new Ant(this.xPos + 1,this.yPos);
            }
            else if(this.yPos < 19 && grid[this.yPos + 1][this.xPos] == null) { //down
                grid[this.yPos + 1][this.xPos] = new Ant(this.xPos,this.yPos + 1);
            }
            else if(this.xPos > 0 && grid[this.yPos][this.xPos - 1] == null) { //left
                grid[this.yPos][this.xPos - 1] = new Ant(this.xPos - 1,this.yPos);
            }
            turnsSurvived = 0;
        }
        world.setGrid(grid);
    }
}
