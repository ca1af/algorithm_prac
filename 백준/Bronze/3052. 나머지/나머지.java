import java.util.HashSet;
import java.util.Scanner;

public class Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < 10; i++) {
                int anInt = sc.nextInt() % 42;
                set.add(anInt);
            }

            System.out.println(set.size());
        }
    }