
import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            HashMap<String, Integer> map = new HashMap<>();
            String[] names = new String[N + 1];

            for (int i = 1; i <= N; i++) { //1 ~ N 까지 번호의 인덱스로 할당해주기 위함
                String pokemon = br.readLine();
                map.put(pokemon, i);
                names[i] = pokemon;
            }

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            for (int i = 0; i < M; i++) {
                String pokemon = br.readLine();
                if (isNumber(pokemon)){ // 숫자로 받았다면
                    bw.append(names[Integer.parseInt(pokemon)]);
                } else {
                    bw.append(String.valueOf(map.get(pokemon)));
                }
                if (i != M - 1){
                    bw.append("\n");
                }
            }

            bw.flush();
            bw.close();
            br.close();
        }

        public static boolean isNumber(String pokemon){
            try {
                Integer.parseInt(pokemon);
                return true;
            } catch (NumberFormatException e){
                return false;
            }
        }
    }