import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
        private static boolean[] isPrime;
        private static List<Integer> answerList = new ArrayList<>();
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken()); // strat
            int end = Integer.parseInt(st.nextToken()); // end

            isPrime = new boolean[100_000_001];

            Arrays.fill(isPrime, true);

            isPrime[0] = isPrime[1] = false;

            filter(end);

            addToList(start, end);

            for (Integer i : answerList) {
                System.out.println(i);
            }

            System.out.println(-1);
        }

        private static void filter(int end){
            for (int i = 2; i * i <= end; i++) {
                if (isPrime[i]){
                    for (int j = i * i; j <= end; j += i){
                        isPrime[j] = false;
                    }
                }
            }
        }

        public static void addToList(int start, int end){
            for (int i = start; i <= end; i++) {
                if (isPrime[i] && isPalindrome(i)){
                    answerList.add(i);
                }
            }
        }

        private static boolean isPalindrome(int i){
            String string = String.valueOf(i);
            for (int j = 0; j < string.length() / 2; j++) {
                if (string.charAt(j) != string.charAt(string.length() - j - 1)){
                    return false;
                }
            }
            return true;
        }
    }