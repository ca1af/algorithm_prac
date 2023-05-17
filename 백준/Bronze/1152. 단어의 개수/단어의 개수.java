import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim(); // 문자열 입력 및 앞뒤 공백 제거

        if (input.isEmpty()) {
            System.out.println(0); // 입력이 공백인 경우 단어 개수는 0
        } else {
            String[] words = input.split("\\s+"); // 공백을 기준으로 문자열 분리
            System.out.println(words.length); // 분리된 단어 개수 출력
        }
    }
}
