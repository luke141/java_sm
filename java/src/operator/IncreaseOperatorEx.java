package operator;

public class IncreaseOperatorEx {

	public static void main(String[] args) {
		int num1 = 10, num2 = 10;
		System.out.println("�۾� �� : " + num1 +  "(������), " + num2 + "(������)");
		//�������� ���� ������ �ϰ� ������ �ϱ� ������ num1�� ���� ��Ų �� �۾� �� ���ڿ��� ����
		//�������� ���� ������ �ϰ� ������ �ϱ� ������ num2�� ���� ���ڿ��� �F�� �Ŀ� num2�� ���� ��Ŵ
		System.out.println("�۾� �� : " + ++num1 + "(������), " + num2++ + "(������)");
		System.out.println("�۾� �� : " + num1 +  "(������), " + num2 + "(������)");
		
		System.out.println("=========================");
		
		num1 = num2 = 10;
		System.out.println("�۾� �� : " + num1 +  "(������), " + num2 + "(������)");
		++num1;
		System.out.println("�۾� �� : " + ++num1 + "(������), " + num2++ + "(������)");
		++num2;
		System.out.println("�۾� �� : " + num1 +  "(������), " + num2 + "(������)");
		

	}

}
