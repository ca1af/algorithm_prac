import java.util.*;
import java.io.*;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt(); // given

            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            int K = sc.nextInt(); // target

            Arrays.sort(arr); // 정렬

            //5 12 7 10 9 1 2 3 11 // K = 13
            //1 2 3 5 7 9 10 11 12
            //1 + 12 -> 13 //  2 + 12 -> 2 + 11 -> 13 // 3 + 11 -> 3 + 10 -> 13 ... 투포인터

            int count = 0;

            int startPointer = 0;
            int minusPointer = N - 1; // N 만큼의 크기이므로 인덱스는 - 1

            while (startPointer < minusPointer){
                if (arr[startPointer] + arr[minusPointer] == K){ // 타겟과 동일한 숫자일경우 스타터를 올리고
                    startPointer++;
                    count++;
                } else if (arr[startPointer] + arr[minusPointer] > K) { // 타겟보다 커질경우 마이너스 포인터를 하나 내린다(큰 숫자에서 빼줌)
                    minusPointer--;
                } else { // K보다 작을경우
                    startPointer++;
                }
            }

            System.out.println(count);
        }
    }