import java.util.*;

class Solution {
        public static void reverseArray(String[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // String 배열을 스택으로 만드는 메소드
    public static Stack<String> arrayToStack(String[] arr) {
        Stack<String> stack = new Stack<>();
        for (String str : arr) {
            stack.push(str);
        }
        return stack;
    }
    
    public String solution(String[] cards1, String[] cards2, String[] goal) {
    reverseArray(cards1);
    reverseArray(cards2);

    Stack<String> stack1 = arrayToStack(cards1);
    Stack<String> stack2 = arrayToStack(cards2);

    String answer = "Yes";

    for (String s : goal) {
        if (!stack1.empty() && stack1.peek().equals(s)){
            stack1.pop();
        } else if (!stack2.empty() && stack2.peek().equals(s)){
            stack2.pop();
        } else {
            answer = "No";
            break;
        }
    }

    return answer;
}

}