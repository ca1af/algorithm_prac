import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int count = N / 4;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("long ");
        }
        sb.append("int");

        System.out.println(sb);
    }
}
