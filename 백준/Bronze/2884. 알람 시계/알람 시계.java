import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        minute -= 45;
        if (minute < 0) {
            hour -= 1;
            minute += 60;
        }
        if (hour < 0) {
            hour = 23;
        }

        System.out.println(hour + " " + minute);
    }
}
