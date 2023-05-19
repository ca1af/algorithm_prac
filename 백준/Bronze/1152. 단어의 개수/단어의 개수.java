import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine().trim(); 

        int count = 0;
        if (!line.isEmpty()) {  
            count = line.split("\\s+").length;
        }

        System.out.println(count);
    }
}
