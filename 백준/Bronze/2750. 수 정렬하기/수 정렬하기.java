import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int count = sc.nextInt();

            int[] arr = new int[count];

            for (int i = 0; i < count; i++) {
                arr[i] = sc.nextInt();
            }

            int n = arr.length;
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    if (arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            for (int i : arr) {
                System.out.println(i);
            }
        }
}