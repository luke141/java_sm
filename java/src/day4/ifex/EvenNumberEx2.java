package day4.ifex;

public class EvenNumberEx2 {

	public static void main(String[] args) {
		//Ȧ¦ �Ǻ� ������ ���� �����ڸ� �̿��Ͽ� �ۼ�
		
		int num = 98;
		String result = num % 2 == 0 ? "even" : "odd";
		if(num % 2 == 0) {
			System.out.println(num + " is a even number. ");
		}else {
			System.out.println(num + " is a " + result + " number. ");
		}

	}

}
