package ch16.sec01;

@FunctionalInterface // 함수형 인터페이스 선언
public interface Calculable {
    void calculate(int x, int y); // 추상메서드 선언
}
