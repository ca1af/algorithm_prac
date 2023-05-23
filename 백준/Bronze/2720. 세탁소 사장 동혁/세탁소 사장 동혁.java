import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt(); // 테스트 케이스의 개수
        
        for (int i = 0; i < T; i++) {
            int C = scanner.nextInt(); // 거스름돈
            
            // 각 동전의 개수 계산
            int q = C / 25;
            C %= 25;
            
            int d = C / 10;
            C %= 10;
            
            int n = C / 5;
            C %= 5;
            
            int p = C;
            
            System.out.println(q + " " + d + " " + n + " " + p);
        }
    }
}
