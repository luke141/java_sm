package day19.exception;

public class ExceptionEx1 {

	public static void main(String[] args) {
		/* num2�� ���� 0�̾ ������ ǥ�� �ȵ�
		 * ������, ���ܰ� �߻��ؼ� ���α׷��� �ߴ�.(ArithmeticException�� �߻�)
		 * �ڵ������ ������ ǥ�õ��� ������ �ǵ�ġ �ʰ� ���α׷��� �ߴܵǴ� ���
		 * =>RuntimeException
		 * */
		int num1 = 1, num2 = 0;
		
		System.out.println(num1/num2);
	}
}
class A implements Cloneable{
	/* clone �޼��带 �������̵� �ϱ� ���ؼ� Object Ŭ������ clone�� ȣ���ϸ�
	 * CloneNotSupportedException�� �߻��� �� �ִ�.
	 * CloneNotSupportedException�� RuntimeException Ŭ������ �ڽ� Ŭ������ �ƴϴ�.
	 * => �ݵ�� ����ó���� �ؾ���.
	 * */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public void test() /*throws ArithmeticException*/ {
		System.out.println(1/0);
	}
}
