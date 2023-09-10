package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); // HashMap 객체 구현 및 자동형변환
        map.put("신용권", 85); // 자료 저장 - Entry
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);
        System.out.println("총 entry 수: " + map.size());
        System.out.println();

        String key = "홍길동";
        int value = map.get(key); // 자료 조회
        System.out.println(key + " : " + value);
        System.out.println();

        Set<String> keySet = map.keySet(); // 키의 집합 모음 만들기
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()){
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + " : " + v);

        }
        System.out.println();

        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()){
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }
        System.out.println();

        map.remove("홍길동");
        System.out.println("총 Entry의 개수:" + map.size());
        System.out.println();
    }


}
