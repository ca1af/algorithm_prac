import java.util.*;
import java.io.*;

public class Main {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken()); // 행의 개수
            int M = Integer.parseInt(st.nextToken()); // 열의 개수

            char[][] board = new char[N][M];

            // 체스판 입력 받기
            for (int i = 0; i < N; i++) {
                String s = br.readLine();
                for (int j = 0; j < M; j++) {
                    board[i][j] = s.charAt(j);
                }
            }

            int minCount = Integer.MAX_VALUE;

            // 체스판을 만들어가면서 최소 개수 찾기
            for (int i = 0; i <= N - 8; i++) {
                for (int j = 0; j <= M - 8; j++) {
                    int count1 = countChanges(board, i, j, 'W'); // 백으로 시작하는 경우
                    int count2 = countChanges(board, i, j, 'B'); // 흑으로 시작하는 경우
                    int min = Math.min(count1, count2);
                    minCount = Math.min(minCount, min);
                }
            }

            System.out.println(minCount);
        }

        public static int countChanges(char[][] board, int startRow, int startCol, char startChar) {
            int count = 0;
            char currChar = startChar;

            for (int i = startRow; i < startRow + 8; i++) {
                for (int j = startCol; j < startCol + 8; j++) {
                    if (board[i][j] != currChar) {
                        count++;
                    }
                    currChar = (currChar == 'W') ? 'B' : 'W';
                }
                currChar = (currChar == 'W') ? 'B' : 'W'; // 다음 행은 현재 열과 반대로 시작
            }

            return count;
        }
    }