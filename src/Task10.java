public class Task10 {
    public static void main(String[] args) {
        int[][] a = {
                {0, 2, 3},
                {4, 0, 6},
                {0, 8, 0}
        };
        int zeros = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 0) zeros++;
            }
        }
        System.out.println("Zeros: " + zeros);
    }
}
