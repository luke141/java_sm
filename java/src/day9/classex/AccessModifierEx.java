package day9.classex;

import day9.classex2.B;

public class AccessModifierEx {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();

		//AccessModifier Ŭ������ A Ŭ������ ���� ��Ű���� �ִ� Ŭ����
		//AccessModifier Ŭ������ B Ŭ������ �ٸ� ��Ű���� �ִ� Ŭ����
		//num3�� ���������ڰ� public. ���� ��Ű���̵� �ƴϵ� ��� ���� 
		a.num3 = 10;
		b.num3 = 20;
		
		//num2�� ���������ڰ� ����Ʈ(������). 
		//�ٸ� ��Ű���� �ִ� B Ŭ������ ��ü�� �ִ� num2�� ������ �ȵ�
		a.num2 = 10;
		//b.num2 = 20;
		
		//num1�� ���������ڰ� private.
		//���� ��Ű���̵� �ƴϵ� �ٸ� Ŭ�������� ������ �� ����
		//a.num1 = 10;
		//setter�� ���� ���� ����
		a.setNum1(10);
		//getter�� ���� ���� ������
		System.out.println(a.getNum1());
		//b.num2 = 20;
	}

}

class A{
	private int num1;
	int num2;
	public int num3;
	/**Ŭ���� A�� ��ü ���� �� num1�� ����ϴ� �޼���
	 * �Ű����� : ���� => �̹� �˰� �ִ� �� ���� num1�̱� ������
	 * ����Ÿ�� : ���� => void
	 * �޼���� : print
	 * */
	public void print() {
		//num1�� private�̱� ������ AŬ������ �޼��忡�� ȣ�� �� �� �ִ�.
		//�̹� �˰��ִ� �� ������ Ȱ���ϴ� ��� �Ű������� ���޹��� �ʾƵ� ��.
		System.out.println(num1);
	}
	
	//private���� �� num1�� �����ϱ� ���ؼ� getter�� �߰�
	public int getNum1() {
		return num1;
	}
	//private���� �� num1�� ���� �����ϱ� ���ؼ� setter�� �߰�
	public void setNum1(int _num1) {
		num1 = _num1;
	}
}
		

