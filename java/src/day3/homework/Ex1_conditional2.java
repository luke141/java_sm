package day3.homework;

import java.util.Scanner;

public class Ex1_conditional2 {

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
		String gender; //�ʿ��� ���� ����, ''=>���ڴ� �Ұ��� but ""=>�� ���ڿ��� ���� char=>����, String=>���ڿ�
		Scanner sc = new Scanner(System.in);
		System.out.println("input gender : ");
		gender = sc.next();
		boolean result = gender.equals("W") ? true : false;
		System.out.println("Are you a women? " + result);
		sc.close();//�� �ʿ��Ѱ� �ƴ�
		
		
	}

}
