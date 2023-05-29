import java.util.*;

 public class Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int ints = sc.nextInt();
            int targetNum = sc.nextInt();

            int[] arr = new int[ints];
            
            for (int i = 0; i < ints; i++) {
                arr[i] = sc.nextInt();
            }
            
            Arrays.sort(arr);

            int i = arr[ints - targetNum];

            System.out.println(i);
        }
    }