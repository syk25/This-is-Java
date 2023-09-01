package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
    public static void printLength(String data){
        try{int result = data.length();
        System.out.println("문자수 : " + result);}
        catch(NullPointerException e){
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
//            e.printStackTrace();
        } finally {
            System.out.println("[마무리실행]\n");
        }
    }

    public static void main(String[] args){
        System.out.println("[프로그램시작]\n");
//        printLength("ThisIsJava");
        printLength(null); // NullPointerException 반환 -> 실행예외에 해당
        System.out.println("[프로그램종료]");
    }
}
