import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0, 0};
            
        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Comparator.reverseOrder());

        for (String operation : operations) {
            StringTokenizer st = new StringTokenizer(operation);

            String command = st.nextToken();
            int value = Integer.parseInt(st.nextToken());

            if (command.equals("I")) {
                minQ.add(value);
                maxQ.add(value);
            } else {
                if (!minQ.isEmpty()) {
                    if (value == 1) {
                        int max = maxQ.poll();
                        minQ.remove(max);
                    } else {
                        int min = minQ.poll();
                        maxQ.remove(min);
                    }
                }
            }
        }

        if (!minQ.isEmpty()) {
            answer[0] = maxQ.peek();
            answer[1] = minQ.peek();
        }

        return answer;
    }
}
