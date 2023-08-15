import java.util.*;
import java.io.*;

public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());

            int[] arr = new int[N];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(arr);

            Queue<Integer> q = new LinkedList<>();
            Stack<Integer> stack = new Stack<>();
            int sum = 0;
            
            for (int i : arr) {
                if (i < 1){
                    q.add(i);
                } else if (i == 1) {
                    sum++;
                } else {
                    stack.add(i);
                }
            }

        

            while (q.size() > 1){
                Integer polled = q.poll();
                Integer polled2 = q.poll();

                sum += polled * polled2;
            }

            while (stack.size() > 1){
                Integer popped = stack.pop();
                Integer popped1 = stack.pop();

                sum += popped1 * popped;
            }

            if (!q.isEmpty()) sum += q.poll();
            if (!stack.isEmpty()) sum += stack.pop();

            System.out.println(sum);
        }
    }