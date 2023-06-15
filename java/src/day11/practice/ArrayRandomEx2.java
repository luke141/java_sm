package day11.practice;

public class ArrayRandomEx2 {

	public static void main(String[] args) {
		int min = 1, max = 9;
		int [] arr = new int[3];
		
		//���1 : 9�������� �ִ� �迭�� �̿�
		//�۾��� �ܼ�. ���� ������ �ʿ�
		boolean checkArr[] = new boolean[10]; 
		
		for(int i = 0; i < 3; ) {
			int random = (int)(Math.random()*(max - min + 1) + min);
			//checkArr �迭�� random������ �ִ� ���� false�̸�
			if(!checkArr[random]) {
				//random�� �迭�� ����.
				arr[i] = random;
				//i�� ����. 
				i++;
				//checkArr�迭�� random������ �ִ� ���� true�� ����
				checkArr[random] = true;
			}
		}
		for(int i = 0; i<3; i++) {
			System.out.println(arr[i]);
		}
		
		//���2 : ����� ������ ��
		int count = 0;//���� ����� ������ ����
		int i = 0; //�ݺ������� ����� ����
		
		while(count < 3) {
			int random = (int)(Math.random()*(max - min + 1) + min);
			//�̹� ����� ��������� �ϳ��ϳ� ���ؼ� ������ �ִ��� Ȯ���Ͽ�
			//������ �ݺ��� ����
			for(i=0; i<count; i++) {
				if(random == arr[i]) {
					break;
				}
			}
			/* �� �ݺ������� break�� ������ ������ i�� count�� �� �����ϱ� ������
			 * �ݺ��� ���� �� i�� count�� ����.
			 * ������ break�� ������ �߰��� ���� ������ i�� count���� �۴�.*/
			if(i == count) {
				arr[count] = random;
				count++;
				//arr[count++] = random;
			}
		}

		System.out.println("========");
		printArray(arr);
		
		//���3 : ���2�� �޼���� ����
		createRandomArray(min, max, arr);
		System.out.println("========");
		printArray(arr);
	}
	/**������ �迭�� �־�����, ������ �迭�� ���� �ֿܼ� ����ϴ� �޼���
	 * �Ű����� : �迭 => int arr[]
	 * ����Ÿ�� : ���� => void
	 * �޼���� : printArray
	 */
	public static void printArray(int arr[]) {
		int i;
		for(i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	/**���� num�� �迭�� 0�������� count����ŭ Ȯ������ �� �ߺ��� ���� �ִ���
	 * ������ �˷��ִ� �޼���
	 * �Ű����� : �ߺ��� Ȯ���� �迭, ���� ���� num, ���� ���� count
	 * 			=> int arr[], int num, int count
	 * ����Ÿ�� : �ִ��� ������ => boolean
	 * �޼���� : contains
	 */
	public static boolean contains(int arr[], int num, int count) {
		for(int i=0; i<count; i++) {
			//�ߺ��Ǹ� �޼��带 �����ϸ鼭 �ߺ��ƴٰ� �˷���.
			if(num == arr[i]) {
				return true;
			}
		}
		//�� ��ġ���� �Դٴ°� return true�� �� �����ٴ� ���̰�,
		//�� ���� �ߺ����� �ʾҴٴ� ��
		return false;
	}
	/**min���� max������ ������ ���� �����ؼ� �迭�� �����ϴ� �޼���
	 * �Ű����� : �ּҰ�, �ִ밪, �迭 => int min, int max, int arr[]
	 * ����Ÿ�� : ���� => void
	 * �޼���� : createRandomArray
	 */
	public static void createRandomArray(int min, int max, int arr[]) {
		//�迭�� �����Ǿ� ���� ������(�迭�� null�̸�) �޼��� ����
		if(arr == null) {
			return;
		}
		//�������� ��������� ���� ������ �迭�� ũ�⺸�� ������ �޼��带 ����
		//1~3 : 3���� 4��¥�� �迭�� �ߺ����� �ʰ� �� �� ����
		if(max - min + 1 < arr.length) {
			return;
		}
		
		int count = 0;
		int i;
		
		while(count < 3) {
			int random = (int)(Math.random()*(max - min + 1) + min);
			//�ߺ����� ������ �迭�� ���� �� count ����
			if(!contains(arr, random, count)) {
				arr[count] = random;
				count++;
			}
		}
	}
}



	

