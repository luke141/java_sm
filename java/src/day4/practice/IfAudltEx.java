package day4.practice;

import java.util.Scanner;

public class IfAudltEx {

	public static void main(String[] args) {
		//���̸� �Է¹޾� ���̰� 20�� �̻��̸� adult�� ����ϰ�, 20�� �̸��̸� minor�� ����ϴ� �ڵ带 �ۼ��ϼ���.
		//if else�� �̿�;
		int age; 
		Scanner sc = new Scanner(System.in);
		System.out.println("input age : ");
		age = sc.nextInt(); //������ �Է¹����Ÿ� nextInt���
		
		
		if(age >= 20) {
			System.out.println("adult!");
		}
		else {
			System.out.println("minor!");
		}
		sc.close();
		
			

	}

}
