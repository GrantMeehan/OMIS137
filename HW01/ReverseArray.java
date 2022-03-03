import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        int [] array = getArrayInput();
        int [] reverseArray = new int[array.length];

        int count = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[count] = array[i];
            count++;
        }

        System.out.println("Original Array:");
        printArray(array);
        System.out.println("Reversed Array:");
        printArray(reverseArray);
    }

    private static void printArray(int [] array) {
        for (int i:array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int[] getArrayInput() {
        Scanner input = new Scanner(System.in);
        int [] userArray = {};
        boolean repeat = true;

        System.out.println("Enter an array of numbers, hitting enter after each number. Enter -1 when done.");
        while (repeat) {
            int value = input.nextInt();
            if (value == -1)
                repeat = false;
            else {
                int len = userArray.length;
                int tempArray[] = new int[len + 1];
                for (int i=0; i < len; i++) {
                    tempArray[i] = userArray[i];
                }
                tempArray[len] = value;
                userArray = tempArray;
            }

        }
        return userArray;
    }
}
