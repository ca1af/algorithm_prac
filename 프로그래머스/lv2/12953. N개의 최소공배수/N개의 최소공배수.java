class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            answer = lca(answer, arr[i]);
        }
        return answer;
    }
    
    public static int lca(int a, int b) {
        int gcd = gcd(a, b);
        return a * b / gcd;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
