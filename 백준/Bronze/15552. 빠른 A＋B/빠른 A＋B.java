import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st;

            int parsedInt = Integer.parseInt(br.readLine());

            for (int i = 0; i < parsedInt; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
            }
            
            br.close();
            bw.flush();
            bw.close();
        }
    }