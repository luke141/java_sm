package day6.practicee;

import java.util.Scanner;

public class UpDownEx {

	public static void main(String[] args) {
		/* UpDown ������ �ϴ� �ڵ带 �ۼ��ϼ���. 
		������ ������ ���Ұ����� ��� n�� �Է��ϸ� ����, y�� �Է��ϸ� �̾ ������ ����.
		 * */
		int min = 1, max = 100
		char mueu
		int num;
		Scanner sc = new Scanner(System.in);
		/* �ܺ� �ݺ��� : ������ ���� �����Ұ��� �����ϴ� �ݺ���
		 * �ݺ�Ƚ�� : �Է¹��� ���ڰ� n�� �ƴϸ� �ٳ�
		 * ��Ģ�� : up down ���� �� �� ����
		 * */
		do {
			/* ���� �ݺ��� : Up Down ���� �����ϴ� �ݺ���
			 * �ݺ� Ƚ�� : �Է¹��� ���ڰ� ������ ���ھƤ� ��ġ���� ������ �ݺ�
			 * ��Ģ�� : �Է¹��� ���ڰ� ���亸�� ũ�� Down!, ������ Up! ������ Good!�� ���
			 * */
			
			//menu�� ����(���Ұ��� ������)
			System.out.println("continue?(y/n) : ");
			menu = sc.next().charAt(0);
		}while(menu != 'n');
		
		sc.close();

	}

}
