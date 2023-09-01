package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍,박연수";
        String[] arr = data1.split("&|,"); // split 메서드 사용
        for(String token : arr){
            System.out.println(token);
        }
        System.out.println();

        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(data2,"/");
        while(st.hasMoreTokens()){// 다른 토큰이 있는 지 검증
            String token = st.nextToken(); // 토큰을 하나씩 가져옴
            System.out.println(token); // 가져온 토큰을 출력
        }
    }
}
