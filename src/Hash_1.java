import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hash_1 {

	public static void main(String[] args) {
		// ���α׷��ӽ� �ؽ� �Լ� ����ϱ�
		// �������� ���� ����
		// �ؽ� (Hash) : �����͸� �ٷ�� ��� �� �ϳ��� �˻��� ������ ������.
		// ������ ����� �� �ִ� ������ �����͸� �˻��� �� ����ϴ� key�� ���� ������ ��(value)�� �ѽ����� �����ϰ�
		// key ���� �迭�� �ε����� ��ȯ�Ǳ� ������ �˻��� ������ ������� �ð� ���⵵�� 0�� �����Ѵ�.
		// ������ 
		String[] participant = {"���̾�", "�Ҹ���", "����ġ", "���"};

		// ������
		String[] completion = {"���̾�", "�Ҹ���", "����ġ"};
		
		String answer = "";
		HashMap<String, Integer> map = new HashMap<>();
		
		// Hashmap �� ������ �߰��ϱ� 
		for (String friends : participant) {
			map.put(friends, map.getOrDefault(friends, 0) + 1);
		}
		// Hashmap �� ������ �����ϱ�
		for (String friends : completion) {
			map.put(friends, map.getOrDefault(friends, 0) - 1);
		}
		// HashMap.getOrDefault('B', 0) �Լ��� B��� key�� �ش��ϴ� value �� �ִٸ� �������� 
		// �ƴ� ��� 0�� default�� �����ϴ� �ǹ��� �Լ��̴�. 
		
		Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
		
		// Hashmap �� ���鼭 value �� 0�� �ƴ� ��� ã��
		while(iter.hasNext()) {	// if �� �ƴ� while�� ����ϴ� ������ ������ 1�� �����ؾߵǱ� ���� 
			Map.Entry<String, Integer> entry = iter.next();
			if(entry.getValue() != 0) {
				answer = entry.getKey();
				break;
			}
		}
		// �������� ���� ����
		System.out.println("answer : " + answer);
		
	}
}
