package day4.practice;

import java.util.Scanner;

public class IfSeasonEx {

	public static void main(String[] args) {
		/* ���� �Է¹޾� �Է¹��� ���� ������ ����ϼ���.
		 * 3,4,5 : ��
		 * 6,7,8 : ����
		 * 9,10,11 : ����
		 * 12,1,2 : �ܿ�
		 * �� �� : �߸��� ��
		 * ���� 3�̰ų� ���� 4�̰ų� ���� 5�̸� ���̶�� ����ϰ�(���� 3�̻��̰� 5�����̸�) 
		 * ���� 6�̰ų� ���� 7�̰ų� ���� 8�̸� �����̶� ����ϰ�(���� 6�̻��̰� 8�����̸�)
		 * ���� 9�̰ų� ���� 10�̰ų� ���� 11�̸� �����̶� ����ϰ�(���� 9�̻��̰� 11�����̸�)
		 * ���� 12�̰ų� ���� 1�̰ų� ���� 2�̸� �ܿ��̶� ����ϰ�(���� 12�̻��̰� 2�����̸�)
		 * �ƴϸ� �߸��� ���̶�� ���
		 * */
		int month; 
		Scanner sc = new Scanner(System.in);
		System.out.println("input month : ");
		month = sc.nextInt();//���̴ϱ� month���
		
		if(month >= 3 && month <= 5) {  //or������ ||Ȱ���ϱ�
			System.out.println("spring");
		}
		else if(month >= 6 && month <= 8) {  //or������ ||Ȱ���ϱ�
			System.out.println("summer");
		}
		else if(month >= 9 && month <= 11) {  //or������ ||Ȱ���ϱ�
			System.out.println("fall");
		}
		else if(month == 12 || (month >= 1 &&  month <= 2)) {  //�����ؾ��� �����ڿ� ()���ֱ�!!
			System.out.println("winter");
		}
		else {
			System.out.println("wrong month");
		}
		//���� 3�̻��̰� 5�����̸� ���̶� ����ϰ�
		
		}
		
		
	}

