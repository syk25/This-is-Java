package ch11.sec03.exam01;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try{
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("배열의 인덱스가 초과 됨 : " + e.getMessage());
            } catch(NumberFormatException e){
                System.out.println("숫자의 형식이 맞지 않음 : " + e.getMessage());
            }
        }
    }
}
