package day7.continueex;

public class EvenNumberEx {

	public static void main(String[] args) {
		//continue���� �̿��� 10���� ¦�� ��� ����
		int i;
		//Ȧ���̸� �ǳʶ� 
		for( i = 1 ; i <= 10 ; i++ ) {
			//i�� Ȧ���̸� �ǳʶ�
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
		
		i = 0; //0���� ����
		while( ++i<= 10 ) {
			if(i % 2 !=0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
