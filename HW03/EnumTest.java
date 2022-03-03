import java.util.ArrayList;
import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {

        Person washington = new Person("George Washington", Month.FEB, Day.TWENTYTWO, 1732);
        Person adams = new Person("John Adams", Month.OCT, Day.THIRTY, 1735);
        Person jefferson = new Person("Thomas Jefferson", Month.APR, Day.THIRTEEN, 1743);
        Person madison = new Person("James Madison", Month.MAR, Day.SIXTEEN, 1751);
        Person monroe = new Person("James Monroe", Month.APR, Day.TWENTYEIGHT, 1758);
        Person jackson = new Person("Andrew Jackson", Month.MAR, Day.FIFTEEN, 1767);
        Person vanBuren = new Person("Martin Van Buren", Month.DEC, Day.FIVE, 1782);
        Person harrison = new Person("William Henry Harrison", Month.FEB, Day.NINE, 1773);
        Person tyler = new Person("John Tyler", Month.MAR, Day.TWENTYNINE, 1790);
        Person polk = new Person("James Polk", Month.NOV, Day.TWO, 1795);

        Person [] presidents = {washington, adams, jefferson, madison, monroe, jackson, harrison, vanBuren, tyler, polk};

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = input.next();

        System.out.print("Enter birth month (numerically 1-12): ");
        Month userBirthMonth;
        switch (input.nextInt()){
            case 1 -> userBirthMonth = Month.JAN;
            case 2 -> userBirthMonth = Month.FEB;
            case 3 -> userBirthMonth = Month.MAR;
            case 4 -> userBirthMonth = Month.APR;
            case 5 -> userBirthMonth = Month.MAY;
            case 6 -> userBirthMonth = Month.JUN;
            case 7 -> userBirthMonth = Month.JUL;
            case 8 -> userBirthMonth = Month.AUG;
            case 9 -> userBirthMonth = Month.SEP;
            case 10 -> userBirthMonth = Month.OCT;
            case 11 -> userBirthMonth = Month.NOV;
            case 12 -> userBirthMonth = Month.DEC;
            default -> userBirthMonth = null;
        }

        System.out.print("Enter birth day (1-31): ");
        Day userBirthDay;
        switch (input.nextInt()){
            case 1 -> userBirthDay = Day.ONE;
            case 2 -> userBirthDay = Day.TWO;
            case 3 -> userBirthDay = Day.THREE;
            case 4 -> userBirthDay = Day.FOUR;
            case 5 -> userBirthDay = Day.FIVE;
            case 6 -> userBirthDay = Day.SIX;
            case 7 -> userBirthDay = Day.SEVEN;
            case 8 -> userBirthDay = Day.EIGHT;
            case 9 -> userBirthDay = Day.NINE;
            case 10 -> userBirthDay = Day.TEN;
            case 11 -> userBirthDay = Day.ELEVEN;
            case 12 -> userBirthDay = Day.TWELVE;
            case 13 -> userBirthDay = Day.THIRTEEN;
            case 14 -> userBirthDay = Day.FOURTEEN;
            case 15 -> userBirthDay = Day.FIFTEEN;
            case 16 -> userBirthDay = Day.SIXTEEN;
            case 17 -> userBirthDay = Day.SEVENTEEN;
            case 18 -> userBirthDay = Day.EIGHTEEN;
            case 19 -> userBirthDay = Day.NINETEEN;
            case 20 -> userBirthDay = Day.TWENTY;
            case 21 -> userBirthDay = Day.TWENTYONE;
            case 22 -> userBirthDay = Day.TWENTYTWO;
            case 23 -> userBirthDay = Day.TWENTYTHREE;
            case 24 -> userBirthDay = Day.TWENTYFOUR;
            case 25 -> userBirthDay = Day.TWENTYFIVE;
            case 26 -> userBirthDay = Day.TWENTYSIX;
            case 27 -> userBirthDay = Day.TWENTYSEVEN;
            case 28 -> userBirthDay = Day.TWENTYEIGHT;
            case 29 -> userBirthDay = Day.TWENTYNINE;
            case 30 -> userBirthDay = Day.THIRTY;
            case 31 -> userBirthDay = Day.THIRTYONE;
            default -> userBirthDay = null;
        }

        System.out.print("Enter birth year: ");
        int userBirthYear = input.nextInt();
        System.out.println();

        if(userBirthMonth == null || userBirthDay == null) {
            System.out.println("Please retry with entries within the given parameters.");
            System.exit(1);
        }

        Person user = new Person(userName, userBirthMonth, userBirthDay, userBirthYear);

        System.out.println("Welcome " + user.getName() + ".");
        System.out.println("The birthday you entered is: " + user.getBirthMonth().toString() + "/" +
                user.getBirthDay().toString() + "/" + user.getBirthYear());
        System.out.println();

        ArrayList<Person> matches = new ArrayList<>();

        for (Person p:presidents) {
            if (p.getBirthMonth() == user.getBirthMonth()) {
                matches.add(p);
            }
        }
        if (!matches.isEmpty()) {
            System.out.println("You have the same birth month as:");
            for (Person m:matches) {
                System.out.println(m.getName());
            }
            System.out.println();
            System.out.println("With them, you were born the following years apart:");
            for (Person m:matches) {
                System.out.println(m.getName() + ": " + Math.abs(m.getBirthYear()-user.getBirthYear()) + " years apart");
            }
        }
        else {
            System.out.println("You do not share a birth month with any of the presidents in our system.");
            ArrayList<Integer> monthDiff = new ArrayList<>();
            for (Person p:presidents) {
                monthDiff.add(Math.abs(p.getBirthMonth().getMonthNum() - user.getBirthMonth().getMonthNum()));
            }
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int i: monthDiff) {
                if (i < min) {
                    min = i;
                    minIndex = monthDiff.indexOf(i);
                }
            }
            System.out.println("However, your birth date of " + user.getBirthMonth().toString() + "/" +
                    user.getBirthDay().toString() + " is closest to: " + presidents[minIndex].getName() + ".");
            System.out.println("Their birthday is: " + presidents[minIndex].getBirthMonth().toString() + "/" +
                    presidents[minIndex].getBirthDay().toString() + "/" + presidents[minIndex].getBirthYear() + ".");
        }
    }
}
