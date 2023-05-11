class Solution {
    public int solution(String s) {
        String[] elements = s.split(" ");
        int result = 0;
        int prevNum = 0;

        for (String element : elements) {
            if (element.equals("Z")) {
                result -= prevNum;
            } else {
                int num = Integer.parseInt(element);
                result += num;
                prevNum = num;
            }
        }

        return result;
    }
}