package day4.ifex;

public class NestedIfEx {

	public static void main(String[] args) {
		/* 2,3,6�� ��� �Ǻ� ����
		 * (day4.practice package�� IfMultipleEx2 ����)*/
		int num = 6;
		
		//2�� ���
		if(num % 2 ==0) {
			//3�� ��� ==> 6�� ���
			if(num % 3 ==0) {
				System.out.println("A Multiple of 6");
			}
			//�ƴ� �� ==> 2�� ���
			else {
				System.out.println("A Multiple of 2");
			}
		}
		//3�� ���
		else if(num % 3 ==0) {
			System.out.println("A Multiple of 3");
		}
		//�ƴ� ��
		else {
			System.out.println("Not multiple of 2,3,6");

	}
	}
}
