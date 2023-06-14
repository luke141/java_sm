package day11.Array;

public class ArrayMethodEx1 {

	public static void main(String[] args) {
		// �޼����� �Ű������� ���� ����.
				int num1 = 10, num2 = 20;
				System.out.println("num1 = " + num1 + ", num2 = " + num2);
				//�� ������ ��ȯ
				int tmp = num1;
				num1 = num2;
				num2 = tmp;
				System.out.println("num1 = " + num1 + ", num2 = " + num2);
				System.out.println("=====================");
				
				num1 = 10;
				num2 = 20;
				System.out.println("num1 = " + num1 + ", num2 = " + num2);
				swap(num1, num2);
				System.out.println("num1 = " + num1 + ", num2 = " + num2);
				
				int arr1[] = {1,2,3,4};
				int arr2[] = {5,6,7,8};
				int tmpArr[] = new int [arr1.length];
				
				System.out.println("=====================");
				printArr(arr1);
				printArr(arr2);
				
				//�� �迭�� ��ȯ
				tmpArr = arr1;
				arr1 = arr2;
				arr2 = tmpArr;
				
				System.out.println("=====================");
				printArr(arr1);
				printArr(arr2);
				
				//�Ű������� �Ѱ��� �迭�� �ּҰ� �޼��� �ȿ��� �ٲ�� ������ ������ ����
				swap(arr1, arr2);
				System.out.println("=====================");
				printArr(arr1);
				printArr(arr2);
				
				//�Ű������� �Ѱ��� �迭�� �ּҰ� �ƴ� �迭�� ���� �޼��� �ȿ��� �ٲ��
				//������ ������ ����
				swap2(arr1, arr2);
				System.out.println("=====================");
				printArr(arr1);
				printArr(arr2);
				
				System.out.println("=====================");
				int arr3[] = {1,2,3,4};
				printArr(arr3);
				test1(arr3);
				printArr(arr3);
				
				System.out.println("=====================");
				int arr4[] = {1,2,3,4};
				printArr(arr4);
				test2(arr4);
				printArr(arr4);
				
			}
			
			public static void test1(int arr[]) {
				//���� �迭�� ������ ���ο� �迭�� ���� 
				//=> main���� ����Ǿ��� �迭�� ������ ����
				arr = new int [4];
				arr[0] = 3;
			}
			public static void test2(int arr[]) {
				arr[0] = 3;
			}
			
			public static void printArr(int arr[]) {
				for(int num : arr) {
					System.out.print(num + " ");
				}
				System.out.println();
			}
			
			/**�� �迭�� ��ȯ�ϴ� �޼���2 : ��ȯ�� ��*/
			public static void swap2(int arr1[], int arr2[]) {
				int tmp[] = new int [arr1.length];
				for(int i = 0; i<arr1.length; i++) {
					tmp[i] = arr1[i];
					arr1[i] = arr2[i];
					arr2[i] = tmp[i];
				}
			}
			
			/**�� �迭�� ��ȯ�ϴ� �޼���1 : ��ȯ�� �ȵ�*/
			public static void swap(int arr1[], int arr2[]) {
				int tmpArr[] = arr1;
				arr1 = arr2;
				arr2 = tmpArr;
			}
			
			/**�� ������ ���� ��ȯ�ϴ� �޼��� :��ȯ�� �ȵ�*/
			/* �Ű����� num1�� num2�� �޼��尡 ȣ��Ǹ� ���� ������ ����
			 * ȣ���� ������ �Ѱ��� ���� ������ ��.(���纻���� �޼��带 ����) */
			public static void swap(int num1, int num2) {
				int tmp = num1;
				num1 = num2;
				num2 = tmp;
			}
			
		}
