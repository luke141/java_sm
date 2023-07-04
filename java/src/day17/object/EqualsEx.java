package day17.object;

import java.util.Objects;

import lombok.Data;

public class EqualsEx {

	public static void main(String[] args) {
		Customer list[] = {
			new Customer("ȫ", "010-1234-5678"),
			new Customer("��", "010-1111-5678"),
			new Customer("��", "010-5555-5678")
		};
		Customer customer = new Customer("ȫ", "010-1234-5678");

		//equals()�� �������̵� �ȵ��� �� ���� ��ܿ� �ִ��� ��ȸ
		/*
		for(Customer tmp : list) {
			if(tmp.getPhoneNumber().equals(customer.getPhoneNumber())) {
				System.out.println("OK");
				return ;
			}
		}
		System.out.println("FAIL");
		*/
		//equals()�� �������̵� ���� �� ���� ��ܿ� �ִ��� ��ȸ
		for(Customer tmp : list) {
			if(tmp.equals(customer)) {
				System.out.println("OK");
				return ;
			}
		}
		System.out.println("FAIL");
	}

}
@Data
class Customer{
	private String id;
	private String name;
	private String phoneNumber;
	
	public Customer(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(phoneNumber, other.phoneNumber);
	}


}