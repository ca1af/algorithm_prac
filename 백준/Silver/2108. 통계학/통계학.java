import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        int[] count = new int[8001];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            count[numbers[i] + 4000]++;
            sum += numbers[i];
        }

        Arrays.sort(numbers);

        int maxCount = 0;
        int mode = 0;
        boolean isSecond = false;

        for (int i = 0; i < 8001; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                mode = i - 4000;
                isSecond = false;
            } else if (count[i] == maxCount && !isSecond) {
                mode = i - 4000;
                isSecond = true;
            }
        }

        int mean = (int) Math.round((double) sum / N);
        int median = numbers[N / 2];
        int range = numbers[N - 1] - numbers[0];

        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);
    }
}
