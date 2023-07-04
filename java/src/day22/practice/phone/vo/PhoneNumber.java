package day22.practice.phone.vo;

import java.util.Objects;
import java.util.regex.Pattern;

import lombok.Data;

//�ѻ���� ��ȭ��ȣ 
@Data
public class PhoneNumber {
	private String name;
	private String number; //010-1234-5678, 123456
	
	public PhoneNumber(String name, String number) {
		this.name = name;
		/*
		this.number = "";
		if(checkNumber(number)) {
			this.number = number;
		}*/
		
		this.number = checkNumber(number)?number:"";
		//�� �ڵ�� �Ʒ� �ּ����� Ǯ�� ���� �ִ�.
		/*if(checkNumber(number)) {
			this.number = number;
		}else {
			this.number = "";
		}*/
	}
	
	//��ȭ��ȣ�� 010-xxxx-xxxx ������ �´��� Ȯ�����ִ� �޼���
	//�ܺο����� ��ü�������� ���� �ְ� static�� public�� �ٿ���
	public static boolean checkNumber(String num) {
		String regex = "^010(-\\d{4}){2}$";
		return Pattern.matches(regex, num);
	}
	
	public void setNumber(String number) {
		this.number = checkNumber(number)?number:this.number;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneNumber other = (PhoneNumber) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
		
}
