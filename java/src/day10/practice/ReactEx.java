package day10.practice;

public class ReactEx {

	public static void main(String[] args) {
		//�׸����� �簢���� �׸��� ���� Ŭ������ �����ϰ� �׽�Ʈ �ϴ� �ڵ带 �ۼ��ϼ���.
		Rect1 r = new Rect1(0,0,10,10);
		r.print();
		r.move(10, 10);
		r.print();
		r.resize(10, 10, 20, 20);
		r.print();
		r.resize(0, 0, 30, 30);
		r.print();
		
		System.out.println("R2 start!");
		
		Rect2 r2 = new Rect2(new Point(0,0), new Point(10,10));
		r2.print();
		r2.move(10, 10);
		r2.print();
		r2.resize(10, 10, 20, 20);
		r2.print();
		r2.resize(0, 0, 30, 30);
		r2.print();

	}

}

class Rect1{
	//�������
	/* ���� ������ x��ǥ, ���� ������ y��ǥ, 
	 * ������ �Ʒ��� �� x��ǥ, ������ �Ʒ� �� y��ǥ
	 * */
	private int leftUpX, leftUpY;
	private int rightDownX, rightDownY;
	
	//������
	public Rect1(int leftUpX, int leftUpY, int rightDownX, int rightDownY) {
		this.leftUpX = leftUpX;
		this.leftUpY = leftUpY;
		this.rightDownX = rightDownX;
		this.rightDownY = rightDownY;
	}
	
	//getter, setter
	//����. ���⼭�� �ʿ����
	
	//�޼���
	/**�簢�� ������ ����ϴ� �޼���
	 * �Ű����� : ���� 
	 * ����Ÿ�� : ���� => void
	 * �޼���� : print
	 */
	public void print() {
		System.out.println("===============");
		System.out.println("LU point : " + leftUpX + ", " + leftUpY);
		System.out.println("RD point : " + rightDownX + ", " + rightDownY);
	}
	/**�簢���� �̵���Ű�� �޼���
	 * �Ű����� : �̵���ų ���� ���� �� => int x, int y
	 * ����Ÿ�� : ���� => void
	 * �޼���� : move
	 * 0,0			=>	10,10
	 * 		10,10				20,20
	 */
	public void move(int x, int y) {
		int dx = leftUpX - x;//�̵��� x��ǥ �Ÿ�, -10
		int dy = leftUpY - y;//�̵��� y��ǥ �Ÿ�, -10
		leftUpX = x;
		leftUpY = y;
		rightDownX = rightDownX - dx;//10 - -10 => 20
		rightDownY = rightDownY - dy;
	}
	/**�簢���� ũ�⸦ �����ϴ� �޼���
	 * �Ű����� : ����� �簢���� ���� ���� x,y��ǥ��
	 * 			����, ���ΰ� �־����� �簢���� ũ�⸦ �����ϴ� �޼���
	 * 			=> int x, int y, int w, int h
	 * ����Ÿ�� : ���� => void
	 * �޼���� : resize
	 */
	public void resize(int x, int y, int w, int h) {
		leftUpX = x;
		leftUpY = y;
		rightDownX = x + w;
		rightDownY = x + h;
	}
}

class Rect2{
	//�������
	private Point leftUp, rightDown;

	//������
	public Rect2(Point leftUp, Point rightDown) {
		this.leftUp = leftUp;
		this.rightDown = rightDown;
	}

	public Rect2(int leftUpX, int leftUpY, int rightDownX, int rightDownY) {
		leftUp = new Point(leftUpX, leftUpY);
		rightDown = new Point(rightDownX, rightDownY);
	}
	
	//�޼���
	/**�簢�� ������ ����ϴ� �޼���
	 * �Ű����� : ���� 
	 * ����Ÿ�� : ���� => void
	 * �޼���� : print
	 */
	public void print() {
		System.out.println("===============");
		System.out.print("LU point : " );
		leftUp.print();
		System.out.print("RD point : " );
		rightDown.print();
	}
	/**�簢���� �̵���Ű�� �޼���
	 * �Ű����� : �̵���ų ���� ���� �� => int x, int y
	 * ����Ÿ�� : ���� => void
	 * �޼���� : move
	 * 0,0			=>	10,10
	 * 		10,10				20,20
	 */
	public void move(int x, int y) {
		int dx = leftUp.getX() - x;//�̵��� x��ǥ �Ÿ�, -10
		int dy = leftUp.getY() - y;//�̵��� y��ǥ �Ÿ�, -10
		leftUp.move(x, y);
		rightDown.move(rightDown.getX() - dx, rightDown.getY() - dy);
	}
	/**�簢���� ũ�⸦ �����ϴ� �޼���
	 * �Ű����� : ����� �簢���� ���� ���� x,y��ǥ��
	 * 			����, ���ΰ� �־����� �簢���� ũ�⸦ �����ϴ� �޼���
	 * 			=> int x, int y, int w, int h
	 * ����Ÿ�� : ���� => void
	 * �޼���� : resize
	 */
	public void resize(int x, int y, int w, int h) {
		leftUp.move(x, y);
		rightDown.move(x+w, y+h);
	}
}
