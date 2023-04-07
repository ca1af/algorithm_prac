class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        
        long round = Math.round(sqrt);
        
        if (n == round * round){
            return (long) Math.pow(round +1, 2);
        }
        else return -1L;
    }
}