package array;

public class Array {
		//�迭 ��ü ���
		public static void printArray(int arr[]) {
			System.out.print("[");
			for(int i = 0; i<arr.length; i++) {
				System.out.println(arr[i] + (i==arr.length-1?"":", "));
			}
			System.out.println("]");		
	}
		//�迭�� start�������� end-1�������� ���
		public static void printArray(int arr[],int start, int end) {
			System.out.print("[");
			for(int i = start; i<end; i++) {
				if(i <= arr.length) {
					break;
				}
				System.out.println(arr[i] + (i==end-1?"":", "));
			}
			System.out.println("]");		
	}

}
