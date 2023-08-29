import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.BigInteger;

    

public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            ArrayList<Number> arr = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                Number number = new Number(st.nextToken());
                arr.add(number);
            }

            Collections.sort(arr);

            StringBuilder sb = new StringBuilder();
            for (Number s : arr) {
                sb.append(s.original);
            }

            BigInteger answer = new BigInteger(sb.toString());
            System.out.println(answer);
        }
        
            static class Number implements Comparable<Number>{
        private Long toCompare;
        private Long original;

        Number(String given) {
            StringBuilder sb = new StringBuilder();
            this.original = Long.parseLong(given);
            for (int i = 0; i < 10; i++) {
                sb.append(given.charAt(i % given.length()));
            }
            this.toCompare = Long.parseLong(sb.toString()); // 열자리 수
        }

        @Override
        public int compareTo(Number o) {
            if (this.toCompare == o.toCompare) return 0;
            else if (this.toCompare < o.toCompare) {
                return 1;
            }
            return -1;
        }
    }

        // Comparator 제한사항
        // 1. 앞자리 (String.charAt(0)) 이 제일 큰 녀석이 앞에 와야한다
        // 2. 앞자리가 큰 녀석들 중에는, 길이가 짧은 녀석이 앞에 와야한다
        // 3. 앞자리가 같고 길이가 같다면, linear 하게 탐색한다.
    }


