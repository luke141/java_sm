package day15.practice.shop.vo;

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
}
