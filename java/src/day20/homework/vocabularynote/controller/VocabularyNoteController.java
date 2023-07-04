package day20.homework.vocabularynote.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import day17.interfaceex.RunInterface;
import day20.homework.vocabularynote.vo.VocabularyNote;

public class VocabularyNoteController implements RunInterface {
	
	private Scanner sc = new Scanner(System.in);
	private VocabularyNote note = new VocabularyNote();

	public void run() {
		//�ݺ�(���Ḧ �����ϱ�������) => ������ 1���� ����
		int menu = -1;
		do {
			try {
				//�޴� ���
				printMenu();
				
				//�޴� ����
				menu = sc.nextInt();
				
				//�޴��� ���� ��� ����
				runMenu(menu);
			}catch(InputMismatchException e) {
				System.out.println("�߸��� ���� �Է��߽��ϴ�.");
				sc.nextLine();
			}
		} while(menu != 5);
		sc.close();
	}
	/**�޴��� ����ϴ� �޼���
	 * �Ű����� : ����
	 * ����Ÿ�� : ���� => void
	 * �޼���� : printMenu
	 */
	private void printMenu() {
		System.out.println("�޴�");
		System.out.println("1. �ܾ� �߰�");
		System.out.println("2. �ܾ� ����");
		System.out.println("3. �ܾ� ����");
		System.out.println("4. �ܾ� ���");
		System.out.println("5. ���α׷� ����");
		System.out.print("�޴� ���� : ");
	}

	/**�޴��� ���� ����� �����ϴ� �޼���
	 * �Ű����� : �޴� => int menu
	 * ����Ÿ�� : ���� => void
	 * �޼���� : runMenu
	 */
	private void runMenu(int menu) {
		
		System.out.println("================");
		switch(menu) {
		//�޴��� 1�̸� �ܾ� �߰� ����� ����
		case 1:
			insertWord();
			break;
		//�޴��� 2�̸� �ܾ� ���� ����� ����
		case 2:
			deleteWord();
			break;
		//�޴��� 3�̸� �ܾ� ���� ����� ����
		case 3:
			updateWord();
			break;
		//�޴��� 4�̸� �ܾ� ��� ����� ����
		case 4:
			printWord();
			break;
		//�޴��� 5�̸� ���α׷��� ����
		case 5:
			System.out.println("���α׷� ����!");
			break;
		//�޴��� �׿��̸� �߸��� �޴���� ���
		default:
			System.out.println("�߸��� �޴� ����!");
		}
		System.out.println("================");
	}
	
	private void insertWord() {
		//�߰��� �ܾ �Է�
		System.out.print("�ܾ� : ");
		String title = sc.next();
		
		//�ܾ�� �Է��� ���͸� ó��
		sc.nextLine();
		
		//�߰��� ���� �Է�
		System.out.print("��  : ");
		String meaning = sc.nextLine();
		
		//�ܾ��忡 �߰�
		if(note.insert(title, meaning)) {
			System.out.println("�ܾ� �߰� ����!");
		}else {
			System.out.println("�ǹ� �߰� ����!");
		}
		
	}
	private void printWord() {
		//����޴� ���
		printSubMenuPrint();
		//����޴� ����
		int submenu = sc.nextInt();
		switch(submenu) {
		//����޴��� 1�̸� ��ü ���
		case 1:
			note.print();
			break;
		//����޴��� 2�̸� �˻�
		case 2:
			//�˻��� �ܾ�
			System.out.print("�˻� �ܾ� : ");
			String title = sc.next();
			//���
			note.search(title);
			break;
		}
	}
	private void printSubMenuPrint() {
		System.out.println("================");
		System.out.println("����޴�");
		System.out.println("1. ��ü ���");
		System.out.println("2. �ܾ� �˻�");
		System.out.print("���� �޴� ���� : ");
	}
	private void deleteWord() {
		//������ �ܾ� �Է�
		System.out.print("���� �ܾ� : ");
		String title = sc.next();
		
		//�ش� �ܾ� ����
		if(note.delete(title)) {
			System.out.println("�ܾ� ���� �Ϸ�!");
		}else {
			System.out.println("�ܾ� ���� ����!");
		}
	}
	private void updateWord() {
		//����޴� ���
		printSubMenuUpdate();
		//����޴� �Է�
		int submenu = sc.nextInt();
		//����޴��� ���� ��� ����
		switch(submenu) {
		//�ܾ� ����
		case 1:
			//������ �ܾ�
			System.out.print("������ �ܾ� : ");
			String word = sc.next();
			//������ �ܾ�
			System.out.print("������ �ܾ� : ");
			String updateWord = sc.next();
			//�ܾ��忡 �ִ� �ܾ� ��������� ����
			if(note.updateTitle(word, updateWord)) {
				System.out.println("�ܾ� ���� ����!");
			}else {
				System.out.println("�ܾ� ���� ����!");
			}
			break;
		//�� ����
		case 2:
			//���� ������ �ܾ �Է�
			System.out.print("�ܾ� : ");
			String title = sc.next();
			//�ܾ ��¸� ����ϰ�, �ܾ ������ �ȳ����� ����� ����
			if(!note.search(title)) {
				System.out.println("���� �ܾ��Դϴ�.");
				return ;
			}
			//������ ���� ��ȣ�� �Է�
			System.out.print("������ �� ��ȣ ���� : ");
			int num = sc.nextInt();
			
			sc.nextLine();//���� ó��
			//������ ���� �Է�
			System.out.print("������ �� : ");
			String meaning = sc.nextLine();
			//�ܾ��忡�� ����
			if(!note.updateMeaning(title, num, meaning)) {
				System.out.println("�� ���� ����!");
			}else {
				System.out.println("�� ���� ����!");
			}
			break;
		//�� ����
		case 3:
			//���� ������ �ܾ �Է�
			System.out.print("�ܾ� : ");
			String title2 = sc.next();
			//�ܾ ��¸� ����ϰ�, �ܾ ������ �ȳ����� ����� ����
			if(!note.search(title2)) {
				System.out.println("���� �ܾ��Դϴ�.");
				return ;
			}
			//������ ���� ��ȣ�� �Է�
			System.out.print("������ �� ��ȣ ���� : ");
			int num2 = sc.nextInt();
			if(!note.deleteMeaning(title2, num2)) {
				System.out.println("�� ���� ����!");
			}else {
				System.out.println("�� ���� ����!");
			}
			break;
		}
	}
	private void printSubMenuUpdate() {
		System.out.println("����޴�");
		System.out.println("1. �ܾ� ����");
		System.out.println("2. �� ����");
		System.out.println("3. �� ����");
		System.out.print("���� �޴� ���� : ");
	}
}
