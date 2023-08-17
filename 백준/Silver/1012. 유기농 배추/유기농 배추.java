import java.util.*;
import java.io.*;

public class Main {
        static BufferedReader br;
        static int[][] arr;
        static boolean[][] visited;
        static int row;
        static int column;
        static int[] dx = {-1, 0, 1, 0};
        static int[] dy = {0, -1, 0, 1};
        public static void main(String[] args) throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine()); // 테스트 케이스의 갯수
            for (int i = 0; i < N; i++) {
                int solution = solution();
                System.out.println(solution);
            }
        }

        static int solution() throws IOException {
            StringTokenizer st = new StringTokenizer(br.readLine());

            row = Integer.parseInt(st.nextToken()); // 가로
            column = Integer.parseInt(st.nextToken()); // 세로
            int N = Integer.parseInt(st.nextToken()); // 주어지는 테스트케이스

            arr = new int[row][column]; // 판별 어레이
            visited = new boolean[row][column]; // 방문여부

            for (int i = 0; i < arr.length; i++) {
                Arrays.fill(arr[i], 0);
                Arrays.fill(visited[i], false);
            }

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());

                int idx0 = Integer.parseInt(st.nextToken());
                int idx1 = Integer.parseInt(st.nextToken());

                arr[idx0][idx1] = 1;
            }

            int answer = 0;

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (!visited[i][j] && arr[i][j] == 1){
                        bfs(i, j);
                        answer++;
                    }
                }
            }

            return answer;
        }

        static void bfs(int x, int y){
            Queue<int[]> q = new LinkedList<>();
            q.add(new int[]{x,y});
            visited[x][y] = true;

            while (!q.isEmpty()){
                int[] polled = q.poll();

                for (int i = 0; i < 4; i++) {
                    int newX = polled[0] + dx[i];
                    int newY = polled[1] + dy[i];

                    if (newX >= row || newY >= column || newX < 0 || newY < 0) continue;

                    if (!visited[newX][newY]&& arr[newX][newY] == 1){
                        q.add(new int[]{newX, newY});
                        visited[newX][newY] = true;
                    }
                }
            }
        }
    }