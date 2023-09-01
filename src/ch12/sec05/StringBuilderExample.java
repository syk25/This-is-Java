package ch12.sec05;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF") // 끝에 추가
                .insert(0, "ABC") // 특정 위치에 추가
                .delete(3, 4) // 일정 구간 삭제
                .toString();  // 문자열로 전환
        System.out.println(data);
    }
}
