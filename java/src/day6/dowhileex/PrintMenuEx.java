package day6.dowhileex;

import java.util.Scanner;

public class PrintMenuEx {

	public static void main(String[] args) {
		/* ������ ���� �޴��� ����ϰ� ���α׷� ���Ḧ �����ϱ� �� ���� �ݺ������� ����Ǵ� �ڵ带 �ۼ��ϼ���.
		 * Menu
		 * 1. Start
		 * 2. Save
		 * 3. Exit
		 * Select Menu :
		 * */
		int i = 2, j, count = 0;
		
		
		System.out.println("input positive number : ");
	while(i <= 100) {
		/* ���� �ݺ��� : i�� �Ҽ����� Ȯ���ϴ� �ݺ���
		 * �ݺ�Ƚ�� : j�� 1���� i���� 1�� ����
		 * ��Ģ�� : j�� i�� ����̸� ����� ������ 1����
		 * �ݺ��� ���� �� : ����� ������ 2���̸� i�� ���
		 * */
		//i�� �Ҽ��̸� i�� ����ϴ� �ڵ�
		j = 1;
		count = 0;
		while(j <= i) {
			if(i % j== 0) {
				count++;
			}
			j++;
		}
	
		if(count == 2) {
			System.out.println(i + " is a prime number.");
		}
		i++;

		}
	}
}
