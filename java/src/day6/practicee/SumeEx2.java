package day6.practicee;

import java.util.Scanner;

public class SumeEx2 {

	public static void main(String[] args) {
		/* n�� �Է¹޾� 1���� n���� ¦���� ���� ���ϴ� �ڵ带 �ۼ��ϼ���.
		 * */
		int num , i = 1, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		//n�� �Է�
		
		//�ݺ����� �̿��Ͽ� n���� ¦���� ���� ���
		//i�� n���� �۰ų� ������ �ݺ�
			//i��  ¦���̸� ����
		while(i <= num) {
			if(i % 2 == 0) {
				sum += i;	
			}
			i++;
			
		}
		//sum�� ���
		System.out.println("1~" + num + "even sum : " + sum);
		sc.close();
	}

}
