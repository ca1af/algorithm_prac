import java.util.*;
import java.io.*;

public class Main {
        static ArrayList<Integer>[] edges;
        static int[] isVisited;
        static int order = 1;
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 노드 수
            int M = Integer.parseInt(st.nextToken()); // edges
            int start = Integer.parseInt(st.nextToken()); // 시작노드

            isVisited = new int[N + 1];
            Arrays.fill(isVisited, 0); // 0으로 초기화
            edges = new ArrayList[N + 1];
            for (int i = 1; i <= N; i++) {
                edges[i] = new ArrayList<>();
            }

            for (int i = 1; i <= M; i++) { // 1부터 5까지 되잖아?...
                st = new StringTokenizer(br.readLine());
                int startNode = Integer.parseInt(st.nextToken());
                int endNode = Integer.parseInt(st.nextToken());
                edges[startNode].add(endNode); // 양방향 간선 추가
                edges[endNode].add(startNode);
            }

            for (int i = 1; i <= N; i++) {
                edges[i].sort(Comparator.reverseOrder());
            }

            BFS(start);

            for (int i = 1; i < isVisited.length; i++) {
                System.out.println(isVisited[i]);
            }
        }
        public static void BFS(int start){
            Queue<Integer> q = new LinkedList<>();

            q.add(start);
            isVisited[start] = order;

            while (!q.isEmpty()){
                Integer polled = q.poll();

                for (Integer integer : edges[polled]) {
                    if (isVisited[integer] == 0){
                        isVisited[integer] = ++order;
                        q.add(integer);
                    }
                }
            }
        }
    }