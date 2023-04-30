class Solution {
    public int solution(int n) {
        int countOne = intToBinaryAndCountOne(n);
        n += 1 ;
        
        while (countOne != intToBinaryAndCountOne(n)){
            n++;
        }
        
        return n;
    }

    private int intToBinaryAndCountOne(int n) {
        int count = 0;
        String nToBinary = Integer.toBinaryString(n);
        char[] charArray = nToBinary.toCharArray();
        for (char c : charArray) {
            if (c == '1'){
                count++;
            }
        }
        return count;
    }
}