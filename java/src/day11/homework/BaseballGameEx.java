package day11.homework;

import java.util.Scanner;

import array.Array;

public class BaseballGameEx {

	public static void main(String[] args) {
		// ���� �߱� ������ �����ϼ���.
		// ���� �߱� ������ �����ϼ���.
		int com[] = new int[3];//�������� ���� �� ���� ������ �迭
		int user[] = new int[3];//����ڰ� �Է��� ���� ������ �迭
		int min = 1, max = 9;
		int strike = 0;//��Ʈ����ũ ����
		int ball = 0;//���� ����
		Scanner sc = new Scanner(System.in);
		
		
		// ������� ���� 3���� �������� ����(�ߺ� X)
		Array.createRandomArray(min, max, com);
		//Array.printArray(com);//���߿� �ּ� ó��
		
		// �ݺ���
		do {
			// ����ڰ� ���� 3���� �Է�
			System.out.print("user : ");
			for(int i = 0; i<user.length; i++) {
				user[i] = sc.nextInt();
			}
			//����� �Է� üũ
			if(Array.arrayCheck(user)) {
				System.out.println("You must not enter the same number!");
				continue;
			}
			
			// �Ǻ�
			//��Ʈ����ũ ���� �Ǻ�
			strike = strike(com,user);

			//���� ���� �Ǻ�
			ball = ball(com, user);
			
			//��Ʈ����ũ�� ���� ������ �°� ���
			printResult(strike, ball);
		}while(strike < 3);
		
		System.out.println("Good!");
		sc.close();
	}

	/**��Ʈ����ũ ������ �Ǻ��ϴ� �޼���
	 * => �� �迭���� ���� ������ �ִ� ������ � ������ �˷��ִ� �޼���
	 * �Ű����� : �� �迭=>int arr1[], int arr2[]
	 * ����Ÿ�� : ���� ������ �ִ� ������ � ������ => � => ���� => int
	 * �޼���� : strike
	 * */
	public static int strike(int arr1[], int arr2[]) {
		//�迭 ������ �ȵ� �迭�� 1�� ������ ���� �� ��� 0�� ����
		if(arr1 == null || arr2 == null) {
			return 0;
		}
		//�迭�� ������ �ٸ� ��� ���� ũ���� �迭�� �������� ���ϱ� ���� size ���
		int size = arr1.length < arr2.length ? arr1.length : arr2.length;
		
		int count = 0;//��Ʈ����ũ ����
		for(int i = 0; i<size; i++) {
			//���� ������ �ִ� ������ ���� ������(��Ʈ����ũ�̸�)
			if(arr1[i] == arr2[i] ) {
				count++;
			}
		}
		return count;
	}
	/**�� ������ �Ǻ��ϴ� �޼���
	 * => �� �迭���� �ٸ� ������ �ִ� ������ � ������ �˷��ִ� �޼���
	 * �Ű����� : �� �迭=>int arr1[], int arr2[]
	 * ����Ÿ�� : �ٸ� ������ �ִ� ������ � ������ => � => ���� => int
	 * �޼���� : strike
	 * */
	public static int ball(int arr1[], int arr2[]) {
		//�迭 ������ �ȵ� �迭�� 1�� ������ ���� �� ��� 0�� ����
		if(arr1 == null || arr2 == null) {
			return 0;
		}
		int count = 0;
		//�ٸ� ������ ���ؼ� ã�Ƶ� ������
		//�� �迭���� ���� ������ �������� ��Ʈ����ũ ������ ���� ���� ����
		for(int tmp : arr1) {
			//�迭1���� ���� ���� arr2�� ������ ������ ����
			if(Array.contains(arr2, tmp, arr2.length)) {
				count++;
			}
		}
		return count - strike(arr1, arr2);
		//���� �ݺ����� �̿��ؼ� �ٸ� ������ ���ϴ� �ڵ�
		/*for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr2.length; j++) {
				if(i == j) {
					continue;
				}
				if(arr1[i] == arr2[i]) {
					count++;
				}
			}
		}
		return count;
		*/
	}
	/**��Ʈ����ũ�� ���� ������ �־����� ����� ����ϴ� �޼���
	 * �Ű����� : ��Ʈ����ũ ����, ���� ���� => int strike, int ball
	 * ����Ÿ�� : ���� =>void
	 * �޼���� : printResult
	 */
	public static void printResult(int strike, int ball) {
		if(strike != 0) {
			System.out.print(strike + "S");
		}
		if(ball != 0) {
			System.out.print(ball + "B");
		}
		if(strike == 0 && ball == 0) {
			System.out.print("3O");
		}
		System.out.println();
	}
	
}