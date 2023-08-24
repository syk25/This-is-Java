package ch05.sec04;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String hobby = "여행";
        hobby = null; // 여행 객체는 쓰레기 객체가 된다

        String kind1 = "자동차";
        String kind2 = kind1; // kind2는 kind1 이 참조한 객체의 주소를 저장함
        kind1 = null; // kind1 이 저장한 주소값을 없앰
        System.out.println("kind2 = " + kind2); // kind2 는 여전히 "자동차"를 참조하고 있음
    }

}
