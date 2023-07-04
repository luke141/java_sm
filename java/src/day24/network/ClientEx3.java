package day24.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx3 {

	public static void main(String[] args) {
		int port = 5001;//1.��Ʈ��ȣ ����
		String ip = "192.168.30.199";//1-1. ���� IP����
		Socket socket = new Socket();//2. ���� ����
		try{
			//3. ��������(IP,posrt) ���� ��û
			socket.connect(new InetSocketAddress(ip,port));
			//������ �Ϸ�Ǹ�, �б�/���� ����� ����
			Client client = new Client(socket);
			client.read();
			client.send();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
