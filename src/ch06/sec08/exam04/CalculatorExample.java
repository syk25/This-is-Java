package ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double result1 = calculator.areaRectangle(10);
        System.out.println("정사각형의 넓이: " + result1);

        double result2 = calculator.areaRectangle(10, 20);
        System.out.println("직사각형의 넓이: " + result2);
    }
}
