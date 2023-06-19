package day14.Inheritance;

import lombok.Data;

public class ClassnInheritanceEx {

	public static void main(String[] args) {
		/* ����Ʈ���� ���̴�. => ���
		 * 	- ����Ʈ�� : �ڽ� Ŭ����
		 *  - �� : �θ� Ŭ����
		 * ����Ʈ���� ī�޶� ������ �ִ�. => ����
		 *  - ����Ʈ�� : Ŭ����
		 *  - ī�޶� : �������
		 * �θ� Ŭ�������� ��� ���� ��ɵ��� ����� �� �ִ�.
		 *  - ���������ڰ� public, protected�� ���
		 *  - ����Ʈ�� ���� ��Ű���� ���� �����ϳ� �ٸ� ��Ű���̸� �Ұ���
		 */
		SmartPhone phone1 = new SmartPhone();
		phone1.call("010-1234-5678");
		phone1.answer("02-123-4567");
		System.out.println(phone1.getNum());
		phone1.take();
		
		//�ٿ� ĳ���� : �ȵǴ� ���
		Phone p1 = new Phone("010-123-3456");
		//���������� ������ �߻����� ������ ���ܰ� �߻� : �ٿ�ĳ������ �ȵǴ�
		//����̱� ������.
		if(p1 instanceof SmartPhone) {
			SmartPhone c1 = (SmartPhone) p1;
			c1.call("������ȣ");
		}
		//�ٿ� ĳ���� : �Ǵ� ���
		//��ĳ������ �� ��ü p2
		Phone p2 = new SmartPhone();//��ĳ����
		SmartPhone c2 = (SmartPhone)p2;
		c2.call("123-4567");
		
	}
}
@Data
class Phone{
	private String num = "010-1111-5555";//��ȭ��ȣ
	
	//��ȭ �ɱ�
	public void call(String num) {
		System.out.println(num);//���� ��ȭ�� �Ŵ� ���� ��ȣ
		System.out.println("Calling....");
	}
	//��ȭ �ޱ�
	public void answer(String num) {
		System.out.println(num);//������ ��ȭ�� �� ���� ��ȣ
		System.out.println("Answering...");
	}
	public Phone(String num) {
		this.num = num;
	}
	//public Phone(){} //�����ڰ� �ϳ��� ������ �������� �� �⺻ �����ڰ� �ڵ����� �߰�
}
class SmartPhone extends Phone{
	Camera camera = new Camera();
	public void take() {
		camera.take();
	}
	public SmartPhone() {
		//�θ� Ŭ������ �����ڰ� ȣ��
		//super()�� �̿��Ͽ� �θ� Ŭ������ �����ڸ� ����ȣ������ ������
		//�⺻ �������� super()�� �ڵ����� �߰��� �ǰ� ȣ���� ��.
		//�� ��, �θ�Ŭ������ �⺻ �����ڰ� ������ ������ �߻�
		//super();//���� �߻�
		super("");
	}
	@Override
	public void call(String num) {
		super.call(num);
		System.out.println("SmartPhone!");
	}
}

class Camera{
	public void take() {
		System.out.println("take a picture!");
	}
}