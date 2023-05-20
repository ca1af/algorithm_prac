import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        // k 는 최고점수, m은 개수, score 는 점수 분포 배열

        Arrays.sort(score);

        Stack<Integer> stack = new Stack<>();

        for (int i : score) {
            stack.push(i);
        }
        
        int[][] arr = new int[score.length / m][m];

        for (int i = 0; i < score.length / m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = stack.pop();
            }
        }
        
        int sum = 0;

        for (int[] ints : arr) {
            int i = Arrays.stream(ints).min().orElseThrow();
            sum += i * m;
        }
        return sum;
    }

}