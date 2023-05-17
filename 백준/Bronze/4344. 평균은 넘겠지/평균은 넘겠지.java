import java.util.Scanner;

public class Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int problems = sc.nextInt();

            for (int i = 0; i < problems; i++) {
                int students = sc.nextInt();
                int[] scores = new int[students];

                int sum = 0;
                for (int j = 0; j < students; j++) {
                    scores[j] = sc.nextInt();
                    sum += scores[j];
                }

                double average = (double) sum / students;

                int decentStudents = 0;

                for (int k = 0; k < scores.length; k++) {
                    if (scores[k] > average){
                        decentStudents++;
                    }
                }

                double aboveAverageRatio = (double) decentStudents / students * 100;
                System.out.printf("%.3f%%\n", aboveAverageRatio);
            }
            
            sc.close();
        }
    }