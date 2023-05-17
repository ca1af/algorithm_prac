import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] pieces = {1, 1, 2, 2, 2, 8}; // 정답 체스 말 개수

        for (int i = 0; i < 6; i++) {
            int count = scanner.nextInt(); // 입력된 체스 말 개수
            int diff = pieces[i] - count; // 정답과의 차이 계산
            System.out.print(diff + " ");
        }
    }
}
