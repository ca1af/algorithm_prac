import java.util.Scanner;

public class Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int target = sc.nextInt();

            int answer = 0;

            for (int i = 1; i < target; i++) {
                int sum = i;
                int num = i;

                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }

                if (sum == target) {
                    answer = i;
                    break;
                }
            }

            System.out.println(answer);
        }

    }
    