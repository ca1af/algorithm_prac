import java.util.*;

public class Main{
        public static void main(String[] args) {
            // 점화식 세워보자
            // 1 { 1 }
            // 2 { 00, 11}
            // 3 { 001, 100, 111} // 2번 녀석에다가 1번 녀석 앞뒤로 붙인 꼴
            // 5 { 0011, 0000, 1001, 1100, 1111} // 3번 녀석에다가 2번의 개수만큼 붙인 꼴
            // 8 { 00111, 00001, 10000, 11100, 11111, 10011, 11001}

            int[] ints = new int[1000001];


            ints[1] = 1;
            ints[2] = 2;
            ints[3] = 3;

            for (int i = 4; i < ints.length; i++) {
                ints[i] = (ints[i-1] + ints[i-2]) % 15746;
            }

            Scanner sc = new Scanner(System.in);

            int i = sc.nextInt();

            System.out.println(ints[i]);
        }
    }