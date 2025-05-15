package dmitry;

public class Task11 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sumOfEven = sum(array);
        System.out.println(sumOfEven);
    }
    public static int sum(int[] array){
        if (array == null || array.length == 0){
            return 0;
        }
        int sum = 0;
        for (int num : array) {
            if (num % 2 == 0){
                sum += num;
            }
        }
        return sum;
    }
}
