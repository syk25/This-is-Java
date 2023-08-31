package ch09.sec06.exam02;

public class Button { // 바깥 클래스
    public static interface ClickListener{ // 중첩 인터페이스
        void onClick();
    }
    private ClickListener clickListener; // 구현객체를 저장하기 위한 변수선언

    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener; // 매개변수로 받은 인터페이스타입변수를 필드가 참조하도록 함
    }
}
