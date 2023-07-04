package day21.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		/* Map�� �迭ó�� ����ϴ� ���� ���� �迭/���� ����Ʈ*/
		HashMap<Integer, Integer> map = new HashMap<>();
		//�迭 0������ 1, 1������ 2,... 4������ 5�� ����
		for(int i = 0; i < 5; i++) {
			map.put(i, i+1);
		}
		System.out.println(map);
		
		/* ���̵�, ����� �����ϴ� ���� */
		HashMap<String, String> map2 = new HashMap<>();
		map2.put("abc123", "1234567");
		map2.put("qwe1", "qwe123123");
		map2.put("abc123", "abc");//Key���� �ߺ��� ������ �߰�
		map2.put("zxc", "abc");
		System.out.println(map2);
		
		/* keySet�� �̿��� �ݺ���. key������ Set���� ���� �ݺ� */
		Set<String> keySet = map2.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String id = it.next();//key���� ������
			String pw = map2.get(id);//key��(id)�� �̿��ؼ� value���� ������
			System.out.println("id : " + id + ", pw : " + pw);
		}
		/* ����� key�� value�� ������ Entry�� �̿��Ͽ� map�� �ִ� key,value����
		 * Entry ��ü �ϳ��� �־� Set���� ����*/
		Set<Entry<String, String>> entrySet = map2.entrySet();
		
		Iterator<Entry<String, String>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Entry<String, String> tmp = it2.next();
			String id = tmp.getKey();
			String pw = tmp.getValue();
			System.out.println("id : " + id + ", pw : " + pw);
		}
	

}

}
