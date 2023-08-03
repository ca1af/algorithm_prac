import java.util.*;
import java.io.*;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 주어지는 걸그룹의 수
            int M = Integer.parseInt(st.nextToken()); // 문제의 수

            Map<String, ArrayList<String>> map = new HashMap<>();

            for (int i = 0; i < N; i++) {
                String s = br.readLine(); // 주어지는 그룹의 이름
                int memberCount = Integer.parseInt(br.readLine()); // 그룹의 멤버 수

                ArrayList<String> members = new ArrayList<>();
                for (int j = 0; j < memberCount; j++) {
                    String memberName = br.readLine();
                    members.add(memberName);
                }
                map.put(s, members);
            }

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            // 문제 개수를 입력받는 부분
            for (int i = 0; i < M; i++) {
                String given = br.readLine(); // 멤버 혹은 팀 이름
                int memberOrTeam = Integer.parseInt(br.readLine()); // 0이면 팀 멤버 다, 1이면 어느팀 소속인지

                if (memberOrTeam == 0) {
                    ArrayList<String> strings = map.get(given);
                    Collections.sort(strings);
                    for (String string : strings) {
                        bw.append(string).append("\n");
//                        System.out.println(string);
                    }
                } else {
                    for (String s : map.keySet()) {
                        ArrayList<String> strings = map.get(s);
                        if (strings.contains(given)) {
                            bw.append(s).append("\n");
//                            System.out.println(s);
                            break;
                        }
                    }
                }
            }

            bw.flush();
            br.close();
            bw.close();
        }
    }