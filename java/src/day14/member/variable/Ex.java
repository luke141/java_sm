package day14.member.variable;

public class Ex {

	public static void main(String[] args) {
		/* ��� ���� �ʱ�ȭ ����
		 * ��ü ������� num �ʱ�ȭ ����
		 * 1. �⺻�� : int�� �⺻���� 0���� �ʱ�ȭ
		 * 2. ������ �ʱ�ȭ : ������� ����� ���ÿ� �ʱ�ȭ �Ǵ� �� => 1
		 * 3. �ʱ�ȭ ���� : {}�� �� �ʱ�ȭ ���Ͽ��� �ʱ�ȭ => 2
		 * 4. ������ : �����ڿ��� �ʱ�ȭ =>3
		 * */
		System.out.println(TestA.num2);
		
		TestA a = new TestA();
		System.out.println(a.num);
		
		System.out.println(TestA.num2);
	}

}

class TestA{
	int num = 1;
	//�ʱ�ȭ ����
	{
		num = 2;
	}
	public TestA() {
		num = 3;
		num2 = 3;
	}
	
	static int num2 = 1;
	//���� �ʱ�ȭ ����
	static {
		num2 = 2;
	}
}