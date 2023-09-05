package ch14.sec05.exam02;

public class JoinExample {
    public static void main(String[] args) { // 메인스레드 실행
        SumThread sumThread = new SumThread(); // 합스레드객체 생성 - NEW
        sumThread.start(); // 합스레드객체 실행 대기 상태
        try{
            sumThread.join(); // 메인스레드 일시정지 상태
        } catch (InterruptedException e){

        }
        System.out.println("1 ~ 100 합: " + sumThread.getSum());
    }
}
