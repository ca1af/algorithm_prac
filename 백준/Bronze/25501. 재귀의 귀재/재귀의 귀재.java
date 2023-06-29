import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
        static int count = 1;
        public static int recursion(String s, int l, int r) {
            if (l >= r) return 1;
            else if (s.charAt(l) != s.charAt(r)) return 0;
            else {
                count++;
                return recursion(s, l + 1, r - 1);
            }
        }

        public static int isPalindrome(String s) {
            return recursion(s, 0, s.length() - 1);
        }

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine()); // 주어지는 케이스 개수

            for (int i = 0; i < N; i++) {
                String s = br.readLine();
                int palindrome = isPalindrome(s);
                System.out.println(palindrome + " " + count);
                count = 1;
            }
        }
    }