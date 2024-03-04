import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int trialCount;
    public static int[] numbers;
    public static int[] operations;

    public static int MAX = Integer.MIN_VALUE;
    public static int MIN = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        trialCount = Integer.parseInt(br.readLine());
        numbers = new int[trialCount];
        operations = new int[4];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < trialCount; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < operations.length; i++) {
            operations[i] = Integer.parseInt(st.nextToken());
        }

        dfs(numbers[0], 1); // 다음 연산자를 지칭해야 하므로 0 번인덱스는 1번 인덱스와~

        System.out.println(MAX);
        System.out.println(MIN);
    }

    public static void dfs(int number, int depth){
        if (depth == trialCount) {
            MAX = Math.max(MAX, number);
            MIN = Math.min(MIN, number);
            return;
        }

        for (int i = 0; i < operations.length; i++) {
            if (operations[i] == 0){
                continue;
            }

            operations[i]--;

            switch (i){
                case 0 : dfs(number + numbers[depth], depth + 1); break;
                case 1 : dfs(number - numbers[depth], depth + 1); break;
                case 2 : dfs(number * numbers[depth], depth + 1); break;
                case 3 : dfs(number / numbers[depth], depth + 1); break;
            }

            operations[i]++;
        }
    }
}
