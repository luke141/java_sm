package day19.random;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		/* min ~ max ������ ������ ���� : Math.random �̿�
		 * */
		int min = 1, max = 9;
		int r = (int)(Math.random() * (max - min + 1) + min);
		System.out.println(r);
		/* min ~ max ������ ������ ���� : Random Ŭ���� �̿�
		 * */
		Random random = new Random();//�Ź� �ٸ� ���ڰ�(����ð�)�� �̿��ϱ� ������ ������ �Ź� �޶���
		r = random.nextInt(max - min + 1) + min;
		System.out.println(r);
		r = random.nextInt(max - min + 1) + min;
		System.out.println(r);
		r = random.nextInt(max - min + 1) + min;
		System.out.println(r);
	}

}
