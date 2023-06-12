package day9.classex;

public class Car {
	//��� ����(�ʵ�)
	private String name;	//���� 
	private String company;	//������
	private int year;		//����
	private int speed;	//�ӷ�
	private char gear;	//P:����, R:����, D:����, N:�߸�
	private boolean power;	//����
	
	//������
	public Car(String _name, String _company, int _year) {
		name = _name;
		company = _company;
		year = _year;
		gear = 'p';
	}
	
	//�޼���
	/**�ڵ��� ������ ����ϴ� �޼���
	 * �Ű����� : ����
	 * ����Ÿ�� : ���� => void
	 * �޼���� : printInfo
	 * 
	 */
	public void printInfo() {
		System.out.println("VIEW");
		System.out.println("COMPANY : " + company);
		System.out.println("MODEL   : " + name);
		System.out.println("YEAR    : " + year);
		System.out.println("POWER   : " + (power? "on":"off"));
		System.out.println("GEAR    : " + gear);
		System.out.println("SEPPD   : " + speed);
	}
	/**�ӷ��� 1 ����/1�����ϴ� �޼���
	 * �Ű����� : �����Ұ��� => boolean positive
	 * ����Ÿ�� : ���� =>void
	 * �޼���� : speedChange
	 */
	public void speedChange(boolean positive) {
		//������ ���������� ����
		if(!power) {
			return;
		}
		//�� �߸� �Ǵ� �������̸� ����
		if(gear == 'N' || gear == 'p') {
			return;
		}
		//�ӷ��� �����ϴ� ����̸�
		if(positive) {
			speed += 1;
		}
		//�ӷ��� �����ϴ� ����̰� �ӷ��� 0���� ũ��
		else if(speed > 0) {
			speed -= 1;
		}
	}
	/**�ڵ��� �õ��� �Ѱų� ���� �޼���
	 * �Ű����� : ����
	 * ����Ÿ�� : ���� =>void
	 * �޼���� : turn
	 */
		
	public void turn() {
		if(!power) {
			power = true;
		}else if(gear == 'p') {
			power = false;
		}
	}


	public void setGear(char _gear) {
		gear = _gear;
	}
}
