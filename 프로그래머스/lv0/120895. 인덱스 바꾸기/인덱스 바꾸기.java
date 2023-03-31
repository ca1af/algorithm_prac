import java.util.Arrays;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] chars = my_string.toCharArray();
        char a = chars[num1];
        chars[num1] = chars[num2];
        chars[num2] = a;
        
        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            sb.append(aChar);
        }

        return sb.toString();
    }
}