package day6.whileex;

public class SumEx {

	public static void main(String[] args) {
		//1���� n���� ���� ���ϴ� �ڵ带 �ۼ��ϼ���.(n�� 10)
		/* �ݺ�Ƚ�� : i�� 1���� n���� 1�� ����
		 * ��Ģ�� : sum += i
		 * �ݺ��� ���� �� : �������� sum�� ���
		 * 				sum = 0
		 * i = 1�� ��    sum1 = sum0 + 1
		 * i = 2		sum2 = sum1 + 2 
		 * i = 3		sum3 = sum2 + 3
		 * .....
		 * i = 10		sum = sum9 + 10
		 * i = n 		sum = sum + i => sum += i
		 * */
		int n = 10, sum = 0;
		int i = 1;//i�� 1����
		while(i <= n) {//i�� n����
			sum += i;
			i++;//1�� ����
		}
		System.out.println("1~" + n + " sum:" + sum);
		
	}

}
