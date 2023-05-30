import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int i=0, j=arr.length-1;
        int cnt = 0;

        while(i < j) {
            if(arr[i] + arr[j] == M) {
                i++;
                j--;
                cnt++;
            }
            else {
                if(arr[i] + arr[j] > M) {
                    j--;
                }
                else {
                    i++;
                }
            }
        }

        bw.write(String.valueOf(cnt));

        br.close();
        bw.close();
    }
}