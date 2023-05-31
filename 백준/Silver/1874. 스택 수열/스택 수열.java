import java.util.*;
import java.io.*;

public class Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();

            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            int num = 1;

            Stack<Integer> stack = new Stack<>();

            StringBuilder sb = new StringBuilder();

            boolean result = true;

            for (int i = 0; i < arr.length; i++) {
                int picked = arr[i];
                if (picked >= num){
                    while(picked >= num){
                        stack.push(num++);
                        sb.append("+\n");
                    }
                    stack.pop();
                    sb.append("-\n");
                } else {
                    int n = stack.pop();
                    if (n > picked){
                        result = false;
                        System.out.println("NO");
                        break;
                    } else {
                        sb.append("-\n");
                    }
                }
            }

            if (result){
                System.out.println(sb.toString());
            }
        }
    }