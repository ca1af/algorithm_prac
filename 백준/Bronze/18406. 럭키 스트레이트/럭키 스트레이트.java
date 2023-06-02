import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int length = n.length();
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < length / 2; i++) {
            sumLeft += n.charAt(i) - '0';
        }

        for (int i = length / 2; i < length; i++) {
            sumRight += n.charAt(i) - '0';
        }

        if (sumLeft == sumRight) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }
    }
}
