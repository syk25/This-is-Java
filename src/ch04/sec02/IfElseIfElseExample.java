package ch04.sec02;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 75;

        if(score >= 90){
            System.out.println("점수가 100점에서 90점 사이입니다.");
            System.out.println("등급은 A 입니다.");
        } else if ( score >= 80){
            System.out.println("점수가 80점에서 89점 사이입니다.");
            System.out.println("등급은 B 입니다.");
        } else if (score >= 70) {
            System.out.println("점수가 70에서 79 사이입니다.");
            System.out.println("등급은 C 입니다.");
        } else {
            System.out.println("점수가 70 미만입니다.");
            System.out.println("등급은 D 입니다.");
        }
    }
}
