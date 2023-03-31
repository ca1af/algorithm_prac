import java.util.LinkedList;
import java.util.List;

class Solution {
    public Object[] solution(int n) {
        List<Integer> arr = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                arr.add(i);
            }
        }
        return arr.toArray();
    }
}