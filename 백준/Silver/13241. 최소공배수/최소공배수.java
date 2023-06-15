import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long N = sc.nextInt();
            long M = sc.nextInt();

            long gcd = gcd(N, M);
            long lcm = lcm(N, M, gcd);


            System.out.println(lcm);
        }

        public static long gcd(long a, long b){
            if (b == 0) return a;
            return gcd (b, a % b);
        }

        public static long lcm(long a, long b, long gcd){
            return (a * b) / gcd;
        }
    }