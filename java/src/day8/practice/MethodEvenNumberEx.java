package day8.practice;

import java.util.Scanner;

public class MethodEvenNumberEx {

	public static void main(String[] args) {
		//���� : ���� num�� �Է¹޾� ¦������ �ƴ��� �Ǻ��ϴ� �ڵ带 �ۼ��ϼ���.
		//��, �޼��带 �̿��� ��.
		
		//Ȧ¦ �Ǻ� ����. �޼��� �̿�
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("input number : ");
		num1 = sc.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println("Even number.");
		}else {
			System.out.println("Odd number.");
		}
		
		printEvenNumber(num1);
		
		if(mod(num1, 2) == 0) {
			System.out.println("Even number.");
		}else {
			System.out.println("Odd number.");
		}
		
		if(isEvenNumber(num1)) {
			System.out.println("Even number.");
		}else {
			System.out.println("Odd number.");
		}
		
		if(isMultiple(num1, 2)) {
			System.out.println("Even number.");
		}else {
			System.out.println("Odd number.");
		}
		
		sc.close();
	}
	/**num�� �־����� num�� ¦������ Ȧ������ ����ϴ� �޼���
	 * @param num : �Ǻ��� ���� 
	 * @return ���� => void
	 * �޼���� : printEvenNumber 
	 */
	public static void printEvenNumber(int num) {
		if(num % 2 == 0) {
			System.out.println("Even number.");
		}else {
			System.out.println("Odd number.");
		}
	}
	/**num1�� num2�� �־����� num1�� num2�� �������� �� ��������
	 * �˷��ִ� �޼���
	 * �Ű����� : �� ���� => int num1, int num2
	 * ����Ÿ�� : �������� �� ������ => ���� => int
	 * �޼���� : mod
	 * 
	 */
	public static int mod(int num1, int num2) {
		return num1 % num2;
	}
	/**num�� �־����� num�� ¦������ Ȧ������ �˷��ִ� �޼���
	 * �Ű����� : �Ǻ��� ���� => int num
	 * ����Ÿ�� : ¦������(��) Ȧ������(����) => boolean
	 * �޼���� : isEvenNumber
	 */
	public static boolean isEvenNumber(int num) {
		return num % 2 == 0;
	}
	/**num1�� num2�� �־����� num1�� num2�� ������� �ƴ��� �˷��ִ� 
	 * �޼���
	 * �Ű����� : �� ���� => int num1, int num2
	 * ����Ÿ�� : �������(��) �ƴ���(����) => boolean
	 * �޼���� : isMultiple
	 */
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 == 0;
	}
}




