import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  // 테스트 케이스 개수

        for (int i = 0; i < T; i++) {
            int a = scanner.nextInt();  // 밑수
            int b = scanner.nextInt();  // 지수

            int result = 1;
            for (int j = 0; j < b; j++) {
                result = (result * a) % 10;  // (a^b) % 10 계산
            }

            if (result == 0) {
                result = 10;  // 결과가 0이면 10으로 변경
            }

            System.out.println(result);
        }
    }
}
