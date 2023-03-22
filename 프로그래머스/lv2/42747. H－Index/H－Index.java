import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        // 배열을 오름차순으로 정렬
        Arrays.sort(citations);

        int length = citations.length;
        int h = 0;

        for (int i = 0; i < length; i++) {
            if (citations[i] >= length - i) {
                // 정렬되었으므로 length - i 보다 크다면 위에놈들도 다 크거나 같을거임.
                h = length - i;
                break;
            }
        }
        return h;
    }
}