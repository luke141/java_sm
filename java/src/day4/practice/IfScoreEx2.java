package day4.practice;

import java.util.Scanner;

public class IfScoreEx2 {

	public static void main(String[] args) {
		/* ������ �Է¹޾� ������ �´� ������ ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * 90�̻� ~ 100���� : A
		 * 80�̻� ~ 90�̸� : B
		 * 70�̻� ~ 80�̸� : C
		 * 60�̻� ~ 70�̸� : D
		 * 60�̸� : F
		 * 0���� �۰ų� 100���� ū ��� : wrong score
		 * */
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.println("input score : ");
		score = sc.nextInt();
		
		/* score�� 0�̸��̰ų� 100�ʰ��̸� wrong score!
		 * score�� 90�̻��̸� A
		 * score�� 80�̻��̸� B
		 * score�� 70�̻��̸� C
		 * score�� 60�̻��̸� D
		 * �ƴϸ� F
		 */
		if(score < 0 || score > 100) {
			System.out.println("wrong score");
		}
		else if(score >= 90) {
			System.out.println("A");
		}
		else if(score >= 80) {
			System.out.println("B");
		}
		else if(score >= 70) {
			System.out.println("C");
		}
		else if(score >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		
		sc.close();
		

	}

}
