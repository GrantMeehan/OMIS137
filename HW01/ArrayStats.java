import java.util.Scanner;
public class ArrayStats {
    public static void main(String[] args) {
        int [] array = getArrayInput();

        System.out.println("Array:");
        printArray(array);

        System.out.println("Array Stats:");

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min)
                min = array[i];
        }
        System.out.println("min = " + min);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max)
                max = array[i];
        }
        System.out.println("max = " + max);

        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        System.out.println("average = " + total/array.length);
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
