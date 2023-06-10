import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] lectures = new int[N][2];

        for (int i = 0; i < N; i++) {
            lectures[i][0] = sc.nextInt();
            lectures[i][1] = sc.nextInt();
        }

        Arrays.sort(lectures, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(lectures[0][1]);

        for (int i = 1; i < N; i++) {
            if (lectures[i][0] >= pq.peek()) {
                pq.poll();
            }
            pq.offer(lectures[i][1]);
        }

        System.out.println(pq.size());

        sc.close();
    }
}
