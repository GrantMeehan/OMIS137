import java.util.Scanner;

public class SimulationTest {
    public static void main(String[] args) {
        World grid = new World(20,20, 100, 5);

        System.out.println("Press enter to progress a step.");
        System.out.println("Enter 'Done' and hit enter to end the simulation");
        System.out.println();

        System.out.println("Starting World:");
        grid.displayGrid();

        int turn = 1;

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        while(!input.equalsIgnoreCase("done")) {
            grid.moveGrid();
            grid.breedGrid();
            System.out.println("After turn "+ turn + ":");
            grid.displayGrid();
            turn++;
            if(sc.hasNextLine())
                input = sc.nextLine();
        }
    }
}
