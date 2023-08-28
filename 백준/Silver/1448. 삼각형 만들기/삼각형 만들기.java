import java.util.*;
import java.io.*;

public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                arr.add(Integer.parseInt(br.readLine()));
            }

            arr.sort(Collections.reverseOrder());

            int max = -1;

            for (int i = 0; i < arr.size(); i++) {
                Integer currentMax = arr.get(i);

                if (i + 2 < arr.size()){
                    Integer first = arr.get(i + 1);
                    Integer second = arr.get(i + 2);
                    if (first + second > currentMax) max = Math.max(first + second + currentMax, max);
                }
            }

            System.out.println(max);
        }
    }