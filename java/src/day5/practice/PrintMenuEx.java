package day5.practice;

import java.util.Scanner;

public class PrintMenuEx {

	public static void main(String[] args) {
		//�޴��� ����ϴ� ����
				/* �ݺ�Ƚ�� : menu�� 3�� �ƴҶ����� 
				 * ��Ģ�� : 
				 * - �޴��� ���
				 * - �޴��� �Է�
				 * - �Է¹��� �޴��� ���� �ֿܼ� ���
				 *   - �Է¹��� �޴��� 1�̸� Program Start!
				 *   - �Է¹��� �޴��� 2�̸� Program Save!
				 *   - �Է¹��� �޴��� 3�̸� Program Exit!
				 */
				int menu = 0; //3�� �ƴ� ������ �ʱ�ȭ
				Scanner sc = new Scanner(System.in);
				while(menu != 3) {
					//�޴��� ���
					System.out.println("Menu");
					System.out.println("1. Start");
					System.out.println("2. Save");
					System.out.println("3. Exit");
					System.out.println("Select Menu : ");
					
					//�޴��� �Է� 
					menu = sc.nextInt();
					
					//�Է¹��� �޴��� ���� �ֿܼ� ���
					switch(menu) {
					//�Է¹��� �޴��� 1�̸� Program Start!
					case 1:
						System.out.println("Program Start!");
						break;
					//�Է¹��� �޴��� 2�̸� Program Save!
					case 2:
						System.out.println("Program Save!");
						break;
					//�Է¹��� �޴��� 3�̸� Program Exit!
					case 3:
						System.out.println("Program Exit!");
						break;
					}
				}
				sc.close();

	}

}
