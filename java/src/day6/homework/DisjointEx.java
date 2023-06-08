package day6.homework;

import java.util.Scanner;

public class DisjointEx {

	public static void main(String[] args) {
		/* �� ������ �Է¹޾� �� ������ ���μ� �������� �Ǻ��ϴ� �ڵ带 �ۼ��ϼ���.
		 * ���μ� : �ִ� ������� 1�� �� ���� ����
		 * */
		//input 2 numbers : 3, 4
		//Disjoint!(���μ�)
		//input 2 numbers : 8, 4
		//No disjoint!(���μҾƴ�)
		/*/�ݺ�Ƚ�� : i�� 1���� num1���� 1�� ����
		* ��Ģ�� : i�� num1�� ����̰� i�� num2�� ����̸� i�� gcd�� ���� 
		* 		  num1�� i�� �������� �� �������� 0�� ����
		* 		  num2�� i�� �������� �� �������� 0�� ���ٸ�
		* 		  i�� gcd�� ����
		*
		* �ݺ��� ���� �� : gcd�� 1�̸� Disjoint�� ����ϰ�, �ƴϸ� Not joint�� ���
		*/
		int num1, num2, i = 1, gcd = 1;
		Scanner sc = new Scanner(System.in);
		//�� ������ �Է�
		System.out.println("input 2 numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		//�ݺ���(�ִ������� ���ϱ� ����) : i�� num1����
		for(i=1, gcd = 1 ;i  <= num1; i++) {
			//num1�� i�� �������� �� �������� 0�� ���� num2�� i�� �������� �� �������� 0�� ���ٸ� i�� gcd�� ����
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
			//i�� 1����
			i++;
		
	//gcd�� ���
	if(gcd == 1) {   
		System.out.println("Disjoint!");
	}else {
		System.out.println("Not disjoint!");
	}
	sc.close();
		}
	}
}
	


