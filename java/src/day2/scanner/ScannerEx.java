package day2.scanner;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		//System.in : ǥ���Է�
		//ǥ�� �Է��� �̿��ؼ� ��ĳ�ʸ� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է����ּ���.");
		
		int num1 = sc.nextInt();//������ �Է¹���
		System.out.println(num1);
		
		System.out.println("�Ǽ��� �Է����ּ���.");
		double num2 = sc.nextDouble();//�Ǽ��� �Է� ����
		System.out.println(num2);
		sc.nextLine();//
		System.out.println("���ڿ�1�� �Է��ϼ���");
		String str1 = sc.nextLine(); //�����̽��� ������ ���ڿ� ������ �о��(������ �Է��� ��������)
		System.out.println(str1);
		
		System.out.println("���ڿ�2�� �Է��ϼ���.");
		String str2 = sc.next(); //ù��° ���ں��� �о�ͼ� ���� ����(����, �����̽�)�� ���������� �о��
		System.out.println(str2);
		//next()�� �̿��Ͽ� �� �ܾ �о���
		//charAt(0)�� �̿��Ͽ� �о�� �ܾ��� ù���ڸ� ������
		System.out.println("���ڸ� �Է��ϼ���.");
		char ch = sc.next().charAt(0); //next()�� �̿��Ͽ� �� �ܾ �о���� �о�� �ܾ��� ù ���ڸ� ������
		System.out.println(ch);
		
		sc.close();//close()�� ���� �ʾƵ� ũ�� ������ ������ �Ⱦ��� ����ǥ�ð� ����
		

	}

}
