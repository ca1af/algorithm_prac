import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int total = scanner.nextInt();
            int quantity = scanner.nextInt();

            int actualTotal = 0;

            while (scanner.hasNext()) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                actualTotal += a * b;
            }

            if (total == actualTotal)
                System.out.println("Yes");
            else System.out.println("No");
        }
    }