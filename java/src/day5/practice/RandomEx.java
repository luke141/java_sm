package day5.practice;

public class RandomEx {

	public static void main(String[] args) {
		//min���� max������ ������ ������ ����� �ڵ带 �ۼ��ϼ���.
				//Math.random() : 0�̻� 1�̸��� �Ǽ��� �������� ����
				/* 0 <= r < 1
				 * 0 * (max-min+1) <= r * (max-min+1) < 1 * (max-min+1)
				 * 0 <= r * (max-min+1) < max - min + 1
				 * 0 + min <= r * (max-min+1) + min < max - min + 1 + min
				 * min <= r * (max-min+1) + min < max + 1
				 */
				int min = 1, max = 10;
				int random = (int)(Math.random() * (max - min + 1) + min);
				System.out.println(random);

	}

}
