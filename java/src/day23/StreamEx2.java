package day23;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StreamEx2 {

	public static void main(String[] args) {
		//���Ͽ� ���ڵ��� ��
		try(FileWriter fw = new FileWriter("test.txt")){
			for(int i = 0; i<5; i++) {
				fw.write("�ȳ��ϼ���"+i+"\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//���Ͽ� ���� �ִ� ���ڵ��� �о��
		try(FileReader fr = new FileReader("test.txt")){
			char ch[] = new char[1024];
			int len;
			while((len = fr.read(ch)) != -1) {
				/*
				for(int i = 0; i<len; i++) {
					System.out.print(ch[i]);
				}*/
				System.out.print(ch);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
