class Solution {
    public String solution(String s) {
        String answer = "";
        String[] words = s.toLowerCase().split("");
        boolean isFirst = true;

        for(String word : words) {
            answer += isFirst ? word.toUpperCase() : word;
            isFirst = word.equals(" ");
        }

        return answer;
    }
}
