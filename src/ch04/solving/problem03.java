package ch04.solving;

public class problem03 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                if (i % 3 == 0) {
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}
