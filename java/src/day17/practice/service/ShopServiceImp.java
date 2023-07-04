package day17.practice.service;

import day17.practice.vo.Customer;
import day17.practice.vo.Product;
import day17.practice.vo.Sales;

public class ShopServiceImp implements ShopService {

	@Override
	public int store(Product[] list, int count, Product product) {
		//�԰��� ��ǰ�� ������ �԰����� �ʰ�, ���� ��ǰ ���� �˸�.
		if(product == null) {
			return count;
		}
		//��ǰ����Ʈ�� ������
		if(list == null) {
			return 0;
		}
		//��ǰ ����Ʈ�� ũ�Ⱑ count���� ������
		if(list.length < count) {
			return list.length;
		}
		//��ǰ���� �߸��Ǹ�(�����̸�)
		if(count < 0) {
			return 0;
		}
		
		int index = indexOf(list, count, product);
		//���� ��ǰ �԰�
		if(index != -1) {
			list[index].store(product.getAmount());
			return count;
		}
		//�迭�� �� ����
		if(count == list.length) {
			return count;
		}
		
		//�� ��ǰ �԰�
		list[count] = new Product(product);
		return count+1;
	}

	private int indexOf(Product[] list, int count, Product product) {
		//��ǰ ������ ���ų� ��ǰ ���� ������ ��ã��
		if(product == null || product.getName() == null) {
			return -1;
		}
		//��ǰ ����Ʈ�� ������
		if(list == null) {
			return -1;
		}
		//�˻��� ��ǰ���� �߸� �ԷµǸ� 
		if(count > list.length || count < 0) {
			count = list.length;
		}
		for(int i = 0; i < count ; i++) {
			//��ǰ ����Ʈ���� ���� ��ǰ ������ tmp�� ���� 
			Product tmp = list[i];
			//��ǰ ����Ʈ�� �ִ� ��ǰ�� ���ų� �̸��� ���ų� ã�� ��ǰ���� ������ ��ã��
			if(	tmp == null || 
				tmp.getName() == null || 
				product.getName() == null) {
				return -1;
			}
			//��ǰ���� ���Ͽ� ������ ������ ��ȯ
			if(tmp.getName().equals(product.getName())) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public void printProduct(Product[] list, int count, String search) {
		if(list == null || search == null) {
			System.out.println("��ǰ ������ �����ϴ�.");
			return ;
		}
		
		int index = indexOf(list, count, new Product(search));
		
		if(index == -1) {
			System.out.println("��ǰ ������ �����ϴ�.");
			return ;
		}
		list[index].print();
	}

	@Override
	public int registerCustomer(Customer[] list, 
			int count, 
			Customer customer) {
		if(list == null 
			|| count < 0 
			|| customer == null
			|| customer.getPhoneNumber() == null
			|| list.length <= count) {
			return -1;
		}
		for(int i = 0; i<count; i++) {
			if(list[i].getPhoneNumber().equals(customer.getPhoneNumber())) {
				return -1;
			}
		}
		list[count] = 
			new Customer(customer);
		return count+1;
	}

	@Override
	public int sell(Product[] list, int count, Customer[] customerList, int customerCount, Sales[] salesHistory,
			int salesCount, String name, int amount, String phoneNumber) {
		//�� ����Ʈ�� �����ϴ��� Ȯ��
		if(list == null || customerList == null || salesHistory == null) {
			return -1;
		}
		//�� ����Ʈ�� �ִ� ũ�Ⱑ �� �������� ũ�ų� �������� üũ
		if(list.length < count 
			|| customerList.length < customerCount
			|| salesHistory.length <= salesCount) {
			return -1;
		}
		
		//��ǰ ���� �˻�
		int productIndex = indexOf(list, count, new Product(name));
		//�� ���� �˻�
		int customerIndex = indexOf(customerList, customerCount, phoneNumber);
		
		if(productIndex == -1 || customerIndex == -1) {
			return -1;
		}
		//�Ǹ� ������ ����
		Product sellProduct = new Product(list[productIndex]);
		sellProduct.setAmount(amount);
		Sales sales = new Sales(customerList[customerIndex], sellProduct);
		
		//�Ǹŵ� ��ǰ�� ������ ����
		list[productIndex].release(amount);
		
		//�ǸŸ���Ʈ�� �Ǹ� ������ �߰�
		salesHistory[salesCount] = sales;
		return salesCount + 1;
	}

	private int indexOf(Customer[] customerList, int customerCount, String phoneNumber) {
		if(customerList == null || phoneNumber == null) {
			return -1;
		}
		for(int i = 0; i < customerCount; i++) {
			if(customerList[i].getPhoneNumber().equals(phoneNumber)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public void printSales(Sales[] salesHistory, int salesCount) {
		int totalPrice = 0;
		//���� ���� ���
		for(int i =0; i<salesCount; i++) {
			salesHistory[i].print();
			totalPrice += salesHistory[i].getTotalPrice();
		}
		
		//���� ���⿪ ���
		System.out.println("���� ����� : " + totalPrice);
		
	}

	
	
	
	
	
}
		