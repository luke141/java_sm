package day8.practice;

import java.util.Scanner;

public class MethodGCDEx {

	public static void main(String[] args) {
		//���� num1�� num2�� �Է¹޾� �� ������ �ִ� ������� ���ϴ� �ڵ带 �ۼ��ϼ���.
		//��, �޼��带 �̿��� ��.
		int num1, num2;
		Scanner sc = new Scanner(System.in);

		System.out.println("input 2 numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		int gcd = gcd(num1,num2);
		
		System.out.println(num1 + " and " + num2 + " gcd : " + gcd);
		
		sc.close();
	}
	
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 == 0;
	}

	/**�� ������ �־����� �� ������ �ִ� ������� �˷��ִ� �޼���
	 * �Ű����� : �� ���� => int num1, int num2
	 * ����Ÿ�� : �ִ� ����� => ���� => int
	 * �޼���� : gcd
	 */
	public static int gcd(int num1, int num2) {
		for(int i = num1; i>=1; i--) {
			//i�� num1�� ����̴� == num1�� i�� ����̴�
			if(isMultiple(num1, i) && isMultiple(num2, i)) {
				return i;
			}
		}
		return 1;
	}
}