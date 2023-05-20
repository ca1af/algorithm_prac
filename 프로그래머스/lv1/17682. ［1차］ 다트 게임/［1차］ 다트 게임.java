import java.util.*;

class Solution {
        public int solution(String dartResult) {
        int[] scores = new int[3];
        int idx = -1;

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            if (Character.isDigit(c)) {
                idx++;
                if (c == '1' && i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') {
                    scores[idx] = 10;
                    i++;
                } else {
                    scores[idx] = Character.getNumericValue(c);
                }
            } else if (c == 'S' || c == 'D' || c == 'T') {
                if (c == 'D') {
                    scores[idx] *= scores[idx];
                } else if (c == 'T') {
                    scores[idx] *= scores[idx] * scores[idx];
                }
            } else if (c == '*' || c == '#') {
                if (c == '*') {
                    if (idx > 0) {
                        scores[idx - 1] *= 2;
                    }
                    scores[idx] *= 2;
                } else if (c == '#') {
                    scores[idx] *= -1;
                }
            }
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        return sum;
    }

}