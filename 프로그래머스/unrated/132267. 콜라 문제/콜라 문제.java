public class Solution {
    public int solution(int a, int b, int n) {
        int totalCola = 0;
        int emptyBottles = n;

        while (emptyBottles >= a) {
            int exchangedCola = emptyBottles / a;
            totalCola += exchangedCola * b; 
            emptyBottles = exchangedCola * b + emptyBottles % a;
        }

        return totalCola;
    }
}
