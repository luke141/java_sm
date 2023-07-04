package day20.collection;

import java.util.ArrayList;

public class ListEx2 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1,1,1,"Hong"));
		list.add(new Student(1,1,2,"Ga"));
		list.add(new Student(1,1,3,"Na"));
		list.add(new Student(1,1,4,"La"));
		list.add(new Student(1,1,5,"Ma"));
		System.out.println(list);
		/* remove�޼���� ObjectsŬ������ equals�� ȣ��(Objects.equals(A,B))�ؼ� true�� ��츸 ����
		 * => A�� �ڱ� �ڽ�, B�� �����Ϸ��� ��ü
		 * => A�� B�� Ŭ������ �ٸ��� false�� ����
		 * => A�� B�� Ŭ������ ������ A.equals(B)�� ȣ���ؼ� ����� ����
		 * Student Ŭ������ equals�� �������̵� ���� ������ Student Ŭ������ equals�� �ּҸ� ��
		 * => �г�, ��, ��ȣ, �̸��� ������ ���� ��ü�� ������� ������ �ּҰ� �ٸ�
		 * => �ٸ� ��ü�� �Ǻ��ؼ� ������ �ȵ�
		 * */
		//list.remove(new Student(1,1,1,"Hong"));
		System.out.println(list);
		//contains, indexOf�� Objects.equals�� ȣ���ؼ� ���� ��ü�� ã��
		System.out.println(list.contains(new Student(1,1,1,"Hong")));
		System.out.println(list.indexOf(new Student(1,1,1,"Hong")));
	}

}
