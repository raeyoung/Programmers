import java.util.HashMap;
import java.util.Iterator;

public class Hash_3 {

	public static void main(String[] args) {
		String[][] clothes = {{"yellowhat", "headgear"}
							 ,{"bluesunglasses", "eyewear"}
							 ,{"green_turban", "headgear"}};
		
		HashMap<String, Integer> map = new HashMap<>();
		// 옷을 종류별로 구분하기
		for(String[] clothe : clothes) {
			String type = clothe[1];
			map.put(type, map.getOrDefault(type, 0) + 1);
		}
		
		// 입지 않은 경우를 추가하여 모든 조합 계산하기
		Iterator<Integer> it = map.values().iterator();
		int answer = 1;
		
		while(it.hasNext()) {
			answer *= it.next().intValue() + 1;
		}
		
		// 아무 종류의 옷도 입지 않은 경우 계산하기
		// return answer = -1;
	}

}
