import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int start = 1; // 시작 값
        int end = 1; // 끝 값
        int sum = 0; // 현재까지의 합
        int count = 0; // 경우의 수

        while (start <= N) {
            if (sum < N) {
                sum += end; // 현재까지의 합에 end 값을 더함
                end++; // end 값을 증가시킴
            } else if (sum == N) {
                count++; // 경우의 수를 증가시킴
                sum -= start; // 현재까지의 합에서 start 값을 빼고
                start++; // start 값을 증가시킴
            } else { // sum > N
                sum -= start; // 현재까지의 합에서 start 값을 빼고
                start++; // start 값을 증가시킴
            }
        }

        System.out.println(count);
    }
}
