class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pValue = Long.parseLong(p);
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String subString = t.substring(i, p.length() + i);
            if (Long.parseLong(subString) <= pValue) {
                answer++;
            }
        }
        return answer;
    }
}