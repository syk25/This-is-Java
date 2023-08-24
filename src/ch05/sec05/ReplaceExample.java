package ch05.sec05;

public class ReplaceExample {
    public static void main(String[] args) {
        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String 입니다.";
        String newStr = oldStr.replace("자바", "Java"); // 새로운 문자열 생성
        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
