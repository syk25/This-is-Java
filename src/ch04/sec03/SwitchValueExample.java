package ch04.sec03;

public class SwitchValueExample {
    public static void main(String[] args) {
        String grade = "B";


        // java 11 이전

        int score1 = 0;
        switch (grade) {
            case "A":
                score1 = 100;
                break;
            case "B":
                int result = 100 - 20;
                score1 = result;
                break;
            default:
                score1 = 60;
        }
        System.out.println("score1 = " + score1);

        // java 12 : Expression 을 이용한 switch문의 결과를 변수에 대입

        int score2 = switch(grade){
            case "A"-> 100;
            case "B" -> {
                int result = 100 -20;
                yield result; // java 13부터 yield 사용 가능
                // 하나의 case 에 대해 코드 블럭 사용 시 yield 를 이용해 결과값 내기
            }
            default -> 60;
        };
        System.out.println("score2 = " + score2);

    }
}
