package day7.practice;

public class PrintAlphabetEx2 {

	public static void main(String[] args) {
		//������ ���� ��µǴ� �ڵ带 �ۼ��ϼ���.
		/* a
		 * ab
		 * abc
		 * abcd
		 * ....
		 * abcdef....xyz
		 * */
		char ch = 'a', end;
		
		/* �ܺ� �ݺ���
		 * �ݺ�Ƚ�� : end�� 'a'���� �����ؼ� 'z'���� 1�� ����
		 * ��Ģ�� : 'a'���� end���� ���
		 * �ݺ��� ���� �� : ����
		 * */
		for(end = 'a'; end <= 'z' ; end++) {
			/* ���� �ݺ���
			 * �ݺ�Ƚ�� : ch�� 'a'���� �����ؼ� 'end'���� 1�� ����
			 * ��Ģ�� : ch�� ���
			 * �ݺ��� ���� �� : ����
			 * */
			for(ch= 'a'; ch <= end; ch++) {
				System.out.println(ch);
			}
			System.out.println();
		}

		
		
		
		

	}
}	
