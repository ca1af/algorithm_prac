class Solution {
    public String solution(String bin1, String bin2) {
        StringBuilder result = new StringBuilder();
        int carry = 0; // 올림

        // 문자열의 뒤부터 각 자리 덧셈 수행
        int i = bin1.length() - 1;
        int j = bin2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry; // 현재 자리의 합에 이전 자리에서의 올림 값을 더함

            if (i >= 0) {
                sum += bin1.charAt(i) - '0'; // char를 int로 변환하여 합산
                i--;
            }
            if (j >= 0) {
                sum += bin2.charAt(j) - '0'; // char를 int로 변환하여 합산
                j--;
            }

            result.insert(0, sum % 2); // 현재 자리의 결과 값(0 또는 1)을 결과 문자열의 가장 앞에 삽입
            carry = sum / 2; // 다음 자리로의 올림 값 계산
        }

        return result.toString();
    }
}
