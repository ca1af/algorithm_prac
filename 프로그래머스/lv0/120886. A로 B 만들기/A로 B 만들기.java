import java.util.*;

class Solution {
    public int solution(String before, String after) {
        HashMap<Character, Integer> map = new HashMap<>();
        int answer = 1;

        for (char c : before.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : after.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for (Character character : map.keySet()) {
            if (!Objects.equals(map.get(character), map2.get(character))){
                answer = 0;
            }
        }

        return answer;
    }
}