import java.util.*;
import java.io.*;

public class Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long N = sc.nextLong();
            long answer = 0;
            long sum = 0;
            for (long i = 1; ; i++) {
                if (sum > N) break;
                sum += i;
                answer++;
            }

            System.out.println(answer - 1);
        }
    }