package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> piggyBank = new Stack<>();

        piggyBank.push(new Coin(200));
        piggyBank.push(new Coin(300));
        piggyBank.push(new Coin(500));
        piggyBank.push(new Coin(1000));

        while(!piggyBank.isEmpty()){
            Coin coin =piggyBank.pop();
            System.out.println("꺼내온 동전: " + coin.getValue() + "원");
        }

    }
}
