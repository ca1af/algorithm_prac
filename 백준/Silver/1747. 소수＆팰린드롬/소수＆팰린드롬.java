import java.util.*;
import java.io.*;

public class Main {
        static int[] arr = new int[10000001];
        public static void main(String[] args) {
            // 초기화
            for (int i = 2; i < arr.length; i++) {
                arr[i] = i;
            }

            isPrime();

            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();

            while (true) {
                if (arr[N] != 0 && isPalindrome(N)) {
                    System.out.println(N);
                    break;
                }
                N++;
            }
        }

        public static boolean isPalindrome(int N){
            String s = String.valueOf(N);
            char[] charArray = s.toCharArray();
            int startIdx = 0;
            int endIdx = s.length() - 1;

            while (startIdx < endIdx){
                if (charArray[startIdx] != charArray[endIdx]){
                    return false;
                }
                startIdx++;
                endIdx--;
            }

            return true;
        }

        public static void isPrime(){
            for (int i = 2; i < Math.sqrt(arr.length); i++) {
                if (arr[i] == 0) continue;
                for (int j = i + i; j < arr.length; j += i) {
                    arr[j] = 0;
                }
            }
        }
    }