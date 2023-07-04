package day17.practice.controller;

import java.util.Scanner;

import day17.interfaceex.RunInterface;
import day17.practice.service.ShopService;
import day17.practice.service.ShopServiceImp;
import day17.practice.vo.Customer;
import day17.practice.vo.Product;
import day17.practice.vo.Sales;

public class ShopController implements RunInterface {

	private Scanner sc = new Scanner(System.in);
	private Product list[] = new Product[10];//��ǰ ����Ʈ
	private int count = 0;//����� ��ǰ ����
	private Customer customerList[] = new Customer[10];//�ִ� 10���� �� ����
	private int customerCount = 0;//����� �� ��
	private Sales salesHistory[] = new Sales[100];//�Ǹ� ���
	private int salesCount;//��ϵ� �Ǹż�
	
	private ShopService shopService = new ShopServiceImp();
	
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
			//��ǰ�� �Է�
			System.out.print("��ǰ�� : ");
			sc.nextLine();
			String name = sc.nextLine();
			//��ǰ ���� �Է�
			System.out.print("����  : ");
			int amount = sc.nextInt();
			//�� ���� �Է�
			System.out.print("��ȣ : ");
			String phoneNumber = sc.next();
			
			int salesCount = shopService.sell(
					list, count, //��ǰ ����Ʈ ����
					customerList, customerCount, //�� ����Ʈ ����
					salesHistory, this.salesCount, //�Ǹ� ���� ����
					name, amount, phoneNumber
				);
			if(salesCount == -1) {
				System.out.println("��ǰ �Ǹ� ����!");
			}else {
				System.out.println("��ǰ �Ǹ� ����!");
				this.salesCount = salesCount;
			}
			break;
		case 2:
			//�԰��� ��ǰ ������ �Է¹޾� ��ǰ ��ü�� ����
			Product product = inputStoreProudct();
			//��ǰ ����Ʈ�� ��ǰ ��, �԰�� ��ǰ�� �ְ�, ��ǰ �԰� �����϶�� ��Ŵ
			//�� ��ǰ�� �԰�� ��� ��ǰ ����Ʈ�� �߰� �ǰ� ��ǰ���� 1 �����ؾ��ϱ� ������
			count = shopService.store(list, count, product);
			break;
		case 3:	
			//��ǰ���� �Է�
			System.out.print("��ǰ�� : ");
			sc.nextLine();
			String search = sc.nextLine();
			
			//��ǰ�� �˻��ؼ� ��� 
			shopService.printProduct(list, count, search);
			break;
		case 4:	
			shopService.printSales(salesHistory, this.salesCount);
			break;
		case 5:	
			Customer customer = inputRegisterCustomer();
			
			int count = shopService.registerCustomer(customerList, 
				customerCount, customer);
			if(count == -1) {
				System.out.println("�� ��� ����!");
			}else {
				System.out.println("�� ��� ����!");
				customerCount = count;
			}
			break;
		case 6:	
			break;
		default:
			System.out.println("�߸��� �޴�!");
		}
	}

	private Customer inputRegisterCustomer() {
		//�� ����(�̸�, ��ȭ��ȣ)�� �Է�
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("��ȣ : ");
		String phoneNumber = sc.next();
		
		//return new Customer(name, phoneNumber);
		Customer customer = new Customer(name, phoneNumber);
		return customer;
	}

	private Product inputStoreProudct() {
		
		System.out.print("��ǰ�� : ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("����  : ");
		int amount = sc.nextInt();
		
		if(amount < 0) {
			System.out.println("�԰� ���� ����!");
			return null;
		}
		
		
		int index = indexOf(name);
	
		if(index != -1) {
			Product product = new Product(list[index]);
			product.setAmount(amount);
			return product;
		}
		
		if(count == list.length) {
			System.out.println("��ǰ ����Ʈ ����!");
			return null;
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
		
		Product product = new Product(name, modelName, price, 
				amount, category);
		
		return product;
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
	
}
