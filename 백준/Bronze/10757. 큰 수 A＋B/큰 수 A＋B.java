import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String strA = scanner.next();
        String strB = scanner.next();

        BigInteger a = new BigInteger(strA);
        BigInteger b = new BigInteger(strB);

        BigInteger sum = a.add(b);

        System.out.println(sum.toString());
    }
}
