package day5.homework;

import java.util.Scanner;

public class TeamLeaderEx {

	public static void main(String[] args) {
		/* 30���� �л��� �ִ� �ݿ��� 1������ ���ӵ� ��ȣ�� ���� 3���� �л��� 1���� �ǵ��� ��������.
		 * �� �� ���� ū ��ȣ�� �л��� ������ �ȴ�.
		 * �л� ��ȣ�� �־����� �� �������� �������� �Ǻ��ϴ� �ڵ带 �ۼ��ϼ���.
		 * */
		
		//�л� ��ȣ�� �Է�
		
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("input student number : ");
		num = sc.nextInt();
		
		
		//�л� ��ȣ�� �����ȣ���� �ƴ����� �Ǻ�
		//��ȣ�� 3�� ����̸� �����̶�� ����ϰ� �ƴϸ� �����̶�� ���
		//num�� 3���� �������� �� �������� 0�� ���ٸ� ����, �ƴϸ� �������� ���
		
		switch(num % 3) {
		case 0:
			System.out.println("Student number " + num + " 1 is a member of the leader");
			break;
		default://�ƴϸ� �� ��
			System.out.println("Student number " + num + "is a member of the team. ");
		}
		sc.close();

	}
}
