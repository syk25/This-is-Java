package ch05.sec06;

public class ArrayCreateByValueExample1 {
    public static void main(String[] args) {
        String[] Season = {"Spring", "Summer", "Fall", "Winter"};

        for(String e : Season){
            System.out.print(e + " ");
        }
        System.out.println();

        Season[1] = "여름";
        System.out.println("Season[1] = " + Season[1]);
        System.out.println();

        int[] scores = {83, 90, 87};

        int sum = 0;
        for (int e : scores) {
            sum += e;
        }
        System.out.println("총합: " + sum);
        double avg = (double) sum / scores.length; // 강제형변환 잊지 말자
        System.out.println("평균: " + avg);
    }
}
