package ch15.sec05.exam02;

import java.util.*;
import java.util.Map.Entry;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("apple", 10);
        treeMap.put("forever", 60);
        treeMap.put("description", 40);
        treeMap.put("zoo", 50);
        treeMap.put("base", 80);
        treeMap.put("guess", 20);
        treeMap.put("cherry", 70);
        treeMap.put("elephant", 30);

        // 정렬 된 entry 하나씩 가져오기
        Set<Entry<String, Integer>> entrySet = treeMap.entrySet();
        for(Entry<String, Integer> entry : entrySet){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        System.out.println();

        // 특정 키에 대한 값 가져오기
        Entry<String, Integer> entry = null;
        entry = treeMap.firstEntry();
        System.out.println("제일 앞 단어: " + entry.getKey() + "-" + entry.getValue());
        entry = treeMap.lastEntry();
        System.out.println("제일 뒤 단어: " + entry.getKey() + "-" + entry.getValue());
        entry = treeMap.lowerEntry("ever");
        System.out.println("ever 앞 단어: " + entry.getKey() + "-" + entry.getValue() + "\n");

        // 내림차순으로 정렬하기
        NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
        Set<Entry<String, Integer>> descendingEntrySet = descendingMap.entrySet();
        for(Entry<String, Integer> e : descendingEntrySet){
            System.out.println(e.getKey() + "-" + e.getValue());
        }
        System.out.println();

        // 범위검색
        System.out.println("[c ~ h 사이의 단어의 검색]");
        NavigableMap<String, Integer> rangeMap = treeMap.subMap("c",true,"h",false);
        for(Entry<String, Integer>e : rangeMap.entrySet()){
            System.out.println(e.getKey() + "-" + e.getValue());
        }

    }
}
