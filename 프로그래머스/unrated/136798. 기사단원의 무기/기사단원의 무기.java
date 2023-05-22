class Solution {
        public int solution(int number, int limit, int power) {
            // number 까지 숫자들의 약수 집합을 구해서, 배열로 만든다.
            // 약수 집합 배열을 반복문으로 탐색하면서 limit 보다 큰 녀석은 power 로 재할당한다.

            int[] weapons = new int[number + 1];

            for (int i = 1; i <= number; i++) {
                int temp = 0;
                for (int j = 1; j <= Math.sqrt(i) ; j++) {
                    if (i % j == 0){
                        temp++;
                        int otherDivisor = i / j;
                        if (otherDivisor != j) {
                            temp++;
                        }
                    }
                }

                weapons[i] = temp;
                temp = 0;
            }

            for (int i = 0; i < weapons.length; i++) {
                if (weapons[i] > limit){
                    weapons[i] = power;
                }
            }

            int answer = 0;

            for (int weapon : weapons) {
                answer += weapon;
            }

            return answer;
        }

}