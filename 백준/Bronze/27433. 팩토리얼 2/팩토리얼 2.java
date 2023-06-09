import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int given = sc.nextInt();

            long fact = fact(given);

            System.out.println(fact);
        }
        
        public static long fact(int given){
            if (given <= 1){
                return 1;
            }
            return given * fact(given - 1);
        }
    }