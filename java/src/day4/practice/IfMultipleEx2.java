package day4.practice;

import java.util.Scanner;

public class IfMultipleEx2 {

	public static void main(String[] args) {
		/* ���� num�� �Է¹޾� num�� 2�� ����̸� 2�� ������ ����ϰ�, 
		 * 3�� ����̸� 3�� ������ ����ϰ�,
		 * 6�� ����̸� 6�� ������ ����ϰ�,
		 * 2,3,6�� ����� �ƴϸ� 2,3,6�� ����� �ƴ϶�� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * */
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("input number : ");
		num = sc.nextInt();
		//2,3�� ����� 6�� ����� �ߺ��Ǵ� 6�� ��� ���� �Է��ϸ� ��, ������ ���� ������� �޶���
		if(num % 6 == 0) {
			System.out.println("A Multiple of 6");
		}
		else if(num % 2 == 0) {
			System.out.println("A Multiple of 2");
		}
		else if(num % 3 == 0) {
			System.out.println("A Multiple of 3");
		}
		else {
			System.out.println("Not Multiple of 2,3,6");
		}
		//6�� ����� �ƴ� 2�� ����� ã�� ���� 2�� ��������� 3�� ����� �ƴ� ������ Ȯ��
		if(num % 2 == 0 && num % 3 != 0) {
			System.out.println("A Multiple of 6");
		}
		else if(num % 3 == 0 && num % 2 != 0) {
			System.out.println("A Multiple of 2");
		}
		else if(num % 6 == 0) {
			System.out.println("A Multiple of 3");
		}
		else {
			System.out.println("Not Multiple of 2,3,6");
   }
		
}
}