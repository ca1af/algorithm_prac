import java.util.*;

public class Main{
        // N=4인 경우를 생각해 보자. 카드는 제일 위에서부터 1234 의 순서로 놓여있다.
        // 1을 버리면 234가 남는다. 여기서 2를 제일 아래로 옮기면 342가 된다.
        // 3을 버리면 42가 되고, 4를 밑으로 옮기면 24가 된다.
        // 마지막으로 2를 버리고 나면, 남는 카드는 4가 된다.
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int target = sc.nextInt();
            Queue<Integer> queue = new LinkedList<>();

            for (int i = 1; i <= target; i++) {
                queue.offer(i);
            }

            while (queue.size() > 1){
                queue.poll();
                Integer toPush = queue.poll();
                queue.offer(toPush);
            }

            System.out.println(queue.poll());
        }
    }