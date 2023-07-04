package day23;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) {
		
		File file = new File("test");
		try {
			//�ش� ����/������ �������� �ʰ�, 
			//�̸��� .�� ����(Ȯ���ڰ� ������) ������ ����
			if(!file.exists() && file.getName().contains(".")) {
				file.createNewFile();
				System.out.println("Create File!");
			}
			//�ش� ����/������ �������� �ʰ�,
			//�̸��� .�� �ȵ���(Ȯ���ڰ� ������) ������ ����
			if(!file.exists() && !file.getName().contains(".")) {
				file.mkdir();
				System.out.println("Create Directory!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//file.delete();
		
	}

}
