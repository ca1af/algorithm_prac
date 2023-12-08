import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main{
        static class Homework implements Comparable<Homework>{
            private int day, score;

            public Homework(int day, int score) {
                this.day = day;
                this.score = score;
            }

            @Override
            public int compareTo(Homework o) {
                return this.score == o.score? this.day - o.day : o.score - this.score;
            }
        }
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine()); // 테케 갯수

            StringTokenizer st;
            PriorityQueue<Homework> pq = new PriorityQueue<>();
            
            int length = 0;
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                int day = Integer.parseInt(st.nextToken());
                int score = Integer.parseInt(st.nextToken());
                pq.add(new Homework(day, score));
                length = Math.max(day, length);
            }
            
            boolean[] checked = new boolean[length + 1];
            int answer = 0;
            
            while (!pq.isEmpty()){
                Homework homework = pq.poll();

                for (int day = homework.day; day > 0; day--) {
                    if (!checked[day]){
                        checked[day] = true;
                        answer += homework.score;
                        break;
                    }
                }
            }
            
            System.out.println(answer);
        }
    }