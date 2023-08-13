import java.util.*;
import java.io.*;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken()); // 목표 금액

            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < N; i++) {
                stack.push(Integer.parseInt(br.readLine()));
            }

            int count = 0;

            while (!stack.isEmpty()){
                if (M == 0) break;

                Integer popped = stack.pop();

                if (M % popped == M) continue;

                count+= M / popped;
                M %= popped;
            }

            System.out.println(count);
        }
    }