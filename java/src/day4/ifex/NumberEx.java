package day4.ifex;

public class NumberEx {

	public static void main(String[] args) {
		/* ���� num�� ����̸� positive number��� ����ϰ�
		 * num�� �����̸� nagative number�� ����ϰ�
		 * num�� 0�̸� 0���� ����ϴ� �ڵ带 �ۼ��ϼ���
		 * */
		int num = 8; //int num = �� ������ ���� �־��� ��� ����� �ٸ�, �Է¹޾Ƽ� ����ϴ� �Ͱ� ȥ�� ����!
		//���� num�� ����̸� positive number��� ����ϰ�
		if(num > 0) {
			System.out.println(num + " is a positive number.");
		}
		//���� num�� �����̷��� ����� �ƴϾ�� �ϱ� ������ ����� �ƴ� �� �߿��� ������ �Ǻ�
		else if(num < 0) {
			System.out.println(num + " is a nagative number");
		}
		//0�� ������ �ƴϰ� ����� �ƴ�
		else {
			System.out.println(0);
		}
		
		

	}

}
