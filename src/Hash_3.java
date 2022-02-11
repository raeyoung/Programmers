import java.util.HashMap;
import java.util.Iterator;

public class Hash_3 {

	public static void main(String[] args) {
		String[][] clothes = {{"yellowhat", "headgear"}
							 ,{"bluesunglasses", "eyewear"}
							 ,{"green_turban", "headgear"}};
		
		HashMap<String, Integer> map = new HashMap<>();
		// ���� �������� �����ϱ�
		for(String[] clothe : clothes) {
			String type = clothe[1];
			map.put(type, map.getOrDefault(type, 0) + 1);
		}
		
		// ���� ���� ��츦 �߰��Ͽ� ��� ���� ����ϱ�
		Iterator<Integer> it = map.values().iterator();
		int answer = 1;
		
		while(it.hasNext()) {
			answer *= it.next().intValue() + 1;
		}
		
		// �ƹ� ������ �ʵ� ���� ���� ��� ����ϱ�
		// return answer = -1;
	}

}
