import java.util.HashMap;
import java.util.Map;

public class Hash_2 {

	public static void main(String[] args) {
		String[] phone_book = {"119", "97 674 223", "11 9552 4421"};
		
		Solution(phone_book);
	}
	
	public static boolean Solution(String[] number) {
		// HashMap ����
		Map<String, Integer> map = new HashMap<>();
		
		// HashMap �� ��� ��ȭ��ȣ �ֱ�
		for(int i=0 ; i<number.length ; i++) {
			map.put(number[i], i);
		}
		
		// ��� ��ȭ��ȣ�� substring �� HashMap �� �����ϴ��� Ȯ��
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
