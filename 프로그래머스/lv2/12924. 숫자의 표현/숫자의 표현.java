class Solution {
    public int solution(int n) {
        int answer = 0;

        int start = 1;
        int end = 1;

        while (start <= n){

            int sum = 0;

            for (int i = start; i <= end ; i++) {
                sum += i;
            }
            
            if (sum == n) { 
                answer++; 
                start++; 
            } else if (sum < n) { 
                end++;
            } else { 
                start++; 
            }
        }

        return answer;
    }
    
}