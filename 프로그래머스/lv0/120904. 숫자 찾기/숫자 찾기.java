class Solution {
    public int solution(int num, int k) {
        String strNum = String.valueOf(num); // 정수 num을 문자열로 변환

        for (int i = 0; i < strNum.length(); i++) {
            if (strNum.charAt(i) == (char)(k + '0')) { // 문자열에서 k와 같은 숫자를 찾음
                return i + 1; // 자리 수를 반환하기 위해 1을 더함
            }
        }

        return -1; // k가 없으면 -1을 반환
    }
}