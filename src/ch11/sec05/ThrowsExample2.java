package ch11.sec05;

import static ch11.sec05.ThrowsExample2.findClass;

public class ThrowsExample2 {
    public static void main(String[] args) throws Exception{
        findClass();

    }
    public static void findClass()throws ClassNotFoundException{
        Class.forName("java.lang.String2");
    }
}
