package day11.practice;

import java.util.Scanner;

public class DivisorEx {

	public static void main(String[] args) {
		//���� num�� ������� �迭�� �����ϴ� �ڵ带 �ۼ��ϼ���. ����� �ִ� 10������ ����
		/*12�� ���:1 2 3 4 6 12
		 * 0���� : 1
		 * 1���� : 2
		 * 2���� : 3
		 * 3���� : 4
		 * 4���� : 6
		 * 5���� : 12
		 * */
		int num, count = 0;
		int divisor[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input : ");
		num = sc.nextInt();
		
		for(int i = 1; i<=num; i++) {
			if(num % i == 0) {
				divisor[count] = i;
				count++;
			}
			if(count == divisor.length) {
				break;
			}
		}
		
		for(int i = 0; i<count; i++) {
			System.out.println(divisor[i]);
		}
		
		sc.close();
	}

}

