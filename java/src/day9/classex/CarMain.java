package day9.classex;

public class CarMain {

	public static void main(String[] args) {
		/*  ���� �� �ƹݶ� 2023��� �ڵ��� ��ü�� �����ϴ� �ڵ带 �ۼ��ϼ���.
		 * */
		
		//Ŭ������ ��ü�� = new Ŭ������(�Ű�������);
		Car myCar = new Car("The new AVANTE","Hyundai",2023);
		//���� �� �� ������ ��ȸ
		myCar.turn();
		myCar.setGear('D');
		myCar.printInfo();
		myCar.speedChange(false);
		myCar.speedChange(false);
		myCar.speedChange(false);
		myCar.printInfo();
		myCar.speedChange(true);
		myCar.speedChange(true);
		myCar.speedChange(true);
		myCar.printInfo();
		myCar.speedChange(false);
		myCar.printInfo();
	}

}
