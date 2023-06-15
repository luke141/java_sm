package array;

public class Array {
		//배열 전체 출력
		public static void printArray(int arr[]) {
			System.out.print("[");
			for(int i = 0; i<arr.length; i++) {
				System.out.println(arr[i] + (i==arr.length-1?"":", "));
			}
			System.out.println("]");		
	}
		//배열을 start번지부터 end-1번지까지 출력
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
