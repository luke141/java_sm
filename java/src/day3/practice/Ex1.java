package day3.practice;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		/*������ �Է¹޾� �Է¹��� ������ 60������ Ȯ���ϴ� �ڵ带 �ۼ��ϼ���
		 * ��:
		 * input score : 65
		 * Do you pass 65 points? true
		 * input score : 45
		 * Do you pass 45 points? false
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("input score : ");
		int score = sc.nextInt();
		boolean result = score >= 60;
		System.out.println("Do you pass " + score + "points? " + result);
		sc.close();
		

	}

}
