package day11.Array;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		/* �л����� ���� ������ �����ϱ� ���� �迭�� �����ϼ���.
		 * �л����� �� 3��.*/
		//�ڷ��� [] �迭�� = new �ڷ���[����];
		double [] studentKoreaScore = new double[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<3; i++) {
			System.out.print("input : ");
			//�迭��[����] : ����ó�� ���
			studentKoreaScore[i] = sc.nextDouble();
		}
		
		for(int i = 0; i< 3; i++) {
			System.out.println(studentKoreaScore[i]);
		}
		/* �л� 3���� ���� ���� ����� ���ϰ� ����ϴ� �ڵ带 
		 * �ۼ��ϼ���. */
		double sum = 0.0;
		for(int i = 0; i<3; i++) {
			sum += studentKoreaScore[i];
		}
		double average = sum / 3;
		System.out.println("average : " + average);
		sc.close();
	}

}
