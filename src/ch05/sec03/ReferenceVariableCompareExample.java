package ch05.sec03;
/**
 * 참조변수는 객체 등의 번지를 저장한다
 * 같은 값을 가진 객체라도 별도로 선언되었으면 별개의 주소를 갖는다
 **/
public class ReferenceVariableCompareExample {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[]{1,2,3};
        arr2 = new int[]{1,2,3};
        arr3 = arr2; // 배열의 주소를 그대로 저장
        System.out.println(arr1 == arr2);
        System.out.println(arr2 == arr3);

    }
}
