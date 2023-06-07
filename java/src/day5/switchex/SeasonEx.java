package day5.switchex;

import java.util.Scanner;

public class SeasonEx {

	public static void main(String[] args) {
		/* ���� �Է¹޾� �Է¹��� ���� ������ ����ϼ���.
		 * 3,4,5 : ��
		 * 6,7,8 : ����
		 * 9,10,11 : ����
		 * 12, 1, 2 : �ܿ�
		 * �� �� : �߸��� ��
		 * ���� 3�̰ų� ���� 4�̰ų� ���� 5�̸� ���̶�� ����ϰ� (���� 3�̻��̰� 5�����̸�)
		 * ���� 6�̰ų� ���� 7�̰ų� ���� 8�̸� �����̶�� ����ϰ� (���� 6�̻��̰� 8�����̸�)
		 * ���� 9�̰ų� ���� 10�̰ų� ���� 11�̸� �����̶�� ����ϰ� (���� 9�̻��̰� 11�����̸�)
		 * ���� 12�̰ų� ���� 1�̰ų� ���� 2�̸� �ܿ��̶�� ����ϰ� (���� 12�̰ų� ���� 1�̻��̰� 2�����̸�)
		 * �ƴϸ� �߸��� ���̶�� ���
		 * */
		int month;
		Scanner sc = new Scanner(System.in);
		
		//���� �Է�
		System.out.println("input month : ");
		month = sc.nextInt();
		
		//���� ���� ������ ���(switch������)
		
		switch(month) {
		//month�� 1,2,12�� �� 12�� ���๮�� ������ �Ǽ� �ܿ��� ���
		//1�� ���๮�� ����, break���� ����
		//2�� ���๮�� ����, break���� ����
		case 1: case 2: case 12://case 1, 2, 12: //JDK 7���� ���ķ� ����
			System.out.println("Winter!");
			break;
		case 3: case 4: case 5:
			System.out.println("Spring!");
			break;
		case 6: case 7: case 8:
			System.out.println("Summer!");
			break;
		case 9: case 10: case 11:
			System.out.println("Fall!");
			break;
		}
		sc.close();
	}

}
