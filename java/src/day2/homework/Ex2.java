package day2.homework;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		/* �� ������ �Է¹޾� �� ������ ��� ���� ����� ����ϴ� �ڵ带 �ۼ��ϼ���. ��, 2��° ���ڴ� 0�� �ƴ�.
		 * ��:
		 * �� ������ �Է��ϼ���.
		 * 1 2 [����]
		 * 1 + 2 = 3
		 * 1 - 2 = -1
		 * 1 * 2 = 2
		 * 1 / 2 = 0.5
		 * 1 % 2 = 1
		 * */
		//�ȳ� ���� ���
		System.out.println("�� ������ �Է��ϼ���.");
		//�ֿܼ��� �Է¹��� �� �ִ� ��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		//�� ������ �Է� ����
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		//�� ������ ��� ������ ���
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		double div = num1 / (double)num2;
		int mod = num1 % num2;
		//����� �ֿܼ� ���
		System.out.println(num1 + " + " + num2 + " = " + sum);
		//System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); �̷������ε� ����!
		System.out.println(num1 + " - " + num2 + " = " + sub);
		System.out.println(num1 + " * " + num2 + " = " + mul);
		System.out.println(num1 + " / " + num2 + " = " + div);
		//System.out.println(num1 + " % " + num2 + " = " + mod);
		//%�� +���� �켱������ ���� ������ ()�� �����ص� ������ ���� +�� ���� ���·� �����ֱ� ���� ()�� ����
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2)); //�̷������� ���� ����!, ()�� ���̸� �켱����!
		sc.close();
	}

}
