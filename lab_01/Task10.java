package dmitry;

public class Task10 {
    public static void main(String[] args) {
        int[] array = {123,22, 54, 121, 212};
        int max = max(array);
        System.out.println("Maximal array value: " + max);
    }

    public static int max (int[] array) {
        int max = Integer.MIN_VALUE;
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
