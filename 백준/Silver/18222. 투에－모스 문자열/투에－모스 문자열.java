import java.util.*;
import java.io.*;

    
public class Main{
        static long[] arr;
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            long N = Long.parseLong(br.readLine());
            arr = new long[65];
            arr[0] = 1; // 초기화

            for (int i = 1; i < arr.length; i++) {
                arr[i] = arr[i - 1] * 2; // 2씩 제곱
            }

            System.out.println(recur(N));
        }

        static long recur(long N){
            if (N == 1) return 0;

            for (int i = 0; i < arr.length; i++) {
                if (N <= arr[i]) return 1 - recur(N - arr[i - 1]); // 더 큰 녀석을 찾았으므로, 더 작은 놈을 불러와서 재귀돌리기
            }
            // <1뎁스>
            // 10 이라면
            // for 문에서 i == 4 일때 (즉, arr[i] == 16 일 때 이프문 걸림)
            // 걸린 후에 arr[i - 1] == 8 을 뺀 k의 값을 재귀로 돌림. 2뎁스로 들어간다

            // <2뎁스>
            // 2 라면
            // for문에서 i == 1 일때 (즉, arr[i] == 2 일때 이프문 걸린다)
            // 걸린 후에 arr[i - 1] == 1 을 뺀 k 의 값을 재귀로 돌림. 3뎁스로 들어간다

            // <3뎁스>
            // 1 이므로, 0을 리턴한다 -> 2뎁스로!

            // <2뎁스>
            // 재귀 recur() 로 리턴받은 값은 0이다. 따라서 1 - 0 의 값인 1 을 1뎁스로 리턴한다

            // <1뎁스>
            // 재귀 reucr() 로 리턴받은 값은 1이다. 따라서 1 - 1 의 값인 0을 리턴한다. 답은 0

            return 0;
        }
    }