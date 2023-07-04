package day14.Polymorphism;

public class PolymorphismEx1 {

	public static void main(String[] args) {
		/* �Ű������� ������ 
		 * ���������� ���� ��ǰ�� ������ �Ѵ� ����
		 * ��ǰ : TV, ������, ����
		 * ������ Ŭ����, TV Ŭ����, ������ Ŭ����, ���� Ŭ����
		 * 
		 * */
		TV tv1 = new TV();
		Radio radio1 = new Radio();
		AirConditioner aircon1 = new AirConditioner();
		RemoteControl remocon1 = new RemoteControl();
		remocon1.turnOn(tv1);//TV�� �Ѵ� ���
		remocon1.turnOn(aircon1);//�������� �Ѵ� ���
		remocon1.turnOn(radio1);//������ �Ѵ� ���
		
		System.out.println("=============");
		//�Ű������� �������� �̿�
		TV1 tv2 = new TV1();
		Radio1 radio2 = new Radio1();
		AirConditioner1 aircon2 = new AirConditioner1();
		RemoteControl1 remocon2 = new RemoteControl1();
		
		HomeAppliances appliance = tv2;//��ĳ����
		remocon2.turnOff(appliance);
		remocon2.turnOn(tv2);//������ �Ѵ� ���
		remocon2.turnOn(aircon2);//������ �Ѵ� ���
		remocon2.turnOn(radio2);//������ �Ѵ� ���
		
		remocon2.turnOff(tv2);
		remocon2.turnOff(aircon2);
		remocon2.turnOff(radio2);
	}

}

class RemoteControl{
	public void turnOn(TV tv) {
		tv.turnOn();
		System.out.println("������ �������ϴ�.");
	}
	public void turnOn(AirConditioner aircon) {
		aircon.turnOn();
		System.out.println("������ �������ϴ�.");
	}
	public void turnOn(Radio radio) {
		radio.turnOn();
		System.out.println("������ �������ϴ�.");
	}
}

class TV{
	boolean power;
	int channel;
	void turnOn() {
		power = true;
	}
}

class AirConditioner{
	boolean power;
	double CurrentTemperature;
	double desiredTemperature;
	void turnOn() {
		power = true;
	}
}
class Radio{
	boolean power;
	double frequency;
	void turnOn() {
		power = true;
	}
}

class HomeAppliances{
	boolean power;
	void turnOn() {
		power = true;
	}
	void turnOff() {
		power = false;
	}
}
class RemoteControl1{
	public void turnOn(HomeAppliances appliance) {
		appliance.turnOn();
		System.out.println("������ �������ϴ�.");
	}
	public void turnOff(HomeAppliances appliance) {
		appliance.turnOff();
		System.out.println("������ �������ϴ�.");
	}
}

class TV1 extends HomeAppliances{
	int channel;
}

class AirConditioner1 extends HomeAppliances{
	double CurrentTemperature;
	double desiredTemperature;
}
class Radio1 extends HomeAppliances{
	double frequency;
}