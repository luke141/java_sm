package day20.practice.student.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import day20.practice.student.vo.Student;

public class StudentController implements Program {

	private final static int EXIT = 4;
	private Scanner sc = new Scanner(System.in);
	
	private ArrayList<Student> list = new ArrayList<>();
	
	@Override
	public void run() {
		System.out.println("Program Start!");
		
		int menu;
		
		do {
			try {
				System.out.println(list);
				printMenu();
				menu = sc.nextInt();
				
				runMenu(menu);
			}catch(InputMismatchException e) {
				menu = EXIT-1;//���� �޴��� �ƴ� �ƹ� �޴��� �߰�
				sc.nextLine();//�տ��� �߸� �Է��� ������ �����
				System.out.println("Wrong Input!");
			}
		}while(menu != EXIT);
	}
	@Override
	public void printMenu() {
		System.out.println("Menu");
		System.out.println("1. Insert Student");
		System.out.println("2. Update Studnet");
		System.out.println("3. Delete Student");
		System.out.println("4. EXIT");
		System.out.print("Menu Select : ");
	}
	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1:
			insertStudent();
			break;
		case 2:
			updateStudent();
			break;
		case 3:
			deleteStudent();
			break;
		case 4:	break;
		default:
		}
	}
	private void deleteStudent() {
		//������ �л� ������ �Է�(�г�, ��, ��ȣ)
		System.out.print("grade : ");
		int grade = sc.nextInt();
		System.out.print("class : ");
		int classNum = sc.nextInt();
		System.out.print("number: ");
		int number = sc.nextInt();
		
		//������ �л������� �̿��Ͽ� �л� ��ü�� ����
		Student tmp = new Student(grade, classNum, number, null);
		
		//������ �õ��ؼ� �����ϸ� �����ߴٰ�, �����ϸ� �����ߴٰ� �˷���
		if(list.remove(tmp)) {
			//���� ����
			System.out.println("Delete success!!");
			return;
		}
		System.out.println("Delete fail");
	}
	private void updateStudent() {
		//������ �л��� ������ �Է�(�г�, ��, ��ȣ)
		System.out.print("grade : ");
		int grade = sc.nextInt();
		System.out.print("class : ");
		int classNum = sc.nextInt();
		System.out.print("number: ");
		int number = sc.nextInt();
		
		
		//������ �л��� �ִ��� ������ Ȯ��.
		//�л� ��ü�� ����
		Student tmp = new Student(grade, classNum, number, null);
		int index = list.indexOf(tmp);
		//������ ����
		if(index == -1) {
			System.out.println("Update fail!!");
			return;
		}
		
		//������ �л� ������ �Է�(�г�, ��, ��ȣ, �̸�)
		System.out.print("grade : ");
		grade = sc.nextInt();
		System.out.print("class : ");
		classNum = sc.nextInt();
		System.out.print("number: ");
		number = sc.nextInt();
		System.out.print("name  : ");
		sc.nextLine();//number�� �Է��ϰ� �� �� ���͸� ó���ϱ� ����
		String name = sc.nextLine();
		
		//�л� ������ ����
		//������ �л� ������ �̹� �ִ� �л����� Ȯ�� 
		//������ ������ �̿��Ͽ� �л� ��ü�� ����
		tmp = new Student(grade, classNum, number, name);
		//�г�,��,��ȣ�� ��ġ�ϴ� �л��� �ִ��� Ȯ���ؼ� ������ ����
		if(list.contains(tmp)) {
			System.out.println("Update fail!!");
			return;
		}
		list.get(index).update(grade, classNum, number, name);
	}
	private void insertStudent() {
		//�߰��� �л��� ������ �Է�(�г�, ��, ��ȣ, �̸�)
		System.out.print("grade : ");
		int grade = sc.nextInt();
		System.out.print("class : ");
		int classNum = sc.nextInt();
		System.out.print("number: ");
		int number = sc.nextInt();
		System.out.print("name  : ");
		sc.nextLine();//number�� �Է��ϰ� �� �� ���͸� ó���ϱ� ����
		String name = sc.nextLine();
		
		//�Է��� ������ �̿��Ͽ� �л� ��ü�� ����
		Student std = new Student(grade, classNum, number, name);
		
		//�л�����Ʈ�� �߰�
		//�л��� �ִ��� ������ Ȯ��(�г�, ��, ��ȣ)�ؼ� ������ �߰�
		if(!list.contains(std)) {
			list.add(std);
			System.out.println("Insert success!!");
			return;
		}
		
		//�߰� �����ϸ� �߰��ߴٰ�, �����ϸ� �����ߴٰ� �ֿܼ� ���
		System.out.println("Insert fail!!");
		
	}
}
