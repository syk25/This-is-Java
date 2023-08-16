package ch02.Sec05;

public class BooleanExample {
    public static void main(String[] args) {

        // Boolean type 변수의 용도
        // 논리형을 이용한 제어문의 흐름 설정
        boolean stop = true;
        if(stop){
            System.out.println("중지합니다.");
        } else{
            System.out.println("시작합니다.");
        }
        // 논리리터럴을 저장
        int x = 10;
        boolean result1 = (x==20);
        boolean result2 = (x !=20);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
