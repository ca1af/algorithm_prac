import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            // 요구사항 - N개만큼 주어지는 수들 중, 2개의 조합으로 절대값이 가장 작은 수를 만들 수 있는 경우를 찾고, 그 두 수를 리턴해라

            // 투 포인터로 풀 수 있나?
            // -2 4 -99 -1 98 매 라인마다 투포인터?

            // -2, 4 로 시작해서 long temp = Math.abs(-2 + 4) 저장
            // startIdx, endIdx 해서 쭉쭉 만나게해보자

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine()); // N개 만큼 주어지는 수들
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr); // 정렬해줌

            int startPointer = 0;
            int endPointer = N - 1; // 인덱스에 대한 탐색을 하므로

            long temp = Integer.MAX_VALUE;

            int[] answer = new int[2]; // 합친 두 너석들을 넣어주기 위함

            while (startPointer < endPointer){ // 둘이 만나기 전에 브레이크 해야함
                int sum = arr[startPointer] + arr[endPointer]; // 포인터 옮겨주는 옵션 넣어주려고
                int value = Math.abs(arr[startPointer] + arr[endPointer]);

                if (value < temp){ // 두 개를 합친 값이 temp보다 작으면
                    temp = value;
                    answer[0] = arr[startPointer]; // 무조건 왼쪽놈이 작으므로(정렬됨)
                    answer[1] = arr[endPointer];
                }

                if (sum > 0) endPointer--;
                else startPointer++;

            }

            System.out.println(answer[0] + " " + answer[1]);
        }
    }