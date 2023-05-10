import java.io.*;
import java.util.StringTokenizer;

public class Main {
        public static void main(String args[]) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st;

            int parsedInt = Integer.parseInt(br.readLine());

            for (int i = 1; i <= parsedInt; i++) {
                st = new StringTokenizer(br.readLine()," ");
                int parsedInt1 = Integer.parseInt(st.nextToken());
                int parsedInt2 = Integer.parseInt(st.nextToken());
                bw.write("Case #"+i+": ");
                bw.write(parsedInt1 + " + " + parsedInt2 + " = ");
                bw.write(parsedInt1
                        + parsedInt2 +"\n");
            }
            br.close();
            bw.flush();
            bw.close();
        }

    }