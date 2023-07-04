package day18.string;

public class StringEx1 {

	public static void main(String[] args) {
		/* ���ڿ� ���� �޼��� */
		//indexOf : ���� ���ڿ����� �˻� ����/���ڿ��� ���ʺ��� �˻��ؼ� ó������ ������ ��ġ�� ��ȯ
		//lastIndexOf : ���� ���ڿ����� �˻� ����/���ڿ��� �����ʺ��� �˻��ؼ� ó������ ������ ��ġ�� ��ȯ
		String str="Hello world";
		
		//str���� 7�������� wo�� �ִ��� Ȯ��. orld���� wo�� �ִ��� Ȯ��=>����=>-1
		int index = str.indexOf("wo", 7);
		System.out.println(str + "���� 7�������� " + "wo" + "�� �ֳ���?" +index);
		
		index = str.indexOf("wo");
		System.out.println(str + "���� 0�������� " + "wo" + "�� �ֳ���?" +index);
		
		index = str.indexOf("o");
		System.out.println(str + "���� 0�������� " + "o" + "�� �ֳ���?" +index);
		
		//contains : ���� ���ڿ����� �˻� ����/���ڿ��� �ִ��� �������� �˷���
		boolean result = str.contains("o");
		System.out.println(str + "���� 0�������� " + "o" + "�� �ֳ���?" +result);

		System.out.println(str + "�� ���̴�? " + str.length());
		
		//replace : Ư�� ����/���ڿ��� �ٲ� �� ���. ���
		//replaceAll : ����ǥ���Ŀ� �´� ��� ����/���ڿ��� ����
		String str2 = str.replace(" ", ",");
		System.out.println(str2);
		
		//substring : �κ� ���ڿ� ����
		String str3 = str.substring(6);
		System.out.println(str + "���� 6�������� ������ �κ� ���ڿ� : " + str3);
		
		//lastIndexOf : ���� ���ڿ����� �˻� ����/���ڿ��� �����ʺ��� �˻��ؼ� ó������ ������ ��ġ�� ��ȯ
		index = str.lastIndexOf("o");
		System.out.println(str + "���� 0�������� " + "o" + "�� �����ʺ��� �ֳ���?" +index);
		
		//toLowerCase : �ҹ��ڷ�
		System.out.println(str + " : �ҹ��� :  " +str.toLowerCase());
		//toUpperCase : �빮�ڷ�
		System.out.println(str + " : �ҹ��� :  " +str.toUpperCase());
		
		//trim ���۹���(a) �� ����, ����������(f) �� ������ ����, ���̿� �ִ� ������ ���� ����
		String str4 = "\n\t\tabc\t\tdef\t\n";
		System.out.println(str4.trim());
		
		//split : �����ڸ� �������� ���ڿ��� �����ؼ� ������� �迭�� ����
		String str5 = "���,��,����";
		String fruits[] = str5.split(",");
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
	}

}
