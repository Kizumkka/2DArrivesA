public class Task7 {
    public static void main(String[] args) {
        int[] a = {3, 8, 5, 2, 7, 4, 9, 6};
        int[] evens = new int[a.length];
        int n = 0;                       // сколько чётных скопировано

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evens[n] = a[i];
                n++;
            }
        }
        for (int i = 0; i < n; i++) {    // печатаем только скопированные
            System.out.print(evens[i] + " ");
        }
        System.out.println();
    }
}
