import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();

            if (first == 0 && second == 0) {
                break;
            }

            if (second % first == 0) {
                System.out.println("factor");
            } else if (first % second == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }

        scanner.close();
    }
}
