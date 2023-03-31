import java.util.Arrays;

class Solution {
    public String solution(String rsp) {
        // 가위는 2 바위는 0 보는 5
        char[] chars = rsp.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (char aChar : chars) {
            if (aChar == '2') {
                sb.append("0");
            } else if (aChar == '0') {
                sb.append("5");
            } else {
                sb.append("2");
            }
        }

        return sb.toString();
    }
}