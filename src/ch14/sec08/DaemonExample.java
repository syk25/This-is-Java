package ch14.sec08;

public class DaemonExample {
    public static void main(String[] args) {
        AutoThread autoThread = new AutoThread();
        autoThread.setDaemon(true);
        autoThread.start();

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){

        }
        System.out.println("메인 스레드 종료");
    }
}
