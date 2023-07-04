package day18.practice;

import java.util.Scanner;

public class StringCharAtEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alphabet[] = new int[26];//�� ���ĺ� ������ �����ϴ� �迭. 0���� : a�� ����, 1���� : b�ǰ���
		
		//�Է�
		System.out.print("input : ");
		String str = sc.nextLine();
		
		//�ݺ� : ���ڿ� ���̸�ŭ
		for(int i = 0; i < str.length(); i++) {
			//���ڿ��� �ѱ��ھ� �����ͼ� ���ĺ��� Ȯ���Ͽ� ���ĺ� ������ ����
			char ch = str.charAt(i);
			//ch�� ���ĺ� �ҹ����� ��� 0~25������ ���� ����
			int distance = ch - 'a';
			//���� �ҹ��ڰ� �ƴ� ��� 
			if(distance < 0 || distance > 25) {
				continue;
			}
			//�´� ���
			alphabet[distance]++;
		}
		//���ĺ� ���� �߰�
		for(int i = 0; i<alphabet.length; i++) {
			
			if(alphabet[i] == 0) {
				continue;
			}
			System.out.println((char)('a'+i) + " : " + alphabet[i]);
		}
		sc.close();
	}

}
