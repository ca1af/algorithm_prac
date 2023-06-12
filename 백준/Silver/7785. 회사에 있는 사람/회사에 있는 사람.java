import java.util.*;
import java.io.*;

public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 주어지는 로그 수

            HashMap<String, String> map = new HashMap<>();

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String entranceLog = st.nextToken();

                if (entranceLog.equals("enter")){
                    map.put(name, name);
                } else {
                    map.remove(name);
                }
            }
            ArrayList<String> list = new ArrayList<String>(map.keySet());
            list.sort(Collections.reverseOrder());
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            for (int i = 0; i < list.size(); i++) {
                bw.append(list.get(i));
                if (i != list.size() - 1){
                    bw.append("\n");
                }
            }

            bw.flush();
            bw.close();
            br.close();
        }
    }