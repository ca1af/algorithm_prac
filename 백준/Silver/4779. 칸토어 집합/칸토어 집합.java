import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static char[] chars;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int N = sc.nextInt();
            int pow = (int) Math.pow(3, N); // 3의 N승
            chars = new char[pow];
            Arrays.fill(chars, '-'); // 다 채워놓고 초기화
            cantor(0, pow - 1);
            StringBuilder sb = new StringBuilder();
            for (char aChar : chars) {
                sb.append(aChar);
            }
            System.out.println(sb.toString());
        }

        sc.close();
    }

    public static void cantor(int startIdx, int endIdx) {
        if (startIdx >= endIdx) {
            return;
        }

        int length = endIdx - startIdx + 1;
        int third = length / 3;

        cantor(startIdx, startIdx + third - 1);
        Arrays.fill(chars, startIdx + third, startIdx + third * 2, ' ');
        cantor(startIdx + third * 2, endIdx);
    }
}
