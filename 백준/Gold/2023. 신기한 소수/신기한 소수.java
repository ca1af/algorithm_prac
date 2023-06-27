import java.util.*;

public class Main {
        static int N;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            N = sc.nextInt(); // 주어지는 자릿수
            dfs(2, 1);
            dfs(3, 1);
            dfs(5, 1);
            dfs(7, 1);

        }

        static void dfs(int num, int digit){ // 타겟, 자리수 // 2 : 21 / 22 ...
            if (digit == N){
                if (isPrime(num)){
                    System.out.println(num);
                }
                return;
            }
            for (int i = 1; i < 10; i++) { // 1~9 까지, 자릿수 판별임
                if (i % 2 == 0) continue; // 짝수라면 거름. 소수일필요는 없음. 왜냐면 마지막 자리의 수가 짝수면 무조건 2로 나눠지니까 -> 소수가아님.
                if (isPrime(num * 10 + i)){
                    dfs(num * 10 + i, digit + 1);
                }
            }
        }

        static boolean isPrime(int num){
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }