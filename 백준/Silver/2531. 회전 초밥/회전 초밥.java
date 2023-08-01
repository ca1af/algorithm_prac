import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N,d,k,c;
    static int sushi[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        sushi = new int[N+k-1];
        for(int i=0; i<N; i++) {
            sushi[i] = Integer.parseInt(br.readLine());
        }

        for(int i=N; i<N+k-1; i++) {
            sushi[i] = sushi[i-N];
        }

        int ans = 0;
        HashMap<Integer, Integer> eat = new HashMap<>();

        /* 첫 k개 초밥 저장 */
        for(int i=0; i<k; i++) {
            eat.compute(sushi[i], (k,v) -> v==null ? 1 : v+1);
        }
        if(!eat.containsKey(c)) {    // 쿠폰 초밥이 없으면 +1
            ans = eat.size()+1;
        }else ans = eat.size();

        /* 슬라이딩 윈도우 탐색 */
        for(int i=0; i<N-1; i++) {
            if(eat.get(sushi[i]) == 1) {    // 하나 남으면 삭제
                eat.remove(sushi[i]);
            }else {    // 아니면 -1
                eat.put(sushi[i], eat.get(sushi[i])-1);
            }
            // 오른쪽 것 추가
            eat.compute(sushi[i+k], (k,v) -> v==null ? 1 : v+1);

            if(!eat.containsKey(c)) {    // 쿠폰 초밥이 없으면 +1
                ans = Math.max(ans, eat.size()+1);
            }else {
                ans = Math.max(ans, eat.size());
            }
        }

        System.out.println(ans);
    }
}