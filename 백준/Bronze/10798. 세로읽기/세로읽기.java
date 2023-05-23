import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] lines = new String[5];
        int maxLength = 0;
        
        // 입력 받기
        for (int i = 0; i < 5; i++) {
            lines[i] = scanner.nextLine();
            maxLength = Math.max(maxLength, lines[i].length());
        }
        
        // 세로로 읽기
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < lines[j].length()) {
                    sb.append(lines[j].charAt(i));
                }
            }
        }
        
        System.out.println(sb.toString());
    }
}
