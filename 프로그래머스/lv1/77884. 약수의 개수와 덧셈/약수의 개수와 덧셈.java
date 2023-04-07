class Solution {
    public int solution(int left, int right) {
        int count = 0;
        int answer = 0;

        for (int i = left; i <= right; i++) {
            for (int j = 1; j <= right; j++) {
                if (i % j == 0){
                    count++;
                }
            }
            if (count % 2 == 0){
                answer += i;
            } else answer -= i;
            
            count = 0;
        }

        return answer;
    }
}