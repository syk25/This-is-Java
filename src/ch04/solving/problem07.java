package ch04.solving;

import java.util.Scanner;

public class problem07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int remain = 0;

        Banking:
        while (true) {
            System.out.println("-------------------------------");
            System.out.println("1.예금 | 2. 출금 | 3. 잔금 | 4. 종료");
            System.out.println("-------------------------------");
            System.out.print("선택>\t");
            switch (choice = sc.nextInt()) {
                case 1 -> {
                    System.out.print("예금액>\t");
                    remain += sc.nextInt();
                    System.out.println("잔고>\t" + remain);
                }
                case 2 -> {
                    System.out.print("출금액>\t");
                    remain -= sc.nextInt();
                    System.out.println("잔고>\t" + remain);
                }
                case 3 -> {
                    System.out.print("잔고>\t");
                    System.out.println(remain);
                }
                case 4 -> {
                    System.out.println("프로그램 종료");
                    break Banking;
                }
            }


        }
    }
}
