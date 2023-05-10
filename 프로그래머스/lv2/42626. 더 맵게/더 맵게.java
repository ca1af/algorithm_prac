import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(scoville.length);
        int answer = 0;

        for (int i : scoville) {
            pq.add(i);
        }

        while (pq.peek() < K){
            if (pq.size() == 1){
                return -1;
            }
            
            int min1 = pq.poll();
            int min2 = pq.poll();

            int newInt = min1 + min2 *2;
            pq.add(newInt);
            answer++;
        }

        return answer;
    }
}