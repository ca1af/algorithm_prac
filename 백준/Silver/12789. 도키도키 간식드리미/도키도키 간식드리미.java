import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 학생 수
        int[] students = new int[n]; // 학생들의 도착 순서 배열

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            students[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>(); // 대기열을 나타낼 스택
        int expectedNum = 1; // 기대하는 번호

        for (int i = 0; i < n; i++) {
            // 현재 기대하는 번호와 일치하면 대기열에서 제거
            while (!stack.isEmpty() && stack.peek() == expectedNum) {
                stack.pop();
                expectedNum++;
            }

            // 현재 학생의 번호와 일치하면 기대하는 번호를 증가시킴
            if (students[i] == expectedNum) {
                expectedNum++;
            } else {
                stack.push(students[i]); // 일치하지 않으면 대기열에 추가
            }
        }

        // 스택에 남은 학생들을 처리
        while (!stack.isEmpty() && stack.peek() == expectedNum) {
            stack.pop();
            expectedNum++;
        }

        // 남은 학생이 없으면 "Nice" 출력, 아니면 "Sad" 출력
        if (stack.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}
