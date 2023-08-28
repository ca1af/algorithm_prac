import java.util.*;
import java.io.*;

public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                arr.add(Integer.parseInt(br.readLine()));
            }

            Collections.sort(arr, Collections.reverseOrder());

            int sum = 0 ;

            for (int i = 0; i < arr.size(); i++) {
                if ((i + 1) % 3 != 0) sum += arr.get(i);
            }

            System.out.println(sum);
        }
    }