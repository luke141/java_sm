package day19.exception;

public class NullPointerExceptionEx {

	public static void main(String[] args) {
		/* NullPointerException
		 * - ��ü�� null�� ���·� �޼���, ����� ȣ���ϴ� ��� �߻�
		 * */
		String str = null;
		//String str = "abc";
		System.out.println(str.substring(0));
		test(str);
	}

	/* �޼��带 ���� �� �Ű������� nullüũ�� �ݵ�� �ϴ°� ����. */
	public static void test(String str) {
		if(str == null) {
			return;
		}
		System.out.println(str.substring(0));
	}
}
