package day7.practice;

import java.util.Scanner;

public class LCMEx {

	public static void main(String[] args) {
		/*�� ������ �Է¹޾� �� ������ �ּҰ������ ���ϴ� �ڵ带 �ۼ��ϼ���.
		 * 2�� ��� : 2, 4, 6, 8, 10, ....
		 * ����� : �������� �ִ� ���
		 * 6�� 8�� ����� : 24, 48, 72, ...
		 * �ּ� ����� : ����� �� ���� ���� ���
		 * 6�� 8�� �ּ� ����� : 24
		 * */
		//�� ���� �Է�
		// ���1
		/* �ݺ�Ƚ�� : i�� 1���� (num1*num2����) 1�� ����
		 * ��Ģ�� : i�� num1�� ����̰� i�� num2�� ����̸�
		 *        i��  ����� �ݺ��� ����
		 *        => i�� num1�� �������� �� �������� 0�� ����
		 *           i�� num2�� �������� �� �������� 0�� ���ٸ�
		 *           i�� ��� �� �ݺ����� ����
		 * �ݺ��� ���� �� : ����
		 * */
		int num1, num2;
		int i;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("input 2 numbers : ");
		for(i=1; ;i++ ) {
			if(i % num1 == 0 && i % num2 == 0) {
				System.out.println(i);
				break;
			}
		}
		/* // ���2
		/* �ݺ�Ƚ�� : i�� 1���� (num1*num2����) 1�� ����
		 * ��Ģ�� : i�� num2�� ����̸�
		 *        i��  ����� �ݺ��� ����
		 *        => i�� num2�� �������� �� �������� 0�� ���ٸ�
		 *           i�� ��� �� �ݺ����� ����
		 * �ݺ��� ���� �� : ����
		 * */
		for(i=1; ;i++ ) {
	if(i % num1 == 0 && i % num2 == 0) {
		System.out.println(i);
		break;
	}
}
		
		
		sc.close();

	}

}
