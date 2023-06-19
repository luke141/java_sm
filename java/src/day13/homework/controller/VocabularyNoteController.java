package day13.homework.controller;

import java.util.Scanner;

import day13.homework.vo.VocabularyNote;

public class VocabularyNoteController {
	
	private Scanner sc = new Scanner(System.in);
	private VocabularyNote note = new VocabularyNote();

	public void run() {
		//�ݺ�(���Ḧ �����ϱ�������) => ������ 1���� ����
		int menu = -1;
		do {
			//�޴� ���
			printMenu();
			
			//�޴� ����
			menu = sc.nextInt();
			
			//�޴��� ���� ��� ����
			runMenu(menu);
			
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
		
		switch(menu) {
		//�޴��� 1�̸� �ܾ� �߰� ����� ����
		case 1:
			System.out.println("================");
			insertWord();
			System.out.println("================");
			break;
		//�޴��� 2�̸� �ܾ� ���� ����� ����
		case 2:
			System.out.println("================");
			deleteWord();
			System.out.println("================");
			break;
		//�޴��� 3�̸� �ܾ� ���� ����� ����
		case 3:
			System.out.println("================");
			updateWord();
			System.out.println("================");
			break;
		//�޴��� 4�̸� �ܾ� ��� ����� ����
		case 4:
			System.out.println("================");
			printWord();
			System.out.println("================");
			break;
		//�޴��� 5�̸� ���α׷��� ����
		case 5:
			System.out.println("================");
			System.out.println("���α׷� ����!");
			System.out.println("================");
			break;
		//�޴��� �׿��̸� �߸��� �޴���� ���
		default:
			System.out.println("================");
			System.out.println("�߸��� �޴� ����!");
			System.out.println("================");
		}
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
		int result = note.insert(title, meaning);
		
		switch(result) {
		case 1:	System.out.println("�ܾ� �߰� ����!"); 	break;
		case -1:System.out.println("�ǹ� �߰� ����!");	break;
		case 0:	System.out.println("�ܾ� �߰� ����!");	break;
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