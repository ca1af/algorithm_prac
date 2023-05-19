import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // 숫자의 개수

        int count = 0;  // 소수 개수를 저장할 변수

        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();  // 입력된 숫자

            if (isPrime(number)) {
                count++;  // 소수인 경우 count 증가
            }
        }

        System.out.println(count);
    }

    // 소수인지 판별하는 함수
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;  // 2보다 작은 수는 소수가 아님
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;  // 약수가 존재하면 소수가 아님
            }
        }

        return true;  // 약수가 존재하지 않으면 소수
    }
}
