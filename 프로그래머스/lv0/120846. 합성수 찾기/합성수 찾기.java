class Solution {
    public static int solution(int n) {
        int compositeCount = 0; // 합성수의 개수
        for (int i = 2; i <= n; i++) { // 1은 합성수가 아니므로 2부터 시작
            int divisorCount = 0; // 약수의 개수
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisorCount++;
                }
            }
            if (divisorCount >= 3) { // 약수의 개수가 3개 이상인 경우 합성수이므로 개수 증가
                compositeCount++;
            }
        }
        return compositeCount;
    }
}