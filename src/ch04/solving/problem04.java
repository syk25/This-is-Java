package ch04.solving;

public class problem04 {
    public static void main(String[] args) {
        int sum = 0;
        while (true) {
            int eye1 = (int) (Math.random() * 6) + 1;
            int eye2 = (int) (Math.random() * 6) + 1;
            sum = eye1 + eye2;
            System.out.printf("(%d, %d)", eye1, eye2);
            System.out.println();
            if (sum == 5) {
                break;
            }
        }
    }
}
