package day2.homework;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		/* �ֿܼ��� ���� 2���� ����(���������)�� �Է¹޾� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * ��:
		 * �� ������ ��������ڸ� �Է��ϼ��� (��:1 + 2) :
		 * [�Է�]1 + 2 [����]
		 * [���]1 + 2
		 * */
		int num1, num2;
		char operator;
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ������ ��������ڸ� �Է��ϼ��� (��:1 + 2) :");
		num1 = sc.nextInt();
		operator = sc.next().charAt(0);
		num2 = sc.nextInt();
		System.out.println("" + num1 + " " + operator + " " +num2);
		sc.close();

	}

}
