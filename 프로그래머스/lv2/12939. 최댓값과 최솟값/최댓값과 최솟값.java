class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" "); // 공백을 기준으로 문자열을 분리하여 배열에 저장
        int[] intArr = new int[strArr.length]; // 정수형 배열을 선언하여 문자열 배열의 값을 정수로 변환하여 저장

        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        int min = intArr[0];
        int max = intArr[0];

        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] < min) {
                min = intArr[i]; // 최소값 갱신
            } else if (intArr[i] > max) {
                max = intArr[i]; // 최대값 갱신
            }
        }

        return min + " " + max; // 최소값과 최대값을 문자열로 변환하여 반환
    }
}
