import java.util.*;

public class Main {
    // heap, priority queue
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int initialCapacity = sc.nextInt();

        // 숫자와 절댓값을 함께 저장하는 클래스
        class Number implements Comparable<Number> {
            int value;
            int absValue;

            public Number(int value) {
                this.value = value;
                this.absValue = Math.abs(value);
            }

            @Override
            public int compareTo(Number o) {
                // 절댓값을 기준으로 오름차순 정렬
                if (this.absValue == o.absValue) {
                    // 절댓값이 같은 경우 원래 숫자를 기준으로 오름차순 정렬
                    return Integer.compare(this.value, o.value);
                } else {
                    return Integer.compare(this.absValue, o.absValue);
                }
            }
        }

        Number[] arr = new Number[initialCapacity];

        for (int i = 0; i < initialCapacity; i++) {
            arr[i] = new Number(sc.nextInt());
        }

        PriorityQueue<Number> pq = new PriorityQueue<>(initialCapacity);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].value == 0) {
                if (pq.isEmpty()) {
                    sb.append("0\n");
                } else {
                    Number poll = pq.poll();
                    sb.append(poll.value).append("\n");
                }
            } else {
                pq.add(arr[i]);
            }
        }

        System.out.println(sb.toString());
    }
}
