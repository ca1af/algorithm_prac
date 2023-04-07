import java.util.Stack;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        int cnt = 0;
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            while (!stack.isEmpty() && stack.peek() < c && cnt < k) {
                stack.pop();
                cnt++;
            }
            if (cnt == k) {
                for (int j = i; j < number.length(); j++) {
                    answer.append(number.charAt(j));
                }
                break;
            }
            stack.push(c);
        }

        while (cnt < k) {
            stack.pop();
            cnt++;
        }

        while (!stack.isEmpty()) {
            answer.insert(0, stack.pop());
        }

        return answer.toString();
    }
}