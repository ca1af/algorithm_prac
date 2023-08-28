import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static ArrayList<Long> solution(long num){
        ArrayList<Long> fivo = new ArrayList<>();
        ArrayList<Long> answer = new ArrayList<>();
        fivo.add(0L);
        fivo.add(1L);
        int index = 2;
        
		//주어진 수보다 작은 피보니치 리스트를 만든다
        while (true) {
            long plusNum = fivo.get(index - 1) + fivo.get(index - 2);
            if(plusNum > num) break;
            fivo.add(plusNum);
            index++;
        }

        Collections.sort(fivo,Collections.reverseOrder());
		
        //주어진 수를 피보나치 리스트에서 큰 값부터 빼가며 0 을 만든다.
        while(num != 0) {
            for (int i = 0; i < fivo.size(); i++) {
            	//빼줄 때 피보나치의 값이 num보다 큰지 확인
                if (fivo.get(i) <= num) {
                    num -= fivo.get(i);
                    answer.add(fivo.get(i));
                }
            }
        }

        Collections.sort(answer);
        answer.remove(0);
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            long num = sc.nextInt();

            for (long x : solution(num)) {
                System.out.printf(x + " ");
            }
            System.out.println();

        }

    }
}