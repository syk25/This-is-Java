package ch05.sec07;

public class MultiDimensionalArrayByNewExample {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];

        // 배열 항목 초기값 출력
        for (int i = 0; i < mathScores.length; i++) { // 모든 반을 순회
            for (int j = 0; j < mathScores[i].length; j++) { // 하나의 반의 모든 학생 순회
                System.out.println("mathScores[" + i + "]" + "[" + j + "]: " + mathScores[i][j]);
            }
        }
        System.out.println();

        mathScores = new int[][]{
                {80, 83, 85},
                {86, 90, 92}
        };
        int totalStudent = 0;
        int totalMathSum = 0;
        for (int i = 0; i < mathScores.length; i++) {
            totalStudent += mathScores[i].length;
            for (int j = 0; j < mathScores[i].length; j++) {
                totalMathSum += mathScores[i][j];
            }
        }
        double avgTotal = (double) totalMathSum / totalStudent;
        System.out.println("avgTotal = " + avgTotal);
        System.out.println();

        // 각 반의 학생 수가 다를 경우의 배열의 선언
        int[][] englishScores = new int [2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];

        // 배열의 항목 초기값 출력
        for (int i = 0; i < englishScores.length; i++) { // 모든 반을 순회
            for (int j = 0; j < englishScores[i].length; j++) { // 하나의 반의 모든 학생 순회
                System.out.println("englishScores[" + i + "]" + "[" + j + "]: " + englishScores[i][j]);
            }
        }

        englishScores = new int[][]{
                {90, 91},
                {92, 93, 94}
        };

        System.out.println();

        totalStudent = 0;
        int totalEnglishSum = 0;
        for (int i = 0; i < englishScores.length; i++) {
            totalStudent += englishScores[i].length;
            for (int j = 0; j < englishScores[i].length; j++) {
                totalEnglishSum += englishScores[i][j];
            }
        }
        avgTotal = (double) totalEnglishSum / totalStudent;
        System.out.println("avgTotal = " + avgTotal);


    }

}

