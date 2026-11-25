public class Task2 {
    public static void main(String[] args) {
        int[] a = {3, -2, 0, 7, -4, 5, 1, -9, 2, 6};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) sum += a[i];
        }
        System.out.println("Sum: " + sum);
    }
}