package ch05.sec08;

public class ArrayReferenceObjectExample {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");

        System.out.println((strArray[0] == strArray[1])); // 번지 비교
        System.out.println((strArray[1] == strArray[2])); // 번지 비교
        System.out.println((strArray[1].equals(strArray[2]))); // 값 비교
    }
}
