package day19.exception;

public class TryCatchEx {

	public static void main(String[] args) {
		/* catch�� �ּ� 1���� �ʿ�.
		 * � ���ܰ� �߻����� �� ������ Exception�� �̿�
		 * */
		
		
		try {
			//���ܰ� �߻��� �� �ִ� �ڵ�
			System.out.println(1 / 0);//ArithmeticException�� �߻�
		}
		catch(ArithmeticException e) {
			System.out.println("���� ó���� �մϴ�.");
		}
		//ù��° catch�� ���� ArithmeticException Ŭ������ ��ü�� Exception���� ��ȯ �������� Ȯ���ϰ�
		//�����ϸ� ó��
		catch(Exception e) { 
			//����ó��
			System.out.println("����ó���� �մϴ�.");
		}
		//���� Exception���� ��� ���ܰ� �ɸ��� ������ �Ʒ� �ִ� catch�� ������ ���� ����
		/*catch(ArithmeticException e) {
			System.out.println("���� ó���� �մϴ�.");
		}*/
		System.out.println("���α׷� ����");

	}

}
