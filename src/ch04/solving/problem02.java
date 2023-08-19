package ch04.solving;

public class problem02 {
    public static void main(String[] args) {
        String grade = "B";

        int score = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result; // 블럭 내에서 결과값을 반환하기 위해 yield 사용
            }
            default -> 60;
        };
        System.out.println(score);
    }
}
