import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        // 의상의 종류와 개수를 저장할 HashMap
        HashMap<String, Integer> clothesMap = new HashMap<>();
        
        // clothes 배열을 순회하며 의상의 종류와 개수를 카운트
        for (int i = 0; i < clothes.length; i++) {
            String type = clothes[i][1]; // 의상의 종류
            clothesMap.put(type, clothesMap.getOrDefault(type, 0) + 1);
        }
        
        int answer = 1;
        // 의상의 종류별로 (의상 개수 + 1)을 곱하여 경우의 수를 계산
        // +1은 해당 종류의 의상을 입지 않는 경우를 고려한 것이다.
        for (int count : clothesMap.values()) {
            answer *= (count + 1);
        }
        
        // 아무것도 입지 않는 경우는 제외하므로 1을 빼준다.
        return answer - 1;
    }
}
