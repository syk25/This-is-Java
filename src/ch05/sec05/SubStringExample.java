package ch05.sec05;

public class SubStringExample { // substring 메서드 : 문자열 내의 특정 문자열을 반환한다
    public static void main(String[] args) {
        String ssn = "880510-1234567";
        String firstNum = ssn.substring(0, 6);
        System.out.println("firstNum = " + firstNum);

        String secondNum = ssn.substring(7);
        System.out.println("secondNum = " + secondNum);
    }
}
