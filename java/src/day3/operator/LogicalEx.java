package day3.operator;

public class LogicalEx {

	public static void main(String[] args) {
		int score = 95;
		//������(score) 80�� �̻��̰�, ������ 90�� �̸��ΰ�?
		//score�� 80���� ũ�ų� ���� score�� 90���� �۴�
		//score�� 80���� ũ�ų� ���� && score�� 90���� �۴�
		//score >= 80 && score < 90
		System.out.println("Is " + score + " a B? " + (score >= 80 && score < 90)); //���� �ٲ㰡�鼭 run�غ��� ex) 75,80,95
		int age = 21;
		//20�� �̻��̸� ����
		boolean isAdult = age >= 20;
		//age���� �̼������ΰ�? =>�����̾ƴ�
		System.out.println("Is " + age + " your old a minor? " + !isAdult); //!isAdult : ������ �ƴ�
		
		//�ֹε������ �ְ�, ������������ ���� ���� ���� �� �� ����?
		boolean hasIdCard = true;
		boolean hasDriverCard = false;
		//���ͺ� �� ������? (�ֹε������ �ְų� ������������ ������ �� �� ����)
		System.out.println("Can I take TOEIC? " + (hasIdCard || hasDriverCard)); // ||:\\�� shift�� ���� ����

	}

}
