package day18.practice;

import java.util.Scanner;

public class StringSplitEx {

	public static void main(String[] args) {
		//������ �Է¹޾� �ܾ��� ������ ����ϴ� �ڵ带 �ۼ��ϼ���.
		
		/* input : Hi. My name is hong.
		 * word : 5
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input : ");
		String str = sc.nextLine();
		
		//������ �������� �ܾ��� �迭�� ����
		String words[] = str.split(" ");
		
		//���� ���
		System.out.println("Word : " + words.length);
		sc.close();
	}

}
