package day17.practice.vo;

import lombok.Data;

@Data
public class Product {
	//��� ���� : ��ǰ �Ǹſ� ���õ� ��ǰ ����
	private String name;//��ǰ��
	private String modelName;//�𵨸�
	private int price;//����
	private int amount;//����(�Ǹ� ����, ��ü ����)
	private String category;//�з�
	
	//������
	public Product(String name, String modelName, int price, int amount, String category) {
		this.name = name;
		this.modelName = modelName;
		this.price = price;
		this.amount = amount;
		this.category = category;
	}
	
	public Product(Product product) {
		this.name = product.name;
		this.modelName = product.modelName;
		this.price = product.price;
		this.amount = product.amount;
		this.category = product.category;
	}

	public Product(String search) {
		this.name = search;
	}

	//�޼���
	/**��ǰ �԰� ��� => ���� ������ �־��� ������ ����*/
	public void store(int amount) {
		//â�� ��ǰ�� �߰��ؾ��ϴµ� ������ ���� �ȵ�
		if(amount < 0) {
			return;
		}
		accumulate(amount);
	}
	/**��ǰ ��� ��� => ���� �������� �־��� ������ ����*/
	public void release(int amount) {
		if(amount < 0) {
			return;
		}
		accumulate(-amount);
	}
	private void accumulate(int amount) {
		this.amount += amount;
	}

	public void print() {
		System.out.println("��ǰ�� : " + name);
		System.out.println("�𵨸� : " + modelName);
		System.out.println("�з�  : " + category);
		System.out.println("����  : " + amount);
		System.out.println("����  : " + price);
	}
}
