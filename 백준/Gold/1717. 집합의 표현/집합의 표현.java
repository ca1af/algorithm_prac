import java.util.*;
import java.io.*;

public class Main{
        static int[] parent;
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 집합의 개수는 N + 1
            int M = Integer.parseInt(st.nextToken()); // M 개만큼의 문제가 주어짐
            parent = new int[N+1];

            for (int i = 0; i < parent.length; i++) {
                parent[i] = i;
            }

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());

                int isOne = Integer.parseInt(st.nextToken());

                int first = Integer.parseInt(st.nextToken());
                int second = Integer.parseInt(st.nextToken());

                if (isOne == 0){
                    union(first, second);
                } else {
                    if (checkSame(first, second)){ // 같은 루트노드를 공유하는 확인
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
        static void union(int a, int b){
            a = find(a); // a의 루트노드
            b = find(b); // b의 루트노드
            if (a != b){
                parent[b] = a; // 첫번째놈 a 를 기준으로 유니언하므로, b의 루트노드를 a로 옮겨줌
            }
        }

        static int find(int a){
            if (a == parent[a]){
                return a;
            } else {
                return parent[a] = find(parent[a]);
            }
        }

        static boolean checkSame(int a, int b){ // 두 원소가 같은 집합인지 확인
            a = find(a);
            b = find(b);

            return a==b;
        }
    }