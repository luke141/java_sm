package day3.practice;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		//���� num�� �Է¹޾Ƽ�(Scanner����Ѵ�) num�� 0����, ��������, ��������� �Ǻ��ϴ� �ڵ带 if���� �̿��Ͽ� �ۼ��ϼ���.
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("input number : ");
		num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("0");
		}
		//���� => 0���� �۴�
		if(num < 0) {
			System.out.println(num + " is a negative number");	
		}
		//��� => 0���� ũ��
		if(num > 0) {
			System.out.println(num + " is a positive number");
		}
		
		sc.close();

	}

}
