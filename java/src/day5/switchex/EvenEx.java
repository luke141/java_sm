package day5.switchex;

public class EvenEx {

	public static void main(String[] args) {
		// Ȧ¦ ������ switch������ 
				int num = 5;
				//num�� 2�� ���� ���������� Ȱ��
				switch(num % 2) {
				case 0:
					System.out.println(num + " is a even number.");
					break;
				default:
					System.out.println(num + " is a odd number.");

	}

}
}