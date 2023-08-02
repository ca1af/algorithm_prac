import java.util.*;
import java.io.*;

public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            long min = Long.parseLong(st.nextToken());
            long max = Long.parseLong(st.nextToken());
            long[] arr = new long[10000001];

            // 초기화
            for (int i = 2; i < arr.length; i++) {
                arr[i] = i;
            }

            // 에라토스테네스의 체
            for (int i = 2; i <= Math.sqrt(arr.length); i++){
                if (arr[i] == 0){
                    continue;
                }
                for (int j = i + i; j < arr.length; j += i) {
                    arr[j] = 0;
                }
            }

            int count = 0;
            for (int i = 2; i < arr.length; i++) {
                if (arr[i] != 0){
                    long temp = arr[i];
                    while ((double) arr[i] <= (double) max/temp){
                        if ((double) arr[i] >= (double) min/temp){
                            count++;
                        }
                        temp = temp * arr[i];
                    }
                }
            }

            System.out.println(count);
        }
    }