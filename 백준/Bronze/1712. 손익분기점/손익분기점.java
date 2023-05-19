import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fixedCharge = sc.nextInt();
        int cost = sc.nextInt();
        int profit = sc.nextInt();

        int quantity = 1;
        int margin = (quantity * profit) - fixedCharge - (cost * quantity);

        if (cost >= profit) {
            quantity = -1; 
        } else {
            quantity = fixedCharge / (profit - cost) + 1;
        }

        System.out.println(quantity);
    }
}
