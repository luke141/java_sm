package day5.practice;

import java.util.Scanner;

public class DivisorEx {

	public static void main(String[] args) {
		/* ���� num�� �Է¹޾� num�� ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * �ݺ�Ƚ�� : i�� 1���� num���� 1������
		 * ��Ģ�� : i�� num�� ����̸� i�� ���
		 * 		  => num�� i�� ���������� �������� 0�� ���ٸ� i�� ���
		 */
		int num, i;//i�� �ʱ�ȭ
		Scanner sc = new Scanner(System.in);
		
		//���� �Է�
		System.out.println("input positive number : ");
		num = sc.nextInt();
		
		//�ݺ���, i�� 1���� num���� 1�� ����
		i = 1;
		while(i <= num) { 
			//num�� i�� ���������� �������� 0�� ���ٸ� i�� ���
			if(num % i == 0) {
				System.out.println(i);
			}
			++i;
		}
		sc.close();

	}

}
