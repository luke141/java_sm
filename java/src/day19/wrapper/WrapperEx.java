package day19.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		Integer num1 = 10;//�ڽ� : ���� 10�� Integer Ŭ���� ��ü num1�� ����
		//num1 = null;
		int num2 = 0;
		if(num1 != null) {
			num2 = num1;//��ڽ� : Integer Ŭ���� ��ü num1�� �ִ� ���� num2�� ����. ����ó�� �ʿ�
		}

		System.out.println(num1);
		System.out.println(num2);
		
		//ArrayList<Integer> list;
		
		//Integer.parseInt�� ���� ���ڿ��� �⺻�ڷ������� ��ȯ�ϴ� �޼��带 ����� �� ����ó�����ִ°��� ����
		int num3 = Integer.parseInt("123");
		System.out.println(num3);
	}

}