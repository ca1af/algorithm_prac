import java.util.*;

public class Main {
        static int N;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            N = sc.nextInt();

            dfs(2, 1);
            dfs(3, 1);
            dfs(5, 1);
            dfs(7, 1);
        }

        static void dfs(int num, int digit){
            if (digit == N){ // 들어온 게 자릿수고
                if (isPrime(num)){ // 소수라면
                    System.out.println(num);
                }
                return;
            }

            for (int i = 1; i < 10; i++) { // 1 ~ 9 까지의 수
                if (i % 2 == 0) continue;
                if (isPrime(num * 10 + i)){ // 소수에 * 10 하고, 거기에 i를 더한 값이 소수라면, 다시 dfs 해서 소수판별+자릿수판별
                    dfs(num * 10 + i, digit + 1);
                }
            }

        }

        static boolean isPrime(int num) { // 소수판별로직
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }