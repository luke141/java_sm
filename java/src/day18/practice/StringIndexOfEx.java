package day18.practice;

public class StringIndexOfEx {

	public static void main(String[] args) {
		/* Hello world���� l�� � �ִ��� Ȯ���ϴ� �ڵ带 �ۼ��ϼ���. */
		String str = "Hello world!";
		int count = 0;
		String search ="a";
		int index = -1;
		//�ݺ� : ã���� �ݺ�
		do {
			//Hello world�� l�� ��ġ�� ã��=>lo world���� l�� ��ġ�� ã�� => o world�� l�� ��ġ ã��
			//=>d���� l�� ��ġ�� ã��
			index = str.indexOf(search, ++index);
			//ã������ ������ ����
			if(index != -1) {
				count++;
			}
		}while(index != -1);
		//������ ���
		System.out.println(str + " : " + search + " : " + count);
	}

}
