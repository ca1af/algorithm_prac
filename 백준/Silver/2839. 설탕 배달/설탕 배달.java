import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int targetNum = sc.nextInt();

        int count = 0;

        while (targetNum >= 3) {
            // 5킬로그램 봉지로 채울 수 있는 만큼 채우기
            if (targetNum % 5 == 0) {
                count += targetNum / 5;
                targetNum = 0;
                break;
            }

            // 5킬로그램 봉지로 채울 수 없는 경우, 3킬로그램 봉지를 사용
            targetNum -= 3;
            count++;
        }

        if (targetNum == 0) {
            System.out.println(count);
        } else {
            System.out.println(-1); // 설탕을 정확히 배달할 수 없는 경우 -1 출력
        }
    }
    }