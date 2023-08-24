package ch05.sec05;

public class EqualsExample { // 문자열 자체를 비교시에는 참조값을, 값을 비교할 때는 equals 를 비교한다
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        if(strVar1 == strVar2){
            System.out.println("strVar1 과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVar1 과 strVar2는 참조가 다름");
        }

        if(strVar1.equals(strVar2)){
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        if(strVar3 == strVar4){
            System.out.println("strVar3과 strVar4는 참조가 같음");
        } else{
            System.out.println("strVar3 과 strVar4 는 참조가 다름");
        }

        if(strVar3.equals(strVar4)){
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }

    }
}
