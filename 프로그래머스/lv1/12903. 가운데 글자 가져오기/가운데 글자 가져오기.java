class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        if (s.length() % 2 == 0){
           sb.append(chars[s.length()/2 - 1]);
           sb.append(chars[s.length()/2]);
        } else {
            sb.append(chars[s.length()/2]);
        }
        return sb.toString();
    }
}