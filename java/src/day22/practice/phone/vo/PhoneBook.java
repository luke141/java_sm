package day22.practice.phone.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class PhoneBook {

	//��ȭ��ȣ ����Ʈ
	private List<PhoneNumber> list = new ArrayList<>();
	
	//��ȭ��ȣ �߰�
	public boolean insertPhone(String name, String number) {
		//�̸��� ��ȭ��ȣ�� �̿��Ͽ� ��ȭ��ȣ ��ü�� ����
		PhoneNumber pn = new PhoneNumber(name, number);
		//��ȭ��ȣ�� ��� ������ => ��ȭ��ȣ ���Ͽ� ���� ������ ���� X
		if(pn.getNumber().length() == 0) {
			return false;
		}
		//��ȭ��ȣ�� ���Ͽ� ������ ��ȭ��ȣ�ο� ��ȣ�� �߰�
		list.add(pn);
		return true;
	}
	
	//��ȭ��ȣ ���� : �̸�
	public boolean updateName(String name, String updateName) {
		//name�� ��ġ�ϴ� ��ȭ��ȣ�� ã�ƾ���
		//��ȭ��ȣ�ο� ������ �̸��� �ش��ϴ� ��ȭ��ȣ�� ��� �ִ��� Ȯ�� 
		int index = list.indexOf(new PhoneNumber(name,""));
		//������ ������ �ȵ� => �޼��带 ����
		if(index == -1) {
			return false;
		}
		//ã�� ��ȭ��ȣ�� �̸��� ���� 
		//��ȭ��ȣ�ο��� �̸��� ��ġ�ϴ� ��ȭ��ȣ�� ������
		PhoneNumber pn = list.get(index);
		//������ ��ȭ��ȣ�� �̸��� ����
		pn.setName(updateName);
		//list.get(index).setName(updateName);
		/*
		//�⺻�ڷ����� =�� �̿��ϸ� ���� �����ϱ� ������ ������ ���� �ٲ� �ٸ�����
		//�ȹٲ�
		int num1 = 1;	//num1 = 1
		int num2 = num1;//num1 = 1, num2 = 1
		num2 = 10;		//num1 = 1, num2 = 10
		//���������� =�� �̿��ϸ� �ּҰ��� �����ϱ� ������ ������ ���� �ٲ�� �ٸ��ʵ� �ٲ�(����)
		//���� ��� pn1�� ����� �ּҰ� 0x1000
		PhoneNumber pn1 = new PhoneNumber("a", "010-1234-5678");
		//pn1�� ����� �ּ� : 0x1000, pn2�� ����� �ּ� : 0x1000
		PhoneNumber pn2 = pn1;
		//0x1000������ �ִ� ��ü�� name�� Lim���� ����
		pn2.setName("Lim");
		*/
		return true;
	}
	
	//��ȭ��ȣ ���� : ��ȣ
	public boolean updateNumber(String name, String number) {
		//name�� ��ġ�ϴ� ��ȭ��ȣ�θ� ã��
		int index = list.indexOf(new PhoneNumber(name, number));
		//��ġ�ϴ� ��ȭ��ȣ�ΰ� ������ ���� ����
		if(index == -1) {
			return false;
		}
		
		//number�� ��ȭ��ȣ ������ �´��� Ȯ���ϱ� ���ؼ�
		//��ȭ��ȣ ������ ������ ��ȭ��ȣ ��ü�� ���� ���� �� ��ȭ��ȣ�� �ְ�, 
		//������ ���� ������ �� ���ڿ��� �ִ�.
		//name�� number�� �̿��Ͽ� ��ȭ��ȣ ��ü�� �����ϴ� ��� checkNumber�� �̿�
		//number�� ��ȭ��ȣ �����̸� ��ȭ��ȣ�� ����
		if(!PhoneNumber.checkNumber(number)) {
			return false;
		}
		list.get(index).setNumber(number);
		return true;
	}
	//��ȭ��ȣ ���� : �̸�, ��ȣ
	public boolean update(String name, String updateName, String number) {
		PhoneNumber pn = new PhoneNumber(name, number);
		//name�� �̿��Ͽ� ��ȭ��ȣ�� �˻�
		int index = list.indexOf(pn);
		//������ ���� ����
		if(index == -1) {
			return false;
		}
		//number�� ��ȭ��ȣ ���Ͽ� �ȸ����� ����
		if(!PhoneNumber.checkNumber(number)) {
			return false;
		}
		//������ �ִ� ��ȭ��ȣ�� ����
		list.remove(index);
		//updateName�� number�� �̿��Ͽ� ��ȭ��ȣ ��ü�� ������ �� �߰�
		pn.setName(updateName);
		list.add(pn);
		return true;
	}
	//��ȭ��ȣ ���� 
	public boolean delete(String name) {
		//name���� PhoneNumber ��ü�� ���� �� ���� ��û
		return list.remove(new PhoneNumber(name, ""));
	}
	//��ȭ��ȣ ���
	public void print(Predicate<PhoneNumber> p) {
		for(PhoneNumber pn : list) {
			if(p.test(pn)) {
				System.out.println(pn);
			}
		}
	}
}

