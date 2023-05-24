import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int target = sc.nextInt();
            int amount = sc.nextInt();

            Queue<Integer> queue = new LinkedList<>();

            for (int i = 1; i <= target; i++) {
                if (target % i == 0){
                    queue.add(i);
                }
            }
            
            int answer = 0;

            for (int i = 0; i < amount; i++) {
                if (!queue.isEmpty()){
                    answer = queue.poll();   
                } else {
                    answer = 0;
                    break;
                }
            }

            System.out.println(answer);

        }
    }