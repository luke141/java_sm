package day8.method;

public class MethodCallStackEx {

	public static void main(String[] args) {
		/* �Լ�(�޼ҵ�) ȣ�� ���� ����*/
		method1(1);
		//method();//��� �޼ҵ带 �߸� �ۼ��� ��� StackOverFlow�� �߻�

	}
	
	public static void method1(int a) {
		System.out.println(a);
		method2(a);	
	}
	public static void method2(int a) {
		System.out.println(a-1);
		method3();
	}
	public static void method3() {
		System.out.println("end");
	}
	public static void method4() {
		System.out.println("a");
		method4();
	}
}

