package day6.nestedloop;

public class MultiplicationTableEx {

	public static void main(String[] args) {
		//������ 2�ܺ��� 9�ܱ��� ����ϴ� �ڵ带 �ۼ��ϼ���.
		int i, j = 0;
		/* �ܺ� �ݺ���
		 * �ݺ�Ƚ�� : i�� A���� B���� 1�� ����
		 * ��Ģ�� : i���� ���
		 * */
		for( i = 2 ; i <= 9 ; i++ ) {
			//i�� ���
			/* ���� �ݺ���
			 * �ݺ�Ƚ�� : j�� 1���� 9���� 1�� ����
			 * ��Ģ�� : i x j = i*j�� ���
			 * */
			for( j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
	}
		//�� ��ġ���� i�� j�� ���� ��? i : 10, j : 10
		System.out.println("i : " + i + ", j : " + j);

}
}