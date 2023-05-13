class Solution
{
    public int solution(int n, int a, int b) {
    int count = 0;

    while (n > 1) {
        a = (a + 1) / 2;
        b = (b + 1) / 2;
        count++;

        if (a == b) {
            return count;
        }

        n /= 2;
    }

    return count;
}


}