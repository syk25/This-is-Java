package ch05.solving;

public class SumAndAverageOfArray {
    public static void main(String[] args) {
        int[][] array = {
            {95, 86},
            {83, 92, 96},
            {78, 83, 93, 87, 88}
        };
         int sum = 0;
         int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                count++;
            }
        }
        double avg = (double) sum / count;
        System.out.println("평균: " + avg);
        System.out.println("총합: " + sum);
    }
}
