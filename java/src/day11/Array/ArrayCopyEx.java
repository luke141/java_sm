package day11.Array;

public class ArrayCopyEx {

	public static void main(String[] args) {
	//�迭�� arr1�� arr2�� ��������
			int arr1[] = new int[] {1,2,3,4,5};
			int arr2[] = arr1;//�� �ڵ�� �迭�� arr1�� arr2�� ����
			
			arr2[0] = 10;//arr2�� �ִ� 0������ �����ϸ� arr1�� ���� ����
			
			for(int tmp : arr1) {
				System.out.println(tmp);
			}

			arr2[0] = 1;//�ʱⰪ���� �ǵ���
			
			arr2 = new int[arr1.length];//�����ϱ� ���� �迭�� ����
			
			for(int i = 0; i<arr1.length; i++) {
				arr2[i] = arr1[i];
			}
			
			arr2[0] = 10;//�ݺ����� ���� ����� arr2�� 0������ �����ص� arr1�� �Ⱥ���
			
			System.out.println("============");
			for(int tmp : arr1) {
				System.out.println(tmp);
			}
			
			int arr3[] = new int[arr1.length];
			System.arraycopy(arr1, 2, arr3, 2, 3);
			
			//arr3[0] = 10;
			
			System.out.println("============");
			for(int tmp : arr3) {
				System.out.println(tmp);
			}
		}

	}
