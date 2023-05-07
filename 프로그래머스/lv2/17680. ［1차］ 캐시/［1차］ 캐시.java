import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> cache = new ArrayList<>();

        if (cacheSize == 0) {
            return cities.length * 5; // 캐시 사이즈가 0일경우 전부 cache miss 이므로
        }
        
        for (String city : cities) {
            city = city.toLowerCase(); // 대소문자 구분을 하지 않으므로 모두 소문자로 변환
            int index = cache.indexOf(city); // 캐시에서 해당 도시가 있는 인덱스를 찾음
            if (index != -1) { // 캐시에 해당 도시가 있을 경우
                cache.remove(index); // 해당 도시를 삭제하고
                cache.add(city); // 캐시의 맨 뒤에 추가하여 최근에 사용되었음 표시
                answer += 1; // 실행시간을 1 증가
            } else { // 캐시에 해당 도시가 없을 경우
                if (cache.size() >= cacheSize) { // 캐시가 가득 찼으면
                    cache.remove(0); // 캐시의 맨 앞의 도시를 삭제하고
                }
                if (cacheSize > 0) { // 캐시 크기가 0이 아닐 경우
                    cache.add(city); // 해당 도시를 캐시에 추가하고
                }
                answer += 5; // 실행시간을 5 증가
            }
        }
        return answer;
    }
}
