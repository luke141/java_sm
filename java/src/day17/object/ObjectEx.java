package day17.object;

import java.util.Objects;

import lombok.Data;

public class ObjectEx {

	public static void main(String[] args) throws CloneNotSupportedException {
		Point1 pt1 = new Point1(10, 20);
		System.out.println(pt1);
		
		Point1 pt11 = new Point1(10,20);
		System.out.println(pt1 == pt11);
		System.out.println(pt1.equals(pt11));
		
		System.out.println("================");
		
		Point2 pt2 = new Point2(30,40);
		System.out.println(pt2);
		
		Point2 pt21 = new Point2(30,40);
		System.out.println(pt2 == pt21);
		System.out.println(pt2.equals(pt21));
		
		System.out.println("================");
		//clone()�� �̿��ؼ� ������ ����� ��
		Point2 pt22 = (Point2)pt2.clone();//�ٿ�ĳ���� => (Ŭ������)�� �ݵ�� �߰�
		//�ּҰ� �ٸ�����
		System.out.println(pt2 == pt22);
		//�� ��ü�� ���ٰ� �Ǻ�
		System.out.println(pt2.equals(pt22));
		System.out.println(pt22);
	}

}
@Data 
//toString(), equals(), hashcode() �������̵�, 
//getter,setter�� �ڵ�����
class Point1{
	private int x, y;
	
	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
class Point2 implements Cloneable{
	private int x, y;
	
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/*public String toString() {
		return "(" + x + "," + y + ")";
	}*/

	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		//�ּҰ� ������ ���� ��ü�� ����
		if (this == obj)
			return true;
		//���� ��ü�� ���� �� ����.
		if (obj == null)
			return false;
		//�� Ŭ������ ���� ��ü�� Ŭ������ �ٸ� ��� �񱳸� ����.
		//��Ȳ�� ���� ���ϴ� �ڵ�� ���� �� ����.
		if (getClass() != obj.getClass())
			return false;
		//���� ��ü�� Ŭ������ ���� Ŭ������ ���
		Point2 other = (Point2) obj;
		//������� ���� ���ؼ� �������� Ȯ��
		return x == other.x && y == other.y;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
