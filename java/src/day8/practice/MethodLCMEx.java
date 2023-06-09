package day8.practice;

import java.util.Scanner;

public class MethodLCMEx {

	public static void main(String[] args) {
		//���� num1�� num2�� �Է¹޾� �� ������ �ּ� ������� ���ϴ� �ڵ带 �ۼ��ϼ���.
		//��, �޼���� �̿��� ��.
		
		/*A : ga, B : gb
		 * g : �ִ�����
		 * l : A*B/g
		 * A*B/g == (ga*gb)/g == gab
		 */
		
		int num1, num2;
		Scanner sc = new Scanner(System.in);

		System.out.println("input 2 numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		int lcm = lcm1(num1,num2);
		System.out.println(num1 + " and " + num2 + " lcm : " + lcm);
		
		lcm = lcm2(num1,num2);
		System.out.println(num1 + " and " + num2 + " lcm : " + lcm);
		
		sc.close();
	}
	
	public static int lcm1(int num1, int num2) {
		for(int i = num1; i <= num1 * num2; i += num1) {
			//������� ã��. isMultiple�� ����� ã�� �޼����̰�,
			//i�� num1�� ������̱� ������ i�� num2�� ����̸� num1��
			//num2�� ������� ��
			if(isMultiple(i, num2)) {
				return i;
			}
		}
		return num1*num2;
	}
	public static int lcm2(int num1, int num2) {
		return num1 * num2 / gcd(num1, num2);
	}
	
	
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 == 0;
	}

	public static int gcd(int num1, int num2) {
		for(int i = num1; i>=1; i--) {
			if(isMultiple(num1, i) && isMultiple(num2, i)) {
				return i;
			}
		}
		return 1;
	}
}
