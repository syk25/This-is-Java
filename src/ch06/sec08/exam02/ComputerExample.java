package ch06.sec08.exam02;

import ch06.sec08.exam01.Calculator;

public class ComputerExample {
    public static void main(String[] args) {

        Computer computer = new Computer();
        int result1 = computer.sum(1,2,3,4,5,6);
        System.out.println("result1 = " + result1);

        int result2 = computer.sum(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("result2 = " + result2);

        int[] values = {1, 2, 3, 4, 5};
        int result3 = computer.sum(values);
        System.out.println("result3 = " + result3);

        int result4 = computer.sum(new int[]{1, 2, 3, 4, 5});
        System.out.println("result4 = " + result4);
    }
}
