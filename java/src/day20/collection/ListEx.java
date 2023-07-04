package day20.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		//1���� 5���� ���ʴ�� �߰�
		for(int i = 1; i<= 5; i++) {
			list.add(i);//���� i�� �ڽ����� Integer Ŭ������ ��ü�� �� �� list�� �߰�
		}
		//1�� �� �߰�
		list.add(1);
		System.out.println(list);
		//1�� ����
		boolean res = list.remove((Integer)1);//ù��° ������ 1�� �����ϰ� ���Ű� �Ǿ true�� ��ȯ
		System.out.println(res);
		System.out.println(list);
		//1������ �ִ� ��ü�� ����(3�� ����)
		Integer num = list.remove(1);//1������ �ִ� ��Ҹ� �����ϰ� ������ ��Ҹ� ��ȯ
		System.out.println(num);
		System.out.println(list);
		System.out.println(list.size());//����� ��ü ���� ���. ���� ������ �ִ� ��ü ���� �ƴ�.
		
		//�Ϲ�. ����Ʈ�� Ư�� ������ ������ �� �־ get()�� �̿��Ͽ� �ݺ����� Ȱ���� �� �ִ�.
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		//���� for��. List�� Set ��� ����
		for(int tmp : list) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		
		//Iterator
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer tmp = it.next();
			System.out.print(tmp + " ");
		}
		System.out.println();
		
		System.out.println(list.contains(1));//List�� 1�� �ִ��� ������ Ȯ��
		System.out.println(list.indexOf(1));//List�� 1�� ������� �ִ��� Ȯ��
	}

}
