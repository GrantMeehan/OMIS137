import java.util.Scanner;
public class ArraysEqual {
    public static void main(String[] args) {

        System.out.println("ARRAY 1:");
        int [] array1 = getArrayInput();

        System.out.println();

        System.out.println("ARRAY 2:");
        int [] array2 = getArrayInput();

        System.out.println();

        System.out.println("ARRAY 1:");
        printArray(array1);

        System.out.println("ARRAY 2:");
        printArray(array2);

        int len;
        if (array1.length <= array2.length) {
            len = array1.length;
        }
        else
            len = array2.length;

        for (int i = 0; i < len; i++) {
            if (array1[i] != array2[i]) {
                System.out.println("First index where arrays differ: " + i);
                i = len;
            }
            else if ((array1.length == array2.length) && (array1[i] == array2[i]) && (i == len - 1))
                System.out.println("Arrays are the same");
        }
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
