import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

    
public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 테케
            int M = Integer.parseInt(st.nextToken()); // 합칠양

            // 어차피 합치면 같은수라 카운트 안해도 된다

            PriorityQueue<Long> pq = new PriorityQueue<>();

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<N; i++) {
                pq.add(Long.parseLong(st.nextToken()));
            }

            for(int i=0; i<M; i++) {
                Long a = pq.poll();
                Long b = pq.poll();
                pq.add(a+b);
                pq.add(a+b);
            }

            long ans = 0;


            while(!pq.isEmpty()) {
                ans+=pq.poll();
            }
            System.out.println(ans);
        }
    }