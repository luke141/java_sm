package day14.switchex;

public class SwitchEx {

	public static void main(String[] args) {
		/* switch������ case�� ������ �����ϸ� �ٸ� case���� �����Ҽ�
		 * ���ٴ°� �����ִ� ����
		 * case���� break�� �������� �ʼ��� �ƴ�
		 * => break�� ���� ��� ���� case�� ���๮���� �̵�
		 * */
		int menu = 2;
		
		switch(menu) {
		case 1:
			String title = "����1";
			System.out.println(title);
			//break;//
		case 2:
			String title2 = "����2";//title�� case 1�� �־ ������ �ȵ�
			//case 2���� title�� ���� ���� �߻�
			//=> title�� ���� ���ؼ��� case 1�� �ݵ�� ������ �ϴµ�,
			//   menu�� 2�̾ case2�� �ٷ� ����� ���� case 1�� �ǳʶٰ�
			//	 ���� ������ title�� ������� �ʾƼ� ���� �߻�
			//System.out.println(title);
			System.out.println(title2);
			break;
		case 3:
			break;
		}
		

	}

}