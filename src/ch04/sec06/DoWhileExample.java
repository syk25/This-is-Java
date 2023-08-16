package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        System.out.println("메세지를 입력하십시오");
        System.out.println("프로그램을 종료하려면 q를 입력하시오");

        Scanner sc = new Scanner(System.in);

        String str;

        do{
            System.out.print(">");
            str = sc.nextLine();
            System.out.println(str);
        }
        while(!str.equals("q"));
        System.out.println();
        System.out.println("프로그램 종료");
    }

}
