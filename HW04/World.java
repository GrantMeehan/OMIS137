import java.util.Arrays;
import java.util.Random;

public class World {
    private Organism [][] grid;
    private int x;
    private int y;
    private int numAnts;
    private int numDoodlebugs;

    public World(int x, int y, int numAnts, int numDoodlebugs){
        grid = new Organism[y][x];
        for (int i = 0; i < grid.length; i++) {
            Arrays.fill(grid[i], null);
        }
        Random random = new Random();
        while (numAnts > 0) {
            int randX = random.nextInt(x);
            int randY = random.nextInt(y);

            if (grid[randY][randX] == null) {
                grid[randY][randX] = new Ant(randX, randY);
                numAnts--;
            }
        }
        while (numDoodlebugs > 0) {
            int randX = random.nextInt(x);
            int randY = random.nextInt(y);

            if (grid[randY][randX] == null) {
                grid[randY][randX] = new Doodlebug(randX, randY);
                numDoodlebugs--;
            }
        }
        this.x = x;
        this.y = y;
        this.numAnts = numAnts;
        this.numDoodlebugs = numDoodlebugs;
    }

    public void displayGrid() {
        for (int i = 0; i < this.x * 2 + 3; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < grid.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != null)
                    System.out.print(grid[i][j].getSymbol() + " ");
                else
                    System.out.print("  ");
            }
            System.out.println("| ");
        }
        for (int i = 0; i < this.x * 2 + 3; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public void moveGrid() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != null)
                    grid[i][j].movedThisTurn = false;
            }
        }

        for (int i = 0; i < grid.length; i++) { //move doodlebugs first
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != null && grid[i][j].getSymbol() == 'X' && !grid[i][j].hasMovedThisTurn())
                    grid[i][j].move(this);
            }
        }

        for (int i = 0; i < grid.length; i++) { //move ants last
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != null && grid[i][j].getSymbol() == 'O' && !grid[i][j].hasMovedThisTurn())
                    grid[i][j].move(this);
            }
        }
    }

    public void breedGrid() {
        for (int i = 0; i < grid.length; i++) { //breed doodlebugs first
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] != null && grid[i][j].getSymbol() == 'X')
                    grid[i][j].breed(this);
            }
        }

        for (int i = 0; i < grid.length; i++) { //breed ants second
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] != null && grid[i][j].getSymbol() == 'O')
                    grid[i][j].breed(this);
            }
        }
    }

    public Organism[][] getGrid() {
        return grid;
    }

    public void setGrid(Organism[][] grid) {
        this.grid = grid;
    }
}
