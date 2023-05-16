class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char[] chars = num_str.toCharArray();
        for (char a : chars){
            int b = Integer.parseInt(String.valueOf(a));
            answer += b;
        }
        return answer;
    }
}