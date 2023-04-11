class Solution {
    public int solution(String my_string) {
        int sum = 0; // 자연수들의 합을 저장할 변수
        StringBuilder currentNumStr = new StringBuilder(); // 현재 처리 중인 연속된 숫자 문자열을 저장할 변수

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isDigit(c)) { // 현재 문자가 숫자인 경우
                currentNumStr.append(c); // 연속된 숫자 문자열에 추가
            } else { // 현재 문자가 숫자가 아닌 경우
                if (currentNumStr.length() > 0) { // 연속된 숫자 문자열이 있을 경우
                    int currentNum = Integer.parseInt(currentNumStr.toString()); // 현재 처리 중인 연속된 숫자 문자열을 정수로 변환
                    sum += currentNum; // 합에 현재 숫자를 더함
                    currentNumStr.setLength(0); // 현재 처리 중인 연속된 숫자 문자열 초기화
                }
            }
        }

        if (currentNumStr.length() > 0) { // 마지막으로 처리 중이던 연속된 숫자 문자열이 있을 경우
            int currentNum = Integer.parseInt(currentNumStr.toString()); // 현재 처리 중인 연속된 숫자 문자열을 정수로 변환
            sum += currentNum; // 합에 현재 숫자를 더함
        }

        return sum;
    }
}
