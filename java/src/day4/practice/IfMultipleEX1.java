package day4.practice;

import java.util.Scanner;

public class IfMultipleEX1 {

	public static void main(String[] args) {
		//���� num�� 2�� ���(Ȧ¦�Ǻ�)���� �ƴ��� �Ǻ��ϴ� �ڵ带 �ۼ��ϼ���.
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("input number : ");
		num = sc.nextInt();
		
		if(num % 2 ==0) {
			System.out.println("A multiple of 2");
		}else {
			System.out.println("Not multiple of 2");
		}
		
		

	}

}
