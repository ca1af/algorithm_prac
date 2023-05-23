import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[][] answer = new int[9][9];

            int temp = 0;
            int a = 0;
            int b = 0;

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    int max = sc.nextInt();
                    if (max > temp){
                        temp = max;
                        a = i;
                        b = j;
                    }
                    answer[i][j] = max;
                }
            }

            System.out.println(temp);
            System.out.println((a +1)  + " " + (b + 1));
        }
    }