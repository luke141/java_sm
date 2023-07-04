package day24.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx3 {

	public static void main(String[] args) {
		int port = 5001;//1. ��Ʈ��ȣ ����
		
		//2. ServerSocket ����
		try(ServerSocket serverSocekt = new ServerSocket(port);){
			while(true) {
				//3. ���� ��� �� ��û�� ���� ����
				Socket socket = serverSocekt.accept();
				//������ Ŭ���̾�Ʈ�� �а� ���⸦ ��.
				//������ Ŭ���̾�Ʈ�� ����� �ٸ��� Server Ŭ������ �߰��ؼ�
				//�Ʒ� �κ��� Client�� �ƴ� Server�� ����
				Client client = new Client(socket);
				//read()/send() ���� �߿����� ����. ������ �����带 �̿��ؼ�
				client.read();
				client.send();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
