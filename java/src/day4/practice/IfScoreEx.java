package day4.practice;

import java.util.Scanner;

public class IfScoreEx {

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
		
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		}
		else if(score >= 80 && score < 90) {
			System.out.println("B");
		}
		else if(score >= 70 && score < 80) {
			System.out.println("C");
		}
		else if(score >= 60 && score < 70) {
			System.out.println("D");
		}
		else if(score < 60 && score >= 0) {
			System.out.println("F");
		}
		else {
			System.out.println("wrong score");
		}
		
		
		
		sc.close();
		

	}

}
