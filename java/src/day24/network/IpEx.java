package day24.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpEx {

	public static void main(String[] args) {
		InetAddress inetAdress = null;
		
		try {
			//�̸��� localhost�� ���� IP �ּ� ������ ������. ��� PC�� ����
			inetAdress = InetAddress.getByName("localhost");
			System.out.println(inetAdress);
			//���̹� ����Ʈ�� ������ �ּ� ��ȸ
			inetAdress = InetAddress.getByName("www.naver.com");
			System.out.println(inetAdress);
			//�� PC�� ������ ��ȸ
			inetAdress = InetAddress.getLocalHost();
			System.out.println(inetAdress);
			InetAddress [] address = 
				InetAddress.getAllByName("www.naver.com");
			for(InetAddress tmp : address) {
				System.out.println(tmp);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
