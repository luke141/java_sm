package day6.practicee;

public class PrimeNumberEx {

	public static void main(String[] args) {
		/* 2���� 100������ �Ҽ��� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * 
		 * */
		int i = 1;
		while(i <= 5) {
			System.out.println(2*i);
			++i;
		}
		System.out.println("============");
		
		/* ���2.
		 * �ݺ�Ƚ�� : i�� 2���� 10���� 2�� ����
		 * ��Ģ�� : i�� ��� 
		 */
		i = 2;
		while(i <= 10) {
			System.out.println(i);
			i = i + 2;// i += 2;
		}
		System.out.println("============");
		
		/* ���3.
		 * �ݺ�Ƚ�� : i�� 1���� 10���� 1�� ����
		 * ��Ģ�� : i�� ¦���̸� i�� ��� 
		 */
		i = 1;
		while(i <= 10) {
			//i�� ¦���̸� i�� ��� 
			if(i % 2 == 0) {
				System.out.println(i);
			}
			++i;
		}

}

}
