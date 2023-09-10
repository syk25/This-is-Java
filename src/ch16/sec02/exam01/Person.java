package ch16.sec02.exam01;

public class Person {
    public void action(Workable workable){ // action()메서드는 데이터 처리부, 인터페이스 변수 사용
        workable.work();// 메서드 사용
    }
}
