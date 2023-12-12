import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int given = Integer.parseInt(br.readLine());
            int start = 2;
            while (given > 1){
                if (given % start == 0){
                    given /= start;
                    System.out.println(start);
                    start = 2;
                    continue;
                }
                start++;
            }
        }
    }