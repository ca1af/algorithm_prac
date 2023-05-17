import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 과목 개수

        int[] scores = new int[n]; // 점수 배열
        int maxScore = 0; // 최대 점수

        // 점수 입력 및 최대 점수 찾기
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }

        double sum = 0; // 점수 합계

        // 점수 조작 및 합계 계산
        for (int i = 0; i < n; i++) {
            double adjustedScore = (double) scores[i] / maxScore * 100;
            sum += adjustedScore;
        }

        double average = sum / n; // 평균 계산

        System.out.println(average);
    }
}
