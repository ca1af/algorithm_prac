import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());

            String[] arr = new String[N];

            for (int i = 0; i < N; i++) {
                arr[i] = br.readLine();
            }


            int count = 0;

            for (String s : arr) {
                Stack<Character> stack = new Stack<>();
                char[] charArray = s.toCharArray();
                for (char c : charArray) {
                    if (!stack.isEmpty() && stack.peek() == c){
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }

                if (stack.isEmpty()){
                    count++;
                }

            }
            System.out.println(count);

        }
    }