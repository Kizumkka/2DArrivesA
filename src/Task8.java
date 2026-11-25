public class Task8 {
    public static void main(String[] args) {
        int[] t = {18, 20, 22, 19, 21, 24, 16};
        int sum = 0;
        for (int i = 0; i < t.length; i++) {
            sum += t[i];
        }
        double avg = (double) sum / t.length;

        int above = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] > avg) above++;
        }
        System.out.println("Average: " + avg + "; above: " + above);
    }
}
