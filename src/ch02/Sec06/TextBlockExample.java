package ch02.Sec06;

public class TextBlockExample {
    public static void main(String[] args) {
        // textblock을 사용하지 않는 경우 - 이스케이프 문자를 이용
        String str1 = "" + "{\n +" +
                "\t\"id\":\"winter\",\n" +
                "\t\"name\":\"눈송이\"\n" +
                "}";
        // textblock을 사용하는 경우 - 세쌍따옴표 블럭 사
        String str2 = """
                {
                "id":"winter"
                "name":"눈송이"
                }
                """;
        System.out.println(str1);
        System.out.println("---------------------");
        System.out.println(str2);
        System.out.println("---------------------");
        String str = """
                나는 자바를 \
                학습합니다.
                나는 자바 고수가 될 겁니다.
                """;
        System.out.println(str);
    }
}
