package day3.operator;

public class SCEEX {

	public static void main(String[] args) {
		String str = "abc";
		//str�� null�̱� ������ shr.xx���� �Ǿ� �ִ� ��� ������ ������ �߻�
		//�׷��� && ������ �տ��� nullüũ�ϴ� �ڵ尡 ���� �ֱ� ������ null�� ��쿡
		//�� �κ��� ������ �Ǽ� �޺κ��� ������ �Ǵ� �ڵ带 �������� �ʾƼ� ������ �Ѿ(SCE)
		System.out.println("Is " + str + " equal to abc? " + (str != null && str.equals("abc"))); //������ ���� �ٲ�
		//�Ʒ� �ڵ�� �� �ڵ忡�� ������ ������ �ڵ��, ������ �Ǵ� �ڵ带 ���� �����ϱ� ������ ����(����)�� �߻�
		
		System.out.println("Is " + str + " equal to abc? " + (str.equals("abc") && str != null));

	}

}
