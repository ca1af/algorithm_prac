import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            if (isGroupWord(word)) {
                count++;
            }
        }
        
        System.out.println(count);
    }
    
    public static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26];
        int prev = -1;
        
        for (int i = 0; i < word.length(); i++) {
            int current = word.charAt(i) - 'a';
            
            if (visited[current] && prev != current) {
                return false;
            }
            
            visited[current] = true;
            prev = current;
        }
        
        return true;
    }
}
