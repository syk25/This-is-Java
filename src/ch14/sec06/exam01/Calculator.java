package ch14.sec06.exam01;

public class Calculator {
    private int memory; // 필드 선언

    public int getMemory(){ // 메서드 선언
        return memory;
    }

    public synchronized void setMemory1(int memory){ // 동기화된 메서드 선언
        this.memory = memory;
        try{
            Thread.sleep(2000); // 2초간 일시정지
        } catch (InterruptedException e){}
        System.out.println(Thread.currentThread().getName() + " : " + this.memory);
    }

    public void setMemory2(int memory){
        synchronized (this){ // 메서드 내에 동기화된 블럭 선언
            this.memory = memory;
            try{
                Thread.sleep(2000); //  2초가 일시정지
            } catch(InterruptedException e){}
            System.out.println(Thread.currentThread().getName() + " : " + this.memory);
        }
    }
}
