package ch05.sec06;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[]{83, 90, 87};
        int sum1 = 0;
        for (int e : scores) {
            sum1 += e;
        }
        System.out.println("총합: " + sum1);

        printItem(new int[]{83, 90, 87}); // 메서드 호출 : 메서드를 실행하다
    }
    public static void printItem(int[] scores){ // 메서드 선언 : 메서드를 만들다
        for (int i : scores) {
            System.out.println("score: " + i);
        }
    }
}
