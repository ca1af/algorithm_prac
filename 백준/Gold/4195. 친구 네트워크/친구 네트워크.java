import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    static int[] parent;
    static int[] rank;
    static int[] size;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 주어지는 문제들의 개수

        for (int t = 0; t < N; t++) {
            int M = Integer.parseInt(br.readLine()); // 주어질 관계도의 수
            parent = new int[2 * M];
            rank = new int[2 * M];
            size = new int[2 * M];

            for (int i = 0; i < 2 * M; i++) {
                parent[i] = i;
                rank[i] = 1;
                size[i] = 1;
            }

            Map<String, Integer> map = new HashMap<>();
            AtomicInteger currentID = new AtomicInteger();
            // 멀티 쓰레드 환경에서 안전한 래퍼 객체

            for (int j = 0; j < M; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String first = st.nextToken();
                String second = st.nextToken();

                int firstID = map.computeIfAbsent(first, k -> currentID.getAndIncrement());
                int secondID = map.computeIfAbsent(second, k -> currentID.getAndIncrement());

                int parent1 = findParent(firstID);
                int parent2 = findParent(secondID);

                if (parent1 != parent2) {
                    union(parent1, parent2);
                }

                System.out.println(size[findParent(firstID)]);
            }
        }
    }

    static int findParent(int x) {
        if (parent[x] != x) {
            parent[x] = findParent(parent[x]);
        }
        return parent[x];
    }

    static void union(int x, int y) {
        int parentX = findParent(x);
        int parentY = findParent(y);
        
        if (rank[parentX] > rank[parentY]) {
            parent[parentY] = parentX;
            size[parentX] += size[parentY];
        } else if (rank[parentX] < rank[parentY]) {
            parent[parentX] = parentY;
            size[parentY] += size[parentX];
        } else {
            parent[parentY] = parentX;
            size[parentX] += size[parentY];
            rank[parentX]++;
        }
    }
}
