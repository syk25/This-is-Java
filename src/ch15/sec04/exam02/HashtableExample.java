package ch15.sec04.exam02;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new Hashtable<>(); // 동기화 메서드가 존재하는 경우
//        Map<String, Integer> map = new HashMap<>(); // 공융객체의 동기화가 없는 경우

        Thread threadA = new Thread(){
            public void run(){
                for (int i = 1; i <= 1000 ; i++) {
                    map.put(String.valueOf(i),i);
                }
            }
        };

        Thread threadB = new Thread(){
            public void run(){
                for (int i = 1001; i <= 2000 ; i++) {
                    map.put(String.valueOf(i),i);
                }
            }
        };

        threadA.start();
        threadB.start();

        try{
            threadA.join();
            threadB.join();
        } catch(Exception e){

        }

        int size =map.size();
        System.out.println("총 엔트리의 개수 : " + size);
        System.out.println();



    }
}
