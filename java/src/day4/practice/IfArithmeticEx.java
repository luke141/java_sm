package day4.practice;

import java.util.Scanner;

public class IfArithmeticEx {

	public static void main(String[] args) {
		/* ��� �����ڿ� �� ������ �Է¹޾� ��������ڿ� �´� ���� ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * ��������� : operator(op), �� ���� : num1, num2
		 * op�� +�̸� num1 + num2�� ����ϰ�
		 * op�� -�̸� num1 - num2�� ����ϰ�
		 * op�� *�̸� num1 * num2�� ����ϰ�
		 * op�� /�̸� num1 / num2�� ����ϰ�
		 * op�� %�̸� num1 % num2�� ����ϰ�
		 * op�� ��������ڰ� �ƴϸ� op is not arithmetic operator!�� ���
		 * */
		
		int num1, num2;
		char operator;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input 2 nums and arithemic operator(ex : 1 + 2) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		operator = sc.next().charAt(0);
		
		if(operator == '+') {
			System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 + num2));
		}
		else if(operator == '-') {
			System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 - num2));
		}
		else if(operator == '*') {
			System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 * num2));
		}
		else if(operator == '/') {
			System.out.println(num1 + " " + operator + " " + num2 + " = " + ((double)num1 / num2));
		}
		else if(operator == '%') {
			System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 % num2));
		}
		else {
			System.out.println("op is not arithmetic operator! ");
		}
		sc.close();
	}

}
