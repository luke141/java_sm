package day5.practice;

import java.util.Scanner;

public class PrimeNumberEx {

	public static void main(String[] args) {
		/* ���� num�� �Է¹޾� num�� �Ҽ����� �ƴ����� �Ǻ��ϴ� �ڵ带 �ۼ��ϼ���.
		 * �Ҽ� : ����� 2���� ��, 1�� �����ϰ� ó�� ���� ����� �ڽ��� ��
		 * �ݺ�Ƚ�� : i�� 1���� num���� 1������
		 * ��Ģ�� : i�� num�� ����̸� ����� ���� count�� 1����
		 * 		  => num�� i�� ���������� �������� 0�� ���ٸ� ����� ���� count�� 1����
		 * �ݺ��� ���� �� : count�� 2�̸� �Ҽ���� ���, �ƴϸ� �Ҽ��� �ƴ��̶�� ��� 
		 */
		int num, i, count = 0;
		Scanner sc = new Scanner(System.in);
		//���� �Է�
		System.out.println("input positive number : ");
		num = sc.nextInt();
		
		//�ݺ���. i�� 1���� num���� 1�� ����
		i = 1;
		while(i <= num) {
			//i�� num�� ����̸� ����� ���� count�� 1����
			if(num % i == 0) {
				count++;
			}
			i++;
		}
		//count�� 2�̸� �Ҽ���� ���, �ƴϸ� �Ҽ��� �ƴ��̶�� ��� 
		if(count == 2) {
			System.out.println(num + " is a prime number.");
		}else {
			System.out.println(num + " is not a prime number.");
		}
		sc.close();

	}

}
