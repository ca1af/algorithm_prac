import java.util.Scanner;

public class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int anInt = scanner.nextInt();
            
            int answer = 0;

            while (anInt != 0){
                answer += anInt;
                anInt --;
            }

            System.out.println(answer);
        }
    }