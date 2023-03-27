class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int tryCount = 0;
        int removeCount = 0;
        while(!s.equals("1")){
            int length = s.length();
            s = s.replaceAll("0", "");
            tryCount += length - s.length(); // 0 뺀만큼의 길이를 알기 위해
            s = Integer.toBinaryString(s.length());
            removeCount ++;
        }
        answer[0] = removeCount;
        answer[1] = tryCount;
        return answer;
    }
}