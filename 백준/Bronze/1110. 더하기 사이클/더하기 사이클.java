import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 주어진 수
        int original = n; // 초기 수 저장
        int count = 0; // 사이클 횟수

        do {
            int tens = n / 10; // 십의 자리 수
            int ones = n % 10; // 일의 자리 수
            int sum = tens + ones; // 두 자리 수의 합
            n = ones * 10 + sum % 10; // 새로운 수 계산
            count++;
        } while (n != original); // 초기 수와 같을 때까지 반복

        System.out.println(count);
    }
}
