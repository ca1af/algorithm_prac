import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int M = sc.nextInt(); // start
            int N = sc.nextInt(); // end

            int[] arr = new int[N + 1];

            for (int i = 2; i < arr.length; i++) {
                arr[i] = i;
            }

            for (int i = 2; i <= Math.sqrt(N); i++){
                if (arr[i] == 0) continue;
                for (int j = i + i; j <= N; j = i + j){
                    arr[j] = 0;
                }
            }

            for (int i = M; i <= N; i++){
                if (arr[i] != 0){
                    System.out.println(arr[i]);
                }
            }
        }
    }