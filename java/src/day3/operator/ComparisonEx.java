package day3.operator;

public class ComparisonEx {

	public static void main(String[] args) {


		System.out.println("1 > 2 : " + (1 > 2)); //()�� �켱����!
		System.out.println("1 < 2 : " + (1 < 2));
		System.out.println("1 >= 2 : " + (1 >= 2));
		System.out.println("1 <= 2 : " + (1 <= 2));
		System.out.println("1 == 2 : " + (1 == 2));
		System.out.println("1 != 2 : " + (1 != 2));
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		/* str1rhk str2�� ���ͷ� ���ڿ� abc�� �����ϰ� �ֱ� ������ ==�� �� ����������
		 * str3�� ���ͷ� ���ڿ��� �ƴϱ� ������ ==�� ���� �� ����.
		 * �׷���, �Ϲ������� ���ڿ� ������ �ִ� ��� �� ������ ���ͷ��� ����ִ��� �ƴ����� �� �� ����.
		 * �׷��� ���ڿ��� ==(����)�� !=(�����ʴ�)�� ������ �ʴ� ���� ����.
		 * */
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1 == str3 : " + (str1 == str3));
		System.out.println("str2 == str3 : " + (str2 == str3));
		/* ���ڿ��� ������ ���� �������� �ַ� equals�� �̿��Ͽ� ������ �ٸ����� �Ǻ�
		 * */
		System.out.println("str.equals(str2) : " + str1.equals(str2)); //str.equals(str) ��� ����
		System.out.println("str.equals(str3) : " + str1.equals(str3));
		System.out.println("str.equals(str3) : " + str2.equals(str3));
		//���� ������ ==�� !=�� ���� ��ǥ���� ���� null�� ���ؼ� ������� �Ⱥ������ Ȯ���� ���� ���
		System.out.println(str1 == null); //null �� == ���ٴ� �ǹ� ��� ����
		

	}

}
