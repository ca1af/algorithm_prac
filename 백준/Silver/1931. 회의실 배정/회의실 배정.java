import java.util.*;
import java.io.*;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            int N = Integer.parseInt(br.readLine()); // 회의의 수

            int[][] meetings = new int[N][2]; // 입력수만큼, 시작 종료 시간 받아준다

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                meetings[i][0] = Integer.parseInt(st.nextToken()); // 시작시간
                meetings[i][1] = Integer.parseInt(st.nextToken()); // 종료시간
            }

            // 종료시간 기준으로 정렬, 종료시간 같다면 시작 시간으로 비교

            Arrays.sort(meetings, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if(o1[1] == o2[1]) {
                        return o1[0] - o2[0];
                    }

                    return o1[1] - o2[1];
                }
            });

            int count = 0;
            int prevEndTime = 0;

            //1 4
            //3 5
            //0 6
            //5 7
            //3 8
            //5 9
            //6 10
            //8 11
            //8 12
            //2 13
            //12 14
            
            // 딱 이렇게 정렬되고
            // 1,4 -> 4보다 더 큰 5,7 -> 7보다 큰 8,11 -> 11보다 큰 12,14 이렇게 4번 카운트됨

            for (int i = 0; i < N; i++) {
                if (meetings[i][0] >= prevEndTime){ // 시작시간이 직전 종료 시간보다 같거나 크다면
                    prevEndTime = meetings[i][1]; // prevEndTime 갱신하고
                    count++; // 카운트
                }
            }

            System.out.println(count);
        }
    }