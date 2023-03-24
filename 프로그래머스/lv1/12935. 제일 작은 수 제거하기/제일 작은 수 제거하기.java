class Solution {
public static int[] solution(int[] arr) {
    int minIndex = 0;
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < arr[minIndex]) {
            minIndex = i;
        }
    }

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