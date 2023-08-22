package ch05.sec04;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String hobby = "여행";
        hobby = null; // 여행 객체는 쓰레기 객체가 된다

        String kind1 = "자동차";
        String kind2 = kind1;
        kind1 = null;
        System.out.println("kind2 = " + kind2);
    }

}
