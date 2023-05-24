import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        int days = (V - B) / (A - B); // 총 이동 거리를 하루 이동 거리로 나눈 몫

        if ((V - B) % (A - B) != 0) { // 나머지가 있는 경우 하루를 더 추가
            days++;
        }

        System.out.println(days);
    }
}
