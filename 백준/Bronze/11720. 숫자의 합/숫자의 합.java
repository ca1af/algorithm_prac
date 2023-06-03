import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt(); // 개수
            sc.nextLine();
            String s = sc.nextLine();
            
            int answer = 0;

            for (int i = 0; i < s.length(); i++) {
                answer += s.charAt(i) - '0';
            }

            System.out.println(answer);
        }
    }