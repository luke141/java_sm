package day10.thisex;

public class StudentMain {

	public static void main(String[] args) {
Student1.printCount();
		
		Student1 std1 = new Student1(1,1,1,"hong");
		Student1.printCount();
		
		Student1 std2 = new Student1(1,1,2,"lim");
		Student1.printCount();

		//std2.studentCount = 1;
		//System.out.println(std1.studentCount);
		std1.print();
		//Student1.print();//���� �߻�. static�� print���� �Ⱥپ
		std2.print();
		System.out.println(std1);
		System.out.println(std2);
	}

}
class Student1{
	private static int studentCount;
	private int grade, classNum, number;
	private String name;
	//�Ʒ� �����ڴ� �Ű������� �ְ�, �Ű������� �̸��� ��������� ���� ������ 
	//��� ������ ȣ���� �� this�� �ݵ�� �ٿ���.
	public Student1(int grade, int classNum, int number, String name) {
		this.grade = grade;
		this.classNum = classNum;
		this.number = number;
		this.name = name;
		studentCount++;
	}
	//�⺻ �����ڴ� �Ű������� ���� ������ this�� �Ƚᵵ ��.
	public Student1() {
		//��������� �̸��� ���� ���� ������ ������� �ִ�.(����õ)
		//int grade = 10;
		//this.grade = grade;
		this(1,1,1,"");
		name = "";
		/*
		this.grade = 1;
		classNum = 1;
		number = 1;
		name = "";
		*/
	}
	
	//��ü �޼���
	public void print() {
		System.out.println("===================");
		System.out.println("grade    : " + grade);//��ü ���� ��� ����
		System.out.println("classNum : " + classNum);
		System.out.println("number   : " + number);
		System.out.println("name     : " + name);
		//Ŭ���� ���� ��� ����
		//System.out.println("count    : " + studentCount);
		//Ŭ���� �޼��� ��� ����
		//printCount();
	}
	//Ŭ���� �޼���
	public static void printCount() {
		//Ŭ���� ���� ��� ����
		System.out.println("Registered student count : " + studentCount);
		//��ü ���� ��� �Ұ���(����)
		//grade = 1;
		//��ü �޼��� ��� �Ұ���(����)
		//print();
		//��ü�� ���� �� ȣ���ؼ� ��� ����
		Student1 std1 = new Student1();
		std1.name = "hong";
		std1.print();
		
	}
}