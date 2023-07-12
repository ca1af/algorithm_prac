import java.util.*;

class Solution {
    public static int solution(int[][] triangle) {
            int[][] copy = new int[triangle.length][];

            for (int i = 0; i < triangle.length; i++) {
                copy[i] = new int[triangle[i].length];
            }

            copy[0] = new int[]{triangle[0][0]}; // 첫 행 초기화

            for (int i = 1; i < triangle.length; i++) {
                for (int j = 0; j < triangle[i].length; j++) {
                    if (j == 0) {
                        copy[i][j] = copy[i - 1][j] + triangle[i][j];
                    } else if (j == triangle[i].length - 1) {
                        copy[i][j] = copy[i - 1][j - 1] + triangle[i][j];
                    } else {
                        int max = Math.max(copy[i - 1][j - 1] + triangle[i][j], copy[i - 1][j] + triangle[i][j]);
                        copy[i][j] = max;
                    }
                }
            }

            int max = Integer.MIN_VALUE;

            for (int i : copy[copy.length - 1]) {
                if (i > max) {
                    max = i;
                }
            }

            return max;
        }
}
