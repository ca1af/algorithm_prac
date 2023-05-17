import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();

        int prize = 0;

        if (dice1 == dice2 && dice2 == dice3) {
            prize = 10000 + dice1 * 1000;
        } else if (dice1 == dice2 || dice1 == dice3) {
            prize = 1000 + dice1 * 100;
        } else if (dice2 == dice3) {
            prize = 1000 + dice2 * 100;
        } else {
            prize = Math.max(dice1, Math.max(dice2, dice3)) * 100;
        }

        System.out.println(prize);
    }
}
