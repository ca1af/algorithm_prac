import java.util.HashMap;

class Solution {
    public String solution(String my_string) {
        // 해쉬맵으로, 키에다가 넣어주기 ( 중복 안되니까)
        HashMap<Character, Boolean> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (!map.containsKey(c)){
                sb.append(c);
                map.put(c, true);
            }
        }
        return sb.toString();
    }
}