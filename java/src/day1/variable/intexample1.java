package day1.variable;

public class IntExample1 {

	public static void main(String[] args) {
		int num2 = 11;	//������ 11
		int num3 = 0b11;//2���� 11 == 10���� 3
		int num4 = 011;	//8���� 11 == 10���� 9
		int num5 = 0x11;//16���� 11 == 10���� 17
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		//1234567890123�� int�� ǥ���� �� ���� ū ����
		//long Ÿ�Կ� ū ���ڸ� ������ ��� ���ͷ��� L �Ǵ� l�� �ݵ�� �ٿ��� ��
		long num6 = 1234567890123L;
	}

}
