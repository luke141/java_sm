package day6.practicee;

import java.util.Scanner;

public class GCDEx {

	public static void main(String[] args) {
		/*�� ���� num1�� num2�� �Է¹޾� �� ������ �ִ� ������� ���ϴ� �ڵ带 �ۼ��ϼ���.
		(package : day6.practice, file : GCDEx)
		��� : ������ �������� ��
		����� : �������� �ִ� ���
		�ִ� ����� : ����� �� ���� ū ��
		8�� 12�� ����� : 1, 2, 4
		8�� 12�� �ִ� ����� : 4
		* */
		int num1, num2, i = 1, gcd = 1;
		Scanner sc = new Scanner(System.in);
		//�� ������ �Է�
		System.out.println("input 2 numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		//
		//�ݺ���(�ִ������� ���ϱ� ����) : i�� num1����
		while(i <= num1) {
		if(num1 % i == 0 && num2 % i == 0) {
		gcd = i;
		}
		//i�� 1����
		i++;
	}
		System.out.println(num1 + "and" + num2 + "gcd : " + gcd);

}
}