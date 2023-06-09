import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
        //4
        //2 3 1 이동에 필요한 거리
        //5 2 4 1 가격 , 사싦상 마지막 녀석은 필요가 없다
        // 5, 2, 4 까지만 초기화하면 된다 -> {2, 3, 1] // [5, 2, 4} 가격.

        // 1. 0번 인덱스(5) 에 있는 녀석은 무조건 구매를 해야한다. // 5 * 2 만큼 구매해야한다
        // 2. 다음 인덱스의 가격이 이전보다 적다면, 다음 인덱스에서 "이동에 필요한 거리"만큼 구매한다 // 2 * 3 만큼 구매해야 한다
        // 3. 만약 가격이 나보다 적은 녀서

        // 1. 0번 인덱스에서 무조건 구매
        // 2. 가격이 적은 녀석이 나올때까지 idx++해서, {5, 2, 1, 3} 이렇다치면 5-> 2에서 사고, 찾았으면 "나" 보다 가격이 적은 녀석이 나올때까지는 달려야지
        // 3. 만약 가격이 더 낮은 녀석이 나온다면 나 이후의 거리를 쭉 사는거지

        // 정리
        // 0번 인덱스에서 산다. 나보다 더 작은 녀석이 나올때까지
        // 0번 인덱스보다 작은녀석 (임의 i) 발견, i가 나오기 전까지 거리는 전부 0번 인덱스 가격 * 거리 만큼 구매해야 한다
        // i 번 인덱스부터 쭉 산다. i번 인덱스보다 작은 녀석이 나오면 거기까지만 사고 거기서부터는 더 작은 녀석으로 구매
        // 반복

        // 실제 구현 어떻게 되어야 할까
        // 5 -> 2 여기서 작은놈이 걸린다. 따라서 0번 도로만큼의 거리 이동 --> 인덱스간의 차이 - 1 ~
        // 예를 들어 { 5, 5, 2 } 에 {1, 2, 3} 이라면?
        // 5 가격으로 세번(1,2) 사고, 2가격으로 3번 사야함
        // 즉 해당하는 인덱스의 가격으로 걍 사면 되네. prices[i] * distances[i] += sum;
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine()) - 1; // 마지막 녀석은 입력받을 필요가 없으며, 경로간 거리는 N-1이므로 -1
            StringTokenizer st;
            int[] prices = new int[N];
            int[] distances = new int[N];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) { // 거리먼저 주어지므로 거리부터 받는다
                distances[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                prices[i] = Integer.parseInt(st.nextToken());
            }

            int lowerPrice = prices[0]; // 최저가를 갱신해주기 위함 {5 -> 2 -> 4 -> 4} 면 5에서 2로 갱신될것
            long sum = 0;

            for (int i = 0; i < prices.length; i++) {
                if (lowerPrice > prices[i]) lowerPrice = prices[i];
                sum += (long) lowerPrice * distances[i]; // 최저가를 갱신해가면서
            }

            System.out.println(sum);
        }
    }