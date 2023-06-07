import java.util.*;
import java.io.*;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int K = Integer.parseInt(br.readLine());

            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < K; i++) {
                int number = Integer.parseInt(br.readLine());
                if (number == 0) {
                    stack.pop();
                } else {
                    stack.push(number);
                }
            }

            int sum = 0;
            while (!stack.isEmpty()) {
                sum += stack.pop();
            }

            System.out.println(sum);
        }
    }