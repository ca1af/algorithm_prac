import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int solution(int[] array, int n) {
        int min=100;
        for(int i=0; i<array.length; i++) {
                if(Math.abs(array[i]-n)<min) {            //array의 i번째 정수와 n의 차가 min보다 작으면
                    min=Math.abs(array[i]-n);             //min 에 저장
                }
            }
        ArrayList<Integer> arr=new ArrayList<Integer>();  //가까운 수 최대 2개를 저장할 list   
            for(int i=0; i<array.length; i++) {
                if((Math.abs(array[i]-n))==(min)) {       //정수n과의 차가 min 이면
                    arr.add(array[i]);                    //list에 저장
                }
            }
        Collections.sort(arr);                            //오름차순으로 나열
        
        return arr.get(0);
        
    }
}
