package day7.practice;

public class StarsEx2 {

	public static void main(String[] args) {
		/* *	    i=1 *=1
		 * **	    i=2 *=2
		 * ***	    i=3 *=3
		 * ****	    i=4 *=4
		 * *****	i=5 *=5
		 * */
		/* �ܺ� �ݺ���
		 * �ݺ�Ƚ�� : i�� 1���� 5���� 1�� ����
		 * ���๮ : * 5���� ����� ����
		 * ��Ģ�� : * 5���� ����� ����
		 * */
		for(int i = 1 ; i <= 5 ; i++) {
			//* 5���� �Է�
			/* ���� �ݺ���
			 * �ݺ�Ƚ�� : j�� 1���� 5���� 1�� ����
			 * ��Ģ�� : *�� ���
			 * */
			for(int j = 1; j <= i ; j++) {
				System.out.println('*');
			}
			
			System.out.println();//����
	}

}
}