import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] charArray = Integer.toString(sc.nextInt()).toCharArray();
        
        Arrays.sort(charArray);

        StringBuilder sb = new StringBuilder();
        for (int i = charArray.length - 1; i >= 0; i--) {
            sb.append(charArray[i]);
        }

        int result = Integer.parseInt(sb.toString());
        System.out.println(result);
    }
}
