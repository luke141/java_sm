package day8.overloading;

public class Ex1 {

	public static void main(String[] args) {
		//println,�� �޼��� �����ε�
		System.out.println(1);
		System.out.println("1");
		System.out.println(1.1);
		System.out.println('c');
		
		System.out.println(sum(1,1));
		System.out.println(sum(1.1,1));
		System.out.println(sum(1,1.1));
		System.out.println(sum(1.1,1.1));
		System.out.println(sum(1,2,3));
	}
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	//�Ű� ������ Ÿ���� �ٸ����
	public static double sum(double num1, int num2) {
		return num1 + num2;
	}
	public static double sum(int num1, double num2) {
		return num1 + num2;
	}
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
	//�Ű������� ������ �ٸ� ���
	public static double sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	/*
	//���� Ÿ�Ը� �ٸ� �޼���� �����ε��� �� �� ����.
	public static double sum(int num1, int num2) {
		return num1 + num2;
	}
	*/
	


}
