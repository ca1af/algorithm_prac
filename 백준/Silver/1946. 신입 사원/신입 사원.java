import java.util.*;
import java.io.*;

public class Main{
        static class Applicant{
            private int paper;
            private int interview;

            public Applicant(int paper, int interview) {
                this.paper = paper;
                this.interview = interview;
            }

        }
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            int N = Integer.parseInt(br.readLine()); // 테스트케이스의 갯수

            for (int i = 0; i < N; i++) {
                int M = Integer.parseInt(br.readLine()); // 신입사원들의 수

                ArrayList<Applicant> arr = new ArrayList<>();
                for (int j = 0; j < M; j++) {
                    st = new StringTokenizer(br.readLine());
                    int paper = Integer.parseInt(st.nextToken());
                    int interview = Integer.parseInt(st.nextToken());
                    arr.add(new Applicant(paper, interview));
                }

                arr.sort(new Comparator<Applicant>() { // 서류기준으로 정렬
                    @Override
                    public int compare(Applicant o1, Applicant o2) {
                        return o1.paper - o2.paper;
                    }
                });
                int answer = 1;
                int minInterview = arr.get(0).interview;

                for (Applicant applicant : arr) { // 높은녀석부터 하나씩 찾아가는 것
                    int interview = applicant.interview;
                    if (interview < minInterview) {
                        answer++;
                        minInterview = interview;
                    }
                }
                System.out.println(answer);
            }

        }
    }