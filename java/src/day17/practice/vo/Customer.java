package day17.practice.vo;

import lombok.Data;

@Data
public class Customer {

	//CID00001
	private String customerId;//���� �߰��Ǹ� �ڵ����� �߱�
	private String name;
	private String phoneNumber;
	
	//�� ID �߱��� ���� Ŭ���� ����
	//��ϵ� ����
	private static int count;
	//�� ���̵� �պκ� 
	private final static String CID = "CID";
	//�� ���̵� �޺κ� ������ �ִ� ����
	private final static int MAX_SIZE = 5;
	//������
	public Customer(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		generateCustomerId();//customerId �߱��� �Ϸ�.
	}

	public Customer(Customer customer) {
		this.name = customer.name;
		this.phoneNumber = customer.phoneNumber;
		this.customerId = customer.customerId;
	}

	private void generateCustomerId() {
		//1 => 00001
		//1 => "1"
		String num = ""+ ++count;//���ڿ� + ���� => ���ڿ�
		//"1".length == 1
		int length = num.length();
		for(int i = 0; i<MAX_SIZE - length; i++) {
			num = "0" + num;
		}
		
		customerId = CID+num;
	}
	
	public void print() {
		System.out.println("����ȣ : " + customerId);
		System.out.println("���̸� : " + name);
		System.out.println("��ȭ��ȣ : " + phoneNumber);
	}
}