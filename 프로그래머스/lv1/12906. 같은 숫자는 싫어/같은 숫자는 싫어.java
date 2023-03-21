import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            if (stack.isEmpty() || stack.peek() != num) {
                stack.push(num);
            }
        }
        int[] resultArr = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            resultArr[i] = stack.pop();
        }
        return resultArr;
    }
}