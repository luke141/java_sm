package day7.practice;

public class StarsEx3 {

	public static void main(String[] args) {
		/* *	    i=1 ���� =4 *=1
		 * **	    i=2 ���� =3 *=2
		 * ***	    i=3 ���� =2 *=3
		 * ****	    i=4 ���� =1 *=4
		 * *****	i=5 ���� =0 *=5
		 * 				����=5-i*=1
		 * */
		/* �ܺ� �ݺ���
		 * �ݺ�Ƚ�� : i�� 1���� 5���� 1�� ����
		 * ��Ģ�� : * 5���� ����� ����
		 * */
		for(int i = 1 ; i <= 5 ; i++) {
			//* ������ ���
			/* ���� �ݺ���
			 * �ݺ�Ƚ�� : j�� 1���� 5���� 1�� ����
			 * ��Ģ�� : *�� ���
			 * */
			
			
			for(int j = 1; j <= i ; j++) {
				System.out.print(' ');
			}
			
			System.out.println('*');//����
	}

}
}