import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
public int solution(int[][] routes) {
            int answer = 0;

            Arrays.sort(routes, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if (o1[1] == o2[1]){
                        return o1[0] - o2[0];
                    }
                    return o1[1] - o2[1];
                }
            });

            int prevEndSpeed = -30000;

            for (int[] route : routes) {
                if (route[0] > prevEndSpeed){
                    prevEndSpeed = route[1];
                    answer++;
                }
            }

            return answer;
        }
}