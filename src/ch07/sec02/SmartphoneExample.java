package ch07.sec02;

public class SmartphoneExample {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone("갤럭시", "은색");

        System.out.println("모델: " + myPhone.model);
        System.out.println("색: " + myPhone.color);

        System.out.println("와이파이의 상태: " + myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요!");
        myPhone.sendVoice("아! 네, 반갑습니다.");
        myPhone.hangUp();
        myPhone.setWifi(true);
        myPhone.internet();
    }
}
