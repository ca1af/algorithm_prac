import java.util.*;
import java.io.*;

 public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine()); // 입력수
            StringTokenizer st;

            HashSet<String> hashSet = new HashSet<>(); // 총총이랑 만난 녀석들을 모아둘 감옥

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());

                String firstPerson = st.nextToken();
                String secondPerson = st.nextToken();

                if (firstPerson.equals("ChongChong") || secondPerson.equals("ChongChong")){
                    hashSet.add(firstPerson);
                    hashSet.add(secondPerson);
                }

                if (hashSet.contains(firstPerson) || hashSet.contains(secondPerson)) {
                    hashSet.add(firstPerson);
                    hashSet.add(secondPerson);
                }
            }

            System.out.println(hashSet.size());
        }
    }