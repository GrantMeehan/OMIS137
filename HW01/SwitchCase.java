import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);

        System.out.print("Enter a month: ");
        String monthInput = readInput.nextLine();

        switch (monthInput) {
            case "January", "january", "Jan", "jan", "February", "february", "Feb", "feb", "December", "december", "Dec", "dec":
                System.out.println(monthInput + " is in the Winter");
                break;
            case "March", "march", "Mar", "mar", "April", "april", "Apr", "apr", "May", "may":
                System.out.println(monthInput + " is in the Spring");
                break;
            case "June", "june", "Jun", "jun", "July", "july", "Jul", "jul", "August", "august", "Aug", "aug":
                System.out.println(monthInput + " is in the Summer.");
                break;
            case "September", "september", "Sep", "sep", "October", "october", "Oct", "oct", "November", "november", "Nov", "nov":
                System.out.println(monthInput + " is in the Fall.");
                break;
            default:
                System.out.println("Next time, please enter a month.");
                break;
        }
    }
}
