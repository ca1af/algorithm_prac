import java.util.*;
import java.io.*;

public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken()); // 듣
            int M = Integer.parseInt(st.nextToken()); // 보

            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                map.put(br.readLine(), 0);
            }

            ArrayList<String> arrayList = new ArrayList<>();
            for (int i = 0; i < M; i++) {
                String notSeen = br.readLine();
                if (map.containsKey(notSeen)) arrayList.add(notSeen);
            }
            
            Collections.sort(arrayList); // 사전순

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
            bw.append(String.valueOf(arrayList.size())); 
            bw.append("\n");

            for (int i = 0; i < arrayList.size(); i++) {
                bw.append(arrayList.get(i));
                if (i != arrayList.size() - 1){
                    bw.append("\n");
                }
            }

            bw.flush();
            br.close();
            bw.close();
        }
    }