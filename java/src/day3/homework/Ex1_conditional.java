package day3.homework;

import java.util.Scanner;

public class Ex1_conditional {

	public static void main(String[] args) {
		/*����(M:����,W:����)�� �Է¹޾� �������� Ȯ���ϴ� �ڵ带 �ۼ��ϼ���. ���� ������ �̿�
		(package : day3.homework, file : Ex1_conditional) 
		input gender : 
		M
		Are you a woman? false
		
		input gender : 
		W
		Are you a woman? true
		* */
		char gender; //�ʿ��� ���� ����, ''=>���ڴ� �Ұ��� but ""=>�� ���ڿ��� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("input gender : ");
		gender = sc.next().charAt(0);
		boolean result = gender == 'w' ? false : true;
		System.out.println("Are you a women? " + result);
		sc.close();//�� �ʿ��Ѱ� �ƴ�
		
		
	}

}