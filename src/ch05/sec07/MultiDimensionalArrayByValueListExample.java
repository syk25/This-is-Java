package ch05.sec07;

public class MultiDimensionalArrayByValueListExample {
    public static void main(String[] args) {
        int[][] scores = {
                {80, 90, 96},
                {76, 88}
        };

        System.out.println("1차원 배열의 길이(반의 수): " + scores.length);
        System.out.println("2차원 배열의 길이(첫번째 반의 학생의 수): " + scores[0].length);
        System.out.println("2차원 배열의 길이(두번째 반의 학생의 수): " + scores[1].length);

        // 첫번째 반의 3번째 학생의 점수
        System.out.println("1반 3번 학생의 점수 : " + scores[0][2]);

        // 첫번째 반의 평균 점수 구하기
        int sum1 = 0;
        for(int e : scores[0]){
            sum1 += e;
        }
        System.out.println("sum1 = " + sum1);
        double avg1 = (double) sum1 / scores[0].length;
        System.out.println("avg1 = " + avg1);

        // 두번째 반의 평균 점수 구하기
        int sum2 = 0;
        for(int e : scores[1]){
            sum2 += e;
        }
        System.out.println("sum2 = " + sum2);
        double avg2 = (double) sum2 / scores[1].length;
        System.out.println("avg2 = " + avg2);

        // 전체 학생 수의 평균 구하기
        double avgTotal = (double) (sum1 + sum2) / (scores[0].length + scores[1].length);
        System.out.println("avgTotal = " + avgTotal);
    }
}
