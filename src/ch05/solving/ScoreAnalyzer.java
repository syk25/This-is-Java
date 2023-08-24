package ch05.solving;

import java.util.Scanner;

public class ScoreAnalyzer {
    public static void main(String[] args) {
        int[] students = null;
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        double avg = 0;
        int sum = 0;
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택> ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("학생수> ");
                    int pax = scanner.nextInt();
                    students = new int[pax];
                    break;
                case 2:
                    if (students == null) {
                        System.out.println("학생 수부터 입력하십시오");
                        break;
                    }

                    for (int i = 0; i < students.length; i++) {
                        System.out.print("students[" + i + "]> ");
                        students[i] = scanner.nextInt();
                    }
                    break;
                case 3:
                    for (int i = 0; i < students.length; i++) {
                        System.out.println("students[" + i + "]: " + students[i]);
                    }
                    break;
                case 4:
                    if (students == null) {
                        System.out.println("학생 수부터 입력하십시오");
                        break;
                    }
                    checkingScores:
                    while (true) {
                        for (int e : students) {
                            if (e != 0) {
                                break checkingScores;
                            }
                        }
                        System.out.println("학생 점수를 입력하십시오");
                        break;
                    }
                    for (int i = 0; i < students.length; i++) {
                        if (max < students[i]) {
                            max = students[i];
                        }
                        sum += students[i];
                    }
                    avg = (double) sum / students.length;
                    System.out.println("최고점수 : " + max);
                    System.out.println("평균점수 : " + avg);
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    System.exit(0);
            }

        }
    }
}
