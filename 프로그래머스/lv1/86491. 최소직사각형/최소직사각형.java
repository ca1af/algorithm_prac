class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0; // 가로 길이 중 최대값
        int maxH = 0; // 세로 길이 중 최대값
        
        for (int i = 0; i < sizes.length; i++) {
            int w = sizes[i][0];
            int h = sizes[i][1];
            if (w < h) { // 가로와 세로를 바꿔서 저장
                int temp = w;
                w = h;
                h = temp;
            }
            if (w > maxW) { // 현재 명함의 가로 길이가 최대값보다 크면 최대값을 갱신
                maxW = w;
            }
            if (h > maxH) { // 현재 명함의 세로 길이가 최대값보다 크면 최대값을 갱신
                maxH = h;
            }
        }
        
        return maxW * maxH;
    }
}