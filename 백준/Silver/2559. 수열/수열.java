import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 전체 날짜 수
        int K = Integer.parseInt(st.nextToken()); // 구간 합

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] prefixSum = new int[N];

        prefixSum[0] = arr[0];

        for (int i = 1; i < N; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < prefixSum.length - K + 1; i++) {
            int sum = prefixSum[i + K - 1] - (i > 0 ? prefixSum[i - 1] : 0);
            if (sum > max){
                max = sum;
            }
        }

        System.out.println(max);
    }
}
