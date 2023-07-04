package day17.practice.service;

import day17.practice.vo.Customer;
import day17.practice.vo.Product;
import day17.practice.vo.Sales;

public interface ShopService {

	//��ǰ�� ������ �߰��ϴ� ���(���� ��ǰ�̸� ��ǰ �߰�)
	int store(Product[] list, int count, Product product);

	//��ǰ���� �־����� ��ǰ ������ ����ϴ� ���
	void printProduct(Product[] list, int count, String search);
	//���� �߰��ϴ� ���
	int registerCustomer(Customer[] customerList, int customerCount, Customer customer);
	//������ ��ǰ�� �Ǹ��ϴ� ���
	int sell(Product[] list, int count, Customer[] customerList, int customerCount, Sales[] salesHistory,
			int salesCount, String name, int amount, String phoneNumber);
	//���� ������ ����ϴ� ���
	void printSales(Sales[] salesHistory, int salesCount);

}
	

