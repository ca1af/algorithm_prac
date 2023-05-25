import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String line = sc.nextLine();

            String poliomino = poliomino(line);

            System.out.println(poliomino);

            sc.close();
        }

        private static String poliomino(String line) {
            int idx = 0;

            StringBuilder sb = new StringBuilder();

            while (idx < line.length()){
                if (line.charAt(idx) == 'X'){
                    int count = 0;
                    while (idx < line.length() && line.charAt(idx) == 'X'){
                        count++;
                        idx++;
                    }

                    if (count % 2 != 0){
                        return "-1";
                    }

                    while (count >= 4){
                        sb.append("AAAA");
                        count -= 4;
                    }

                    while (count >= 2){
                        sb.append("BB");
                        count -= 2;
                    }
                } else {
                    sb.append(".");
                    idx++;
                }
            }

            return sb.toString();
        }
    }