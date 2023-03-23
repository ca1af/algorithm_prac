class Solution {
public static int[] solution(int[] arr) {
    // 배열의 길이가 1인 경우 예외처리
    if (arr.length == 1) {
        return new int[] {-1};
    }
    
    // 배열에서 가장 작은 수의 인덱스를 찾음
    int minIndex = 0;
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < arr[minIndex]) {
            minIndex = i;
        }
    }
    
    // 가장 작은 수를 제외한 배열을 생성하여 반환
    int[] result = new int[arr.length - 1];
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
        if (i != minIndex) {
            result[j] = arr[i];
            j++;
        }
    }
    
    return result;
}
}