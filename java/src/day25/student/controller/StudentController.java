package day25.student.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day25.student.vo.Student;

public class StudentController {

	public void run() {
		Scanner sc = new Scanner(System.in);
		int menu;
		String name, num, major;
		List<Student> list = new ArrayList<Student>();
		Student tmp;
		do {
			//�޴� ���
			System.out.println("�޴�");
			System.out.println("1. �л����");
			System.out.println("2. �л�Ȯ��");
			System.out.println("3. ����");
			System.out.print("�޴� ���� : ");
			//�޴� ����(�޴��� �Է¹���) : Scanner �ʿ�
			menu = sc.nextInt();
			//���õ� �޴��� ���� ����� ����
			switch(menu) {
			case 1:
				//�л����� �Է�
				//�й�(���ڿ�, ������ ����)
				num = sc.next();
				//�̸�(���ڿ�, ������ �ִ�)
				sc.nextLine();
				name = sc.nextLine();
				//��(���ڿ�, ������ �ִ�)
				major = sc.nextLine();
				//�л����� ����Ʈ�� ����
				//�Է��� ������ �̿��Ͽ� �л� ��ü�� ����
				tmp = new Student(num, name, major);
				//����Ʈ�� �л� ��ü�� �߰�
				list.add(tmp);
				System.out.println(list);
				break;
			case 2:
				//�л� ��ü�� Ȯ��
				for(Student tmp2 : list) {
					System.out.println(tmp2);
				}
				break;
			case 3:
				break;
			default:
			}
		}while(menu != 3);
		sc.close();
	}
}
