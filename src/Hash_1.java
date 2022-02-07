import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hash_1 {

	public static void main(String[] args) {
		// 프로그래머스 해시 함수 사용하기
		// 완주하지 못한 선수
		// 해시 (Hash) : 데이터를 다루는 기법 중 하나로 검색과 저장이 빠르다.
		// 빠르게 진행될 수 있는 이유는 데이터를 검색할 때 사용하는 key와 실제 데이터 값(value)이 한쌍으로 존재하고
		// key 값이 배열의 인덱스로 변환되기 때문에 검색과 저장이 평균적인 시간 복잡도가 0에 수렴한다.
		// 참여자 
		String[] participant = {"라이언", "죠르디", "어피치", "춘식"};

		// 완주자
		String[] completion = {"라이언", "죠르디", "어피치"};
		
		String answer = "";
		HashMap<String, Integer> map = new HashMap<>();
		
		// Hashmap 에 참여자 추가하기 
		for (String friends : participant) {
			map.put(friends, map.getOrDefault(friends, 0) + 1);
		}
		// Hashmap 에 완주자 제거하기
		for (String friends : completion) {
			map.put(friends, map.getOrDefault(friends, 0) - 1);
		}
		// HashMap.getOrDefault('B', 0) 함수는 B라는 key에 해당하는 value 가 있다면 가져오고 
		// 아닐 경우 0을 default로 지정하는 의미의 함수이다. 
		
		Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
		
		// Hashmap 을 돌면서 value 가 0이 아닌 사람 찾기
		while(iter.hasNext()) {	// if 가 아닌 while을 사용하는 이유는 무조건 1번 실행해야되기 때문 
			Map.Entry<String, Integer> entry = iter.next();
			if(entry.getValue() != 0) {
				answer = entry.getKey();
				break;
			}
		}
		// 완주하지 못한 선수
		System.out.println("answer : " + answer);
		
	}
}
