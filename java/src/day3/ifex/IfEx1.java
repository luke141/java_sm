package day3.ifex;

public class IfEx1 {

	public static void main(String[] args) {
		//���� num�� 0�̸� 0�Դϴٶ�� ����ϴ� �ڵ带 �ۼ��ϼ���. ~�� �տ�:���� / ~�� �ڿ�:����
		//���� num�� 0�̴�
		//���� num�� 0�� ����
		int num = 10;
		if(num == 0) {
			//0�Դϴٶ�� ���;
			System.out.println("0�Դϴ�.");//���ǹ��� ���� ���� �۵�!
		}
		//���� num�� 0�� �ƴϸ� num is not 0��� ����ϴ� �ڵ带 �ۼ��ϼ���.
		//num�� 0�� �ƴϴ�
		//num�� 0�� ���� �ʴ�
		if(num != 0) {
			System.out.println(num + " is not 0");
		}
	}

}
