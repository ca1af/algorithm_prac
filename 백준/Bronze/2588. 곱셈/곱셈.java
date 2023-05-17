import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();

        int result1 = num1 * (num2 % 10);
        int result2 = num1 * ((num2 / 10) % 10);
        int result3 = num1 * (num2 / 100);
        int result4 = num1 * num2;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
