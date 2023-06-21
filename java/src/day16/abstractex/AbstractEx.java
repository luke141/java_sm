package day16.abstractex;

public class AbstractEx {

	public static void main(String[] args) {
		//�߻� Ŭ������ �̿��Ͽ� ��ü�� ���� �� ����.
		//A a = new A();
		/* �������� ���� �߻�޼��带 ��ü �����Ŀ� �������̵��� ���ָ� ����.*/
		A a = new A() {
			public void test() {
				System.out.println("class A Test.");
			}
		};
		a.test();
		A a2 = new A() {
			public void test() {
				System.out.println("class A Test.");
			}
		};
		a2.test();
		//ChildA1�� �߻� Ŭ�����̱� ������ ChildA1���� ��ü�� ������ �� ����.
		//ChildA1 ca1 = new ChildA1();
		/* �߻� Ŭ������ ��ӹ��� ChildA2�� �Ϲ� Ŭ�����̱� ������ ��ü�� ������ �� �ִ�.*/
		//��� ����� �����Ǿ� �ִ� => ��ü ���� ����
		//��� ����� �����Ǿ� ���� �ʴ� => �߻� �޼��尡 �ִ� => ��ü ������ �Ұ���
		ChildA2 ca2 = new ChildA2();
		ca2.test();
		
		//������ : �ϳ��� ��ü�� ���� Ÿ���� ���� ��
		a = ca2;//��ĳ���ÿ� ���� ca2��ü�� a�� �ٷ� �� �ִ�.
		a.test();
		
	}

}


/* �߻� Ŭ������ �߻� �޼��带 ������ ����.
 * �߻� �޼��尡 �ִ� Ŭ������ abstract�� ������ ������ ���� �߻�
 * */
abstract class A{
	
	public abstract void test();
	//�޼��忡 final�� ������ �޼��� �������̵� �Ұ���
	public final void test2() {
		System.out.println("Test2");
	}
}
/* �߻� Ŭ���� ��� �޴� ���1.
 * �߻�Ŭ���� A�� ��ӹ��� �ڽ� Ŭ������ �߻� Ŭ������ ��������. */
abstract class ChildA1 extends A{
	/*
	//final �޼��带 �������̵� �� �� ����.
	public void test2() {
		
	}
	*/
}
/* �߻� Ŭ���� ��� �޴� ���2.
 * �θ� Ŭ������ �߻� �޼��带 �������̵��ؼ� ������ ����
 * */
class ChildA2 extends A{

	@Override
	public void test() {
		System.out.println("Test");		
	}
	
}