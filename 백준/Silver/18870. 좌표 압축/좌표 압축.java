import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // Read the input array
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // Create a sorted copy of the array
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        // Create a map to store the unique values and their corresponding indices
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(sortedArr[i])) {
                map.put(sortedArr[i], index++);
            }
        }

        // Print the indices of the original array
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }
        System.out.println(sb.toString());
    }
}
