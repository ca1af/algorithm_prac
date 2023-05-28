import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        Arrays.sort(numbers);

        int median = numbers[2];
        int average = sum / 5;

        System.out.println(average);
        System.out.println(median);
    }
}
