package ch15.sec02.exam02;

import ch15.sec02.exam01.Board;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // 멀티스레드를 사용할 경우 공유객체 사용 시 메서드의 경합이 일어날 수 있다.
        // Vector는 동기화 된 메서드를 사용하여 경합을 방지한다.

        List<Board> list = new Vector<>();
//        List<Board> list = new ArrayList<>();
        Thread threadA = new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
                }
            }
        };
        Thread threadB = new Thread(){
            @Override
            public void run() {
                for (int i = 1001; i <= 2000; i++) {
                    list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
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
        int size = list.size();
        System.out.println("총 객체의 개수: " + size);
        System.out.println();


    }
}
