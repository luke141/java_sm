package day5.homework;

import java.util.Scanner;

public class UpDownEx {

	public static void main(String[] args) {
		/* 1~100������ ������ ������ �����ϰ�, �� ������ ���ߴ� ������ �����ϼ���.
		 * */
		
		int min = 1, max = 100; //�׽�Ʈ �� �� ���� ������ ������ ���� ��������
		int num = min - 1;//1~100�� �ƴ� ������ �ʱ�ȭ �ϸ� ��. �ּҰ� -1�� �ؼ� �������� ���� �� ���� ��
		int random;
		Scanner sc = new Scanner(System.in);
		
		//������ ���� ���� (�� ���)
		random = (int)(Math.random()*(max - min + 1) + min);
		System.out.println(random);
		//�ݺ��� : ���� �� ���� => �Է��� ������ ������ �ƴϸ� �ݺ�
		while(random != num) {
		//������ �Է�
		System.out.println("input(1~100) : ");
		num = sc.nextInt();
		
		//������ ������ ���Ͽ� �Ǻ�
		//num�� random���� ũ�� Down!, num�� random���� �ۤ��� Up!, �ƴϸ� Good!
		if(num > random) {
			System.out.println("Down!");
		}else if(num < random) {
			System.out.println("Up!");
		}else {
			System.out.println("Good!");
		}

		}
		sc.close();
	}

}
