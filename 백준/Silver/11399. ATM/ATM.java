import java.io.*;
import java.util.*;

public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            int N = Integer.parseInt(br.readLine());

            int[] arr = new int[N];

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            int[] prefixSum = new int[N+1];

            prefixSum[0] = arr[0];

            //5
            //3 1 4 3 2
            //1 2 3 3 4  // arr[]
            //1 3 6 9 13 // prefixSum[] == 32

            for (int i = 1; i < N; i++) { // N번째 까지의 누적합 구하기 위함
                prefixSum[i] = prefixSum[i-1] + arr[i]; // prefixSum[1] = prefixSum[0] + arr[1]
            }

            int sum = Arrays.stream(prefixSum).sum();

            System.out.println(sum);
        }
    }