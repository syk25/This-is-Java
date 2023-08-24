package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);
        String substring = subject.substring(location);
        System.out.println(substring);

        location = subject.indexOf("자바"); //
        if (location != -1) {
            System.out.println("자바와 관련 된 책이군요");
        } else {
            System.out.println("자바와 관련되지 않은 책이군요");
        }

        boolean result = subject.contains("자바"); // contains : 특정 문자열의 포함 여부 확인하는 메서드
        if (result) {
            System.out.println("자바와 관련 된 책이군요");
        } else {
            System.out.println("자바와 관련되지 않은 책이군요");
        }
    }
}
