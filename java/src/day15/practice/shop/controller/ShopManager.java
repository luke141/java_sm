package day15.practice.shop.controller;

import java.util.Scanner;

import day15.practice.shop.vo.Product;

public class ShopManager {

	private Scanner sc = new Scanner(System.in);
	private Product list[] = new Product[10];//��ǰ ����Ʈ
	private int count = 0;//����� ��ǰ ����
	
	public void run() {
		System.out.println("���α׷� ����!!");
		
		int menu = -1;
		final int EXIT = 6;
		//�ݺ� : ������ �޴��� ���ᰡ �ƴҶ�
		do {
			//�޴� ���
			printMenu();
			
			//�޴� ����
			menu = sc.nextInt();
			
			//������ �޴��� ���� ����� ����
			runMenu(menu);
			
		}while(menu != EXIT);
		System.out.println("���α׷� ����!!");
	}
	
	private void printMenu() {
		System.out.println("================");
		System.out.println("�޴�");
		System.out.println("1. ��ǰ �Ǹ�");
		System.out.println("2. ��ǰ �԰�");
		System.out.println("3. ��ǰ ��ȸ");
		System.out.println("4. ���� ��ȸ");
		System.out.println("5. �� ���");
		System.out.println("6. ���α׷� ����");
		System.out.print("�޴� ���� : ");
	}
	
	private void runMenu(int menu) {
		System.out.println("================");
		
		switch(menu) {
		case 1:	
			sell();
			break;
		case 2:
			store();
			break;
		case 3:	
			printProduct();
			break;
		case 4:	
			printSales();
			break;
		case 5:	
			registerCustomer();
			break;
		case 6:	
			break;
		default:
			System.out.println("�߸��� �޴�!");
		}
	}

	private void registerCustomer() {
		// TODO Auto-generated method stub
		
	}

	private void printSales() {
		// TODO Auto-generated method stub
		
	}

	private void printProduct() {
		// TODO Auto-generated method stub
		
	}

	private void store() {
		
		//�԰��� ��ǰ�� �Է�
		System.out.print("��ǰ�� : ");
		sc.nextLine();
		String name = sc.nextLine();
		
		//�԰��� ��ǰ ����
		System.out.print("����  : ");
		int amount = sc.nextInt();
		
		if(amount < 0) {
			System.out.println("�԰� ���� ����!");
			return;
		}
		
		//��ǰ ����Ʈ���� �԰��� ��ǰ���� �ִ��� ã��
		//��ǰ �迭�� �ִ� ��ǰ��� �԰��� ��ǰ���� ��������
		//Ȯ���ؼ� ������ ��ġ�� ���
		int index = indexOf(name);
		
		//������ �԰��� ��ǰ ���� ��ŭ �ش� ��ǰ�� �԰�
		//��ġ�� 0�̻��̸� 
		if(index != -1) {
			list[index].store(amount);
			System.out.println("�԰� �Ϸ�!");
			return;
		}
		//������ ��ǰ ����Ʈ�� ��ǰ ������ �߰�(�԰��� ������ �Բ�)
		//��ġ�� -1�̸�
		//�ִ�ġ�� ��ϵǾ� ������
		if(count == list.length) {
			System.out.println("��ǰ ����Ʈ ����!");
			return;
		}
		//�𵨸� �Է�
		System.out.println("�� ��ǰ ���");
		System.out.print("�𵨸� : ");
		sc.nextLine();
		String modelName = sc.nextLine();
		//������ �Է�
		System.out.print("����  : ");
		int price = sc.nextInt();
		//�з� �Է�
		System.out.print("�з�  : ");
		String category = sc.next();
		
		//��ǰ ����Ʈ�� �߰�
		list[count++] = new Product(name, modelName, price, amount, category);
		
		System.out.println("��ǰ �߰� �� �԰� �Ϸ�!");
	}

	/**��ǰ ����Ʈ�� ��ǰ��� ��ġ�ϴ� ��ǰ�� ������ ������, ������
	 * -1�� �˷��ִ� �޼���
	 * �Ű����� : ��ǰ�� => String name
	 * ����Ÿ�� : ��ǰ�� �ִ� ������ -1 => ���� => int
	 * �޼���� : indexOf
	 * */
	public int indexOf(String name) {
		for(int i = 0; i < count ; i++) {
			if(list[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	private void sell() {
		// TODO Auto-generated method stub
		
	}
}

