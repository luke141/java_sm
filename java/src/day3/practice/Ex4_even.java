package day3.practice;

import java.util.Scanner;

public class Ex4_even {

	public static void main(String[] args) {
		//���� num�� �Է¹޾� num�� Ȧ������ ¦������ �Ǻ��ϴ� �ڵ带 �ۼ��ϼ���.
		//num�� 2�� �������� �� �������� 0�� �ƴϸ� odd number��� ����ϰ�
		//num�� 2�� �������� �� �������� 0�̸� even number��� ���
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("input number : ");
		num = sc.nextInt();
		
		if(num % 2 != 0) {             //������ ������ : %
			System.out.println(num + " is odd number");
			}
		if(num % 2 == 0) {
			System.out.println(num + " is even number");
		}
		
		sc.close();
	}

}
