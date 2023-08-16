package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++; // 현재 : 10
        ++x; // 현재 : 12
        System.out.println("x = " + x); // 출력값: 12

        System.out.println("--------------");
        y--; // 현재 : 10
        --y; // 현재 : 8
        System.out.println("y = " + y); // 출력값 : 8

        System.out.println("------------");
        z = x++; // 현재 : 12
        System.out.println("z = " + z); // 출력값: 12
        System.out.println("x = " + x); // 출력값: 13

        System.out.println("------------");
        z=++x; // 현재 : 14
        System.out.println("z = " + z); // 출력값 : 14
        System.out.println("x = " + x); // 출력값 : 14

        System.out.println("------------");
        z = ++x + y++;
        System.out.println("z = " + z); // 출력값 : 23
        System.out.println("y = " + y); // 출력값 : 9
        System.out.println("x = " + x); // 출력값 : 15


    }

}
