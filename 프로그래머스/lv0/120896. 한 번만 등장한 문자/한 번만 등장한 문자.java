import java.util.*;

class Solution {
    public String solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for (Character character : map.keySet()) {
            if (map.get(character) == 1){
                sb.append(character);
            }
        }

        char[] charArray = sb.toString().toCharArray();
        Arrays.sort(charArray);

        return new String(charArray);
    }
}