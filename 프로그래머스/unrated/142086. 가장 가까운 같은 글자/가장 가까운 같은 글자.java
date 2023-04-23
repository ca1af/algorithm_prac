import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> positions = new HashMap<>(); // 각 글자의 위치를 저장할 맵

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (positions.containsKey(c)) {
                // 이미 나온 글자라면, 이전에 나온 위치와의 거리 계산
                int prevPosition = positions.get(c);
                answer[i] = i - prevPosition;
            } else {
                // 처음 나온 글자라면 -1로 초기화
                answer[i] = -1;
            }
            positions.put(c, i); // 현재 글자의 위치를 맵에 저장
        }

        return answer;
    }
}
