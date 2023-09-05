package ch14.sec06.exam02;

public class WaitNotifyExample {
    public static void main(String[] args) {
        WorkObject workObject = new WorkObject(); // 구현체 생성

        // 스레드 A, B는 둘다 동일한 객체를 공유함
        ThreadA threadA = new ThreadA(workObject);
        ThreadB threadB = new ThreadB(workObject);

        threadA.start();
        threadB.start();
    }
}
