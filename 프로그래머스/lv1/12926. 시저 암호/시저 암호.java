class Solution {
public String solution(String s, int n) {
    // 빈 문자열이나 null 값이 입력된 경우 예외 처리
    if (s == null || s.length() == 0) {
        return s;
    }
    
    // 알파벳 대문자와 소문자를 분리해서 배열에 저장
    char[] upperCase = new char[26];
    char[] lowerCase = new char[26];
    for (int i = 0; i < 26; i++) {
        upperCase[i] = (char) ('A' + i);
        lowerCase[i] = (char) ('a' + i);
    }
    
    // 시저 암호 생성
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
        // 대문자인 경우
        if (c >= 'A' && c <= 'Z') {
            int index = (c - 'A' + n) % 26;
            sb.append(upperCase[index]);
        }
        // 소문자인 경우
        else if (c >= 'a' && c <= 'z') {
            int index = (c - 'a' + n) % 26;
            sb.append(lowerCase[index]);
        }
        // 알파벳이 아닌 경우
        else {
            sb.append(c);
        }
    }
    
    return sb.toString();
}
}