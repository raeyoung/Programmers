import java.util.HashMap;
import java.util.Map;

public class Hash_2 {

	public static void main(String[] args) {
		String[] phone_book = {"119", "97 674 223", "11 9552 4421"};
		
		Solution(phone_book);
	}
	
	public static boolean Solution(String[] number) {
		// HashMap 선언
		Map<String, Integer> map = new HashMap<>();
		
		// HashMap 에 모든 전화번호 넣기
		for(int i=0 ; i<number.length ; i++) {
			map.put(number[i], i);
		}
		
		// 모든 전화번호의 substring 이 HashMap 에 존재하는지 확인
		for(int i=0 ; i<number.length ; i++) {
			for(int j=0 ; j<number[i].length() ; j++) {
				if(map.containsKey(number[i].substring(0, j))) {
					return false;
				}
			}
		}
		return true;
	}

}
