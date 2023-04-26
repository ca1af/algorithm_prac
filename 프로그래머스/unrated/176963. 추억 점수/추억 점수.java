import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> nameIdxMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            nameIdxMap.put(name[i], i);
        }

        List<Integer> answer = new ArrayList<>();
        for (String[] pic : photo) {
            int score = 0;
            for (String nameInPic : pic) {
                if (nameIdxMap.containsKey(nameInPic)) {
                    int idx = nameIdxMap.get(nameInPic);
                    score += yearning[idx];
                }
            }
            answer.add(score);
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}
