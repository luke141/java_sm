package day6.practicee;

public class PrimeNumberEx2 {

	public static void main(String[] args) {
		/* 2���� 100������ �Ҽ��� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * 
		 * */
		int i = 2, j, count;
		
		
		/* �ܺ� �ݺ��� : 2���� ���ڸ� ������Ű�� �ݺ���
		 * �ݺ�Ƚ�� : i�� 2���� 100���� 1�� ����
		 * ��Ģ�� : i�� �Ҽ��̸� i�� ���*/
		
		for( i = 2 ; i <= 100 ; i++ ) {
		/* ���� �ݺ��� : i�� �Ҽ����� Ȯ���ϴ� �ݺ���
		 * �ݺ�Ƚ�� : j�� 1���� i���� 1�� ����
		 * ��Ģ�� : j�� i�� ����̸� ����� ������ 1����
		 * �ݺ��� ���� �� : ����� ������ 2���̸� i�� ���
		 * */
		
		for(j = 1, count = 0 ; j <= i ; j++ ) {	 
			if(j % j == 0) {
				count++;
			}
		}
		
		if(count == 2) {
			System.out.println(i + " is a prime number.");
		}
		i++;

		}
	}
}
