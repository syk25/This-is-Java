package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data){
        int result = data.length();
        System.out.println("문자수 : " + result);
    }

    public static void main(String[] args){
        System.out.println("[프로그램시작]\n");
        printLength("ThisIsJava");
        printLength(null); // NullPointerException 반환 -> 실행예외에 해당
        System.out.println("[프로그램종료]");
    }
}
