package day5.practice;

public class PrintEvenNumberEx {

	public static void main(String[] args) {
		// 10������ ¦���� ����ϴ� ����
		
				/* ���1.
				 * �ݺ�Ƚ�� : i�� 1���� 5���� 1�� ����
				 * ��Ģ�� : 2*i�� ��� 
				 */
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
