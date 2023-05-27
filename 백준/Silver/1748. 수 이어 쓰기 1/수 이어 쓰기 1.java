import java.util.*;

public class Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int test = 1;

            int targetInt = sc.nextInt();

            int digit = 1;

            int multiple = 10;

            int answer = 0;

            // targetInt -> 231 이라 치자.

            while (test <= targetInt){
                if (test % multiple == 0){
                    multiple *= 10;
                    digit++;
                }
                answer += digit;
                test++;
            }

            System.out.println(answer);
        }
    }