import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String N = scanner.next(); // 주어진 수 N
        int B = scanner.nextInt(); // B진법
        
        int result = 0; // 10진법으로 변환된 결과
        
        for (int i = 0; i < N.length(); i++) {
            char c = N.charAt(i);
            int digit = 0;
            
            if (Character.isDigit(c)) { // 문자가 숫자인 경우
                digit = c - '0';
            } else { // 문자가 알파벳인 경우
                digit = c - 'A' + 10;
            }
            
            result = result * B + digit; // B진법을 10진법으로 변환
        }
        
        System.out.println(result);
    }
}
