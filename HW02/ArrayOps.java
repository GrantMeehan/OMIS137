public class ArrayOps {
    public static double avg(int[] array) {
        int avg;
        int total = 0;
        for (int i:array) {
            total += i;
        }
        avg = total/array.length;
        return avg;
    }

    public static int min(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i:array) {
            if (i < min)
                min = i;
        }
        return min;
    }

    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i:array) {
            if (i > max)
                max = i;
        }
        return max;
    }
}
