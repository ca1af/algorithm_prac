import java.util.Scanner;

public class Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            char counter = s.charAt(0); // 맨 처음 놈으로 시작

            int count = 1;

            for (char c : s.toCharArray()) {
                if (c != counter){
                    counter = c;
                    count++;
                }
            }

            System.out.println(count / 2);
        }
    }