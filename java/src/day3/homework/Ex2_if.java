package day3.homework;

import java.util.Scanner;

public class Ex2_if {

	public static void main(String[] args) {
		/*����(M:����,W:����)�� �Է¹޾� M�̸� ������, W�̸� ������ ����ϴ� �ڵ带 �ۼ��ϼ���. if�� �̿�
		(package : day3.homework, file : Ex1_ifjava) 
		input gender : 
		M
		Are you a woman? man
		input gender : 
		W
		Are you a woman? women
		* */
		char gender;
		Scanner sc = new Scanner(System.in);
		System.out.println("input gender : ");
		gender = sc.next().charAt(0);
		if(gender == 'M') {
			System.out.println("Are you a woman?" + "man");
		}
		if(gender == 'w') {
			System.out.println("Are you a woman?" + "woman");
		}
		sc.close();
	}

}
