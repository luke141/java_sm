package day7.method;

public class SumMethodEx {

	public static void main(String[] args) {
		/* �� ������ ���� ���ϴ� �Լ�(�޼���)�� ���弼��. //�޼��� ��ġ�� Ŭ���� �ȿ� ��ġ�ؾ��Ѵ�
		 * 
		 */
		int num1 = 1, num2 = 2;
		int res = sum(1, 2);
		System.out.println(res);
	}
	/**
	 * ���    : �� ������ �־����� �� ������ ���� �˷��ִ� �޼���  
	 * �޼���� : sum
	 * ����Ÿ�� : �� ������ �� => int
	 * �Ű����� : �� ���� => 
	 * @return
	 * 
	 * */
	/**
	 * ���    : �� ������ �־����� �� ������ ���� �˷��ִ� �޼���
	 * @param num1 ����1
	 * @param num2 ����2
	 * @return �� ������ ��
	 */

	public static int sum(int num1, int num2) {
		int res = num1 + num2;
		return res;
		//return num1 + num2;
	}
}
