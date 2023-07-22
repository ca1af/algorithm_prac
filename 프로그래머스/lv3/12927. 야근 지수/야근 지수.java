import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public long solution(int n, int[] works) {
            long answer = 0;

            PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

            for (int work : works) {
                pq.offer(work);
            }

            while (n > 0){
                if (!pq.isEmpty()){
                    Integer poll = pq.poll();
                    poll--;
                    n--;
                    pq.offer(poll);
                }
            }

            while (!pq.isEmpty()){
                Integer polled = pq.poll();
                if (polled > 0){
                    answer += Math.pow(polled, 2);
                }
            }

            return answer;
        }

}