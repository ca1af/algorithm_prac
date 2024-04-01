import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    private static final List<Character> alphabets = new ArrayList<>();

    public static String solution(String s, String skip, int index) {
        for (int i = 0; i < 26; i++) {
            alphabets.add((char) ('a' + i));
        }

        index %= alphabets.size();

        List<Character> forRemoval = new ArrayList<>();
        for (char c : skip.toCharArray()) {
            forRemoval.add(c);
        }

        alphabets.removeAll(forRemoval);

        char[] charArray = s.toCharArray();

        StringBuilder answer = new StringBuilder();
        for (char c : charArray) {
            int i1 = alphabets.indexOf(c);

            answer.append(alphabets.get((i1 + index) % alphabets.size()));
        }

        return answer.toString();
    }
}