package day15.polymorphism;

public class InstancePolymorphismEx {

	public static void main(String[] args) {
		/* TV 1��, ������ 2��, ���� 3�븦 ��ü�� ������ ��
		 * ������ �Ѵ� ����� �����غ�����. */
		RemoteControl remocon = new RemoteControl();
		/*
		TV tv = new TV();
		AirConditioner aircon1 = new AirConditioner();
		AirConditioner aircon2 = new AirConditioner();
		Radio radio1 = new Radio();
		Radio radio2 = new Radio();
		Radio radio3 = new Radio();
		
		remocon.turnOn(tv);
		remocon.turnOn(aircon1);
		remocon.turnOn(aircon2);
		remocon.turnOn(radio1);
		remocon.turnOn(radio2);
		remocon.turnOn(radio3);
		*/
		/*
		TV tv = new TV();
		AirConditioner aircons[] = new AirConditioner[2];
		Radio radios [] = new Radio[3];
				
		for(int i = 0; i<aircons.length; i++) {
			aircons[i] = new AirConditioner();
		}
		for(int i = 0; i<radios.length; i++) {
			radios[i] = new Radio();
		}
		remocon.turnOn(tv);//�Ű������� ������
		for(AirConditioner aircon : aircons) {
			remocon.turnOn(aircon);//�Ű������� ������
		}
		for(Radio radio : radios) {
			remocon.turnOn(radio);//�Ű������� ������
		}*/
		//���� ������ ����, ��ü ������ ����
		int tvCount = 1, airconCount = 2, radioCount = 3;
		int total = tvCount + airconCount + radioCount;
		HomeAppliances homeAppliances[] = new HomeAppliances[total];
		int count = 0;//���� ������� ��ǰ ���
		//tv 1�� ����
		for(int i = 0; i < tvCount; i++ ) {
			homeAppliances[count++] = new TV();//��ĳ����
		}
		//������ 2�� ����
		for(int i = 0; i < airconCount; i++ ) {
			homeAppliances[count++] = new AirConditioner();//��ĳ����
		}
		//���� 3�� ����
		for(int i = 0; i < radioCount; i++ ) {
			homeAppliances[count++] = new Radio();//��ĳ����
		}
		//��� ��ǰ�� ������ ��
		for(HomeAppliances homeAppliance : homeAppliances) {
			remocon.turnOn(homeAppliance);
		}
		System.out.println("==============");
		//��� ������ ������ ��
		for(HomeAppliances homeAppliance : homeAppliances) {
			//������ �ٿ�ĳ������ ������ ��ü�� �� => ������ ��
			if(homeAppliance instanceof Radio) {
				remocon.turnOff(homeAppliance);//�ٿ� ĳ������ �ƴ�
				Radio radio = (Radio)homeAppliance;//�ٿ� ĳ����
				System.out.println(radio.frequency);
			}
		}
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
class RemoteControl{
	public void turnOn(HomeAppliances appliance) {
		appliance.turnOn();
		System.out.println("������ �������ϴ�.");
	}
	public void turnOff(HomeAppliances appliance) {
		appliance.turnOff();
		System.out.println("������ �������ϴ�.");
	}
}

class TV extends HomeAppliances{
	int channel;
}

class AirConditioner extends HomeAppliances{
	double CurrentTemperature;
	double desiredTemperature;
}
class Radio extends HomeAppliances{
	double frequency;
}
