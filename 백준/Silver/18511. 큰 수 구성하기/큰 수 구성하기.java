import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
        static int N;
        static int K;
        static int answer;
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken()); // 주어지는 원소의 갯수
            int[] arr = new int[K];

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < K; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            
            dfs(0, arr);

            System.out.println(answer);
        }
        
        static void dfs(int node, int[] arr){
            if (node > N) return;
            
            if (node > answer) answer = node;

            for (int i = arr.length - 1; i >= 0; i--) {
                dfs(node * 10 + arr[i], arr);
            }
        }
    }