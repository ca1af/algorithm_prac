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
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sortedArr = arr.clone(); // 여기서 주어진 배열이랑 똑같은 정수 배열을 하나 선언했어 .clone()으로
        // 그리고 정렬함
        Arrays.sort(sortedArr);

        HashMap<Integer, Integer> map = new HashMap<>(); // 맵 선언하고
        
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(sortedArr[i])) { 
                // 여기서, containsKey 함수는 "키가 있을경우" 니까, 키 없으면~ 이란뜻)
                map.put(sortedArr[i], index++); // 이미 해당하는 키가 없으면, map에다 넣는다.
            }
            
            //그림으로 그리면 이런거지
            // [-10 -9 2 4 4] 정수 배열을 돌면서, 아니지 솔트된배열돌지
            // -10, -> 맵에 키 없으니까 넣고 -> [-10, 0]
            // -9, -> 맵에 키 없으니까 넣고 -> [-9, 1]
            // 2 -> [2,2] 
            // 4 -> [4,3]
            // 4 -> 이미 KEY가 있네?(4) 넣지 않음
            
            // 따라서 맵은 [-10, 0], [-9, 1], [2,2], [4,3] 이렇게 되는거지?
           
            
            // 여기까지 ㅇㅋ? 그럼 맵에는 [arr[i], idx] 존재함
            //
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(map.get(arr[i])).append(" ");
            // n 만큼의 길이릐 배열이 주어지니까,
            //해당하는 숫자를 맵에서 찾아서 그 밸류(인덱스)를 넣어주는거지
        }
        System.out.println(sb.toString());
    }
}
