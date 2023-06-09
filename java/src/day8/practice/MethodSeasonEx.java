package day8.practice;

import java.util.Scanner;

public class MethodSeasonEx {

	public static void main(String[] args) {
		//���� �Է¹޾� ������ ����ϴ� �ڵ带 �ۼ��ϼ���.
		//�� �޼��� �̿�
		
		int month; 
		Scanner sc = new Scanner(System.in);
		System.out.println("input month : ");
		month = sc.nextInt();
		
		String season = getSeason(month);
		System.out.println(month + " is " + season);
		
		System.out.println(month + " is " + getSeason(month));
		
		sc.close();
		}
	/** ���� �־����� �־��� ���� �´� ������ �˷��ִ� �޼���
	 * �Ű����� : �� => int month
	 * ����Ÿ�� : ���� => String
	 * �޼���� : getSeason
	 */
	public static String getSeason(int month) {
	
	//month�� 3�̰ų� 4�̰ų� 5�̸� Spring ��� => Ǯ� �����
			//month�� 3�� ���ų�
			//month�� 4�� ���ų�
			//month�� 5�� ������
			if(month ==3 || month ==4 || month == 5) {
				return "Spring";
			}
			//month�� 6�̰ų� 7�̰ų� 8�̸� Summer ���
			else if(month ==6 || month ==7 || month == 8) {
				return "Summer";
			}
			//month�� 9�̰ų� 10�̰ų� 11�̸� Fall ���
			else if(month ==9 || month ==10 || month == 11) {
				return "Fall";
			}
			//month�� 12�̰ų� 1�̰ų� 2�̸� Winter ���
			else if(month ==12 || month ==1 || month == 2) {
				return "winther";
			}
			//�ƴϸ� Wrong Month ���
			else {
				return "Wrong Month";
			}

	}
}
