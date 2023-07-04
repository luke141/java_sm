package day25.student.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day25.student.vo.Student;

public class StudentController2 {

	public void run() {
		Scanner sc = new Scanner(System.in);
		int menu;
		List<Student> list = new ArrayList<Student>();
		do {
			//�޴� ���
			printMenu();
			//�޴� ����(�޴��� �Է¹���) : Scanner �ʿ�
			menu = sc.nextInt();
			//���õ� �޴��� ���� ����� ����
			runMenu(menu, sc, list);
			
		}while(menu != 3);
		sc.close();
	}
	private void printMenu() {
		System.out.println("�޴�");
		System.out.println("1. �л����");
		System.out.println("2. �л�Ȯ��");
		System.out.println("3. ����");
		System.out.print("�޴� ���� : ");
	}
	
	private void runMenu(int menu, Scanner sc, List<Student> list) {
		switch(menu) {
		case 1:
			//�л����� �Է�
			insertStudent(sc, list);
			break;
		case 2:
			//�л� ��ü�� Ȯ��
			print(list);
			break;
		case 3:
			break;
		default:
		}
	}
	
	public void insertStudent(Scanner sc, List<Student> list) {
		String num, name, major;
		Student tmp;
		//�й�(���ڿ�, ������ ����)
		System.out.print("�й� : ");
		num = sc.next();
		//�̸�(���ڿ�, ������ �ִ�)
		sc.nextLine();
		System.out.print("�̸� : ");
		name = sc.nextLine();
		//��(���ڿ�, ������ �ִ�)
		System.out.print("���� : ");
		major = sc.nextLine();
		//�л����� ����Ʈ�� ����
		//�Է��� ������ �̿��Ͽ� �л� ��ü�� ����
		tmp = new Student(num, name, major);
		//����Ʈ�� �л� ��ü�� �߰�
		list.add(tmp);
	}
	
	public void print(List<Student> list) {
		for(Student tmp2 : list) {
			System.out.println(tmp2);
		}
	}
}
