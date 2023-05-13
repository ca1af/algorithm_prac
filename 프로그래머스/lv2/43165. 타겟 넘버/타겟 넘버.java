class Solution {
    public int solution(int[] numbers, int target) {
        int answer = dfs(numbers, target, 0, 0);
        return answer;
    }

    private int dfs(int[] numbers, int target, int sum, int index) {
        if (index == numbers.length) {
            if (sum == target) {
                return 1;
            } else {
                return 0;
            }
        }

        int count = 0;
        count += dfs(numbers, target, sum + numbers[index], index + 1);
        count += dfs(numbers, target, sum - numbers[index], index + 1);
        return count;
    }
}
