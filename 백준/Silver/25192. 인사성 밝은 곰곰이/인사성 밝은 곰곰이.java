import java.util.*;
import java.io.*;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine()); // 입력수

            Set<String> set = new HashSet<>();

            int count = 0;

            for (int i = 0; i < N; i++) {
                String line = br.readLine();
                if (line.equals("ENTER")){
                    count += set.size();
                    set.clear();
                } else {
                    set.add(line);
                }
            }

            count += set.size(); // 다 돌고나서 다시 더해줌

            System.out.println(count);
        }
    }