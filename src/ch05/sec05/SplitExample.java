package ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1,자바,학습,참조타입 String을 학습합니다.,홍길동";
        String[] tokens = board.split(",");

        String[] nameTag = {"번호: ", "제목: ", "내용: ", "성명: "};

        for(int i = 0; i < 4; i++){
            System.out.println(nameTag[i] + tokens[i]);
        }
    }
}
