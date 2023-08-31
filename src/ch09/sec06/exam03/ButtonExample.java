package ch09.sec06.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button(); // 버튼 객체 생성

        class OkListener implements Button.ClickListener { // 버튼 클래스 내부의 ClickListener를 구현한 OkListener 클래스 선언
            @Override
            public void onClick() { // 추상 메서드의 구현
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        }

        btnOk.setClickListener(new OkListener()); // 중첩인터페이스의 구현객체 대입

        btnOk.click();

        Button btnCancel = new Button();

        class CancelListener implements Button.ClickListener{
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        }
        btnCancel.setClickListener(new CancelListener());
        btnCancel.click();
    }
}
