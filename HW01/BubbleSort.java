import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        int [] userArray = {};
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an array of numbers, hitting enter after each number. Enter -1 when done.");

        boolean repeat = true;
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
        System.out.println("User array pre-sorted:");
        printArray(userArray);

        System.out.println();
        userArray = bubbleSort(userArray);

        System.out.println("User array post-sort:");
        printArray(userArray);
    }

    private static void printArray(int [] array) {
        for (int i:array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int[] bubbleSort(int array[]) {
        int len = array.length;

        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < len-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
