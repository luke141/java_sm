package day12.homework;

import java.util.Scanner;

import array.Array;

public class LottoEx {

	public static void main(String[] args) {


		/* �ζ� ��ȣ�� �����ϰ�, ����ڰ� ��ȣ�� �Է��ϸ� ������� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 */
		
		//�������� �ζǹ�ȣ 6���� ���ʽ� ��ȣ 1���� ����
		//7�� ¥�� �迭�� �ζ� ��ȣ�� �����ϰ�, �տ� 6���� �ζǹ�ȣ, ������ 1���� ���ʽ��� Ȱ��
		int lotto[] = new int[7]; 
		Array.createRandomArray(1, 45, lotto);
		
		//������ 1���� ���ʽ���
		int bonus = lotto[6];
		int lotto2[] = new int[6];
		//�տ� 6���� �ζǹ�ȣ
		System.arraycopy(lotto, 0, lotto2, 0, 6);
		//�ζ� ��ȣ ����
		Array.sort(lotto2);
		
		System.out.println("number : ");
		Array.printArray(lotto2);//44 12 1 6 26 29
		System.out.println("bonus : " + bonus);
		
		//����ڰ�  ��ȣ�� 6�� �Է�
		Scanner sc = new Scanner(System.in);
		int user[] = new int[6];
		
		System.out.println("user : ");
		for(int i = 0; i<user.length; i++) {
			user[i] = sc.nextInt();
		}
		//�ߺ��Է��ϸ� �Ǻ� X
		if(Array.arrayCheck(user)) {
			System.out.println("Wrong number!");
			return;
		}
		//��� �Ǻ�
		int count = count(lotto2,user);
		printResult(count,Array.contains(user, bonus, user.length));
		sc.close();

	}
	
	/**�ζ� ��ȣ�� ����� ��ȣ�� �־����� ��� ������ �˷��ִ� �޼���
	 * �Ű����� : �ζǹ�ȣ�� ����� ��ȣ => int lotto[], int user[]
	 * ����Ÿ�� : � ������ => ���� => int
	 * �޼���� : count
	 * */
	public static int count(int lotto[], int user[]) {
		
		if(lotto == null || user == null) {
			return 0;
		}
		int count = 0;
		for(int tmp : lotto) {
			if(Array.contains(user, tmp, user.length)) {
				count++;
			}
		}
		return count;
	}
	/**��ġ�ϴ� ������ ���ʽ���ȣ�� ����� ��ȣ�� ��ġ�Ѵ� ���θ� �˷��ָ�
	 * ����� ����ϴ� �޼���
	 * �Ű����� : ��ġ�ϴ� ����, ���ʽ���ȣ�� ��ġ ����
 * 				 => int count, boolean checkBonus
	 * ����Ÿ�� : ���� => void
	 * �޼���� : printResult
	 */
	public static void printResult(int count, boolean checkBonus) {
		switch(count) {
		case 6:
			System.out.println("winner of the lottery!");
			break;
		case 5:
			if(checkBonus) {
				System.out.println("Second place in the lottery");
			}else {
				System.out.println("3rd place in the lottery");
			}
			break;
		case 4:
			System.out.println("4th place in the lottery");
			break;
		case 3:
			System.out.println("5th place in the lottery");
			break;
		default:
			System.out.println("Losing ticket!");
		}
	}
}
