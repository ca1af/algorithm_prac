import java.util.*;
import java.io.*;

public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            long[] arr = new long[N];

            for (int i = 0; i < N; i++) {
                arr[i] = Long.parseLong(br.readLine());
            }

            PriorityQueue<Long> pq = new PriorityQueue<>();

            for (long i : arr) {
                pq.add(i);
            }

            long sum = 0;

            while (pq.size() > 1){
                Long first = pq.poll();
                Long second = pq.poll();

                sum += first + second;
                pq.add(first + second);
            }

            System.out.println(sum);
        }
    }