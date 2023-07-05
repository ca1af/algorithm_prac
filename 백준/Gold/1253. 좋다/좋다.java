import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 들어오는 수의 개수
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int ai = Integer.parseInt(st.nextToken());
            arrayList.add(ai);
        }

        Collections.sort(arrayList);

        int count = 0;

        for (int i = 0; i < N; i++) {
            int target = arrayList.get(i);
            int start = 0;
            int end = N - 1;

            while (start < end) {
                int sum = arrayList.get(start) + arrayList.get(end);

                if (sum == target) {
                    if (start != i && end != i) { // 합을 이루는 수가 서로 다른 위치에 있을 경우
                        count++;
                        break;
                    } else if (start == i) {
                        start++;
                    } else { // end == i
                        end--;
                    }
                } else if (sum > target) {
                    end--;
                } else { // sum < target
                    start++;
                }
            }
        }

        System.out.println(count);
    }
}
