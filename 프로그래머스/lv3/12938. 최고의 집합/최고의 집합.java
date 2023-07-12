import java.util.*;

class Solution {
    public int[] solution(int n, int s) { // n 은 배열의 크기, s 배열 값들의 총합
            int[] answer = new int[n];

            if (n > s) {
                return new int[]{-1};
            }


            if (s % n == 0){
                Arrays.fill(answer, s / n);
            } else {
                Arrays.fill(answer, s / n);
                for (int i = 0; i < s % n; i++) {
                    answer[n - 1 - i] ++; // 마지막부터 하나씩 ++
                }
            }

            return answer;
        }
}