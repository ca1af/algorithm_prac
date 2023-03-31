class Solution {
    public int[] solution(int[] array) {
        int max = 0;
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                x = i;
                max = array[i];
            }
        }
        return new int[]{max, x};
    }
}