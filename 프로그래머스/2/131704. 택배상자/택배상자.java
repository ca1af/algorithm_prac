import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    private static Queue<Integer> products;
    private static Stack<Integer> assist;

    public int solution(int[] order) {
        int answer = 0;
        // 큐 하나 스택 하나가 있다
        products = new LinkedList<>();
        for (int i = 1; i <= order.length; i++) {
            products.offer(i);
        }

        assist = new Stack<>();

        return extracted(order);
    }

    private static int extracted(int[] order) {
        int answer = 0;

        for (int each : order) {
             if (products.isEmpty() && !assist.isEmpty()){
                if (assist.peek() != each){
                    break;
                }
            }
            while (true){
                // 1. 스택부터 확인한다. 없다면 넘긴다
                if (!assist.isEmpty()){
                    if (assist.peek() == each){
                        assist.pop();
                        answer++;
                        break;
                    }
                }

                // 0. each 가 나올 때 까지 하고, 없으면 break 한다.
                if (products.isEmpty()){
                    break;
                }

                // 2. 큐를 확인한다. 없으면 뽑는다
                if (products.peek() == each){
                    products.poll();
                    answer++;
                    break;
                }

                assist.add(products.poll());
            }
        }

        return answer;
    }


}