package day24.thread;

public class ThreadEx3 {

	public static void main(String[] args) {
		Thread thread = new Thread(()->{
			for(int i = 0; i<10; i++) {
				System.out.println("-");
			}
		});
		//thread.run(); //��Ƽ �����尡 �ƴ� �̱� ������. main������ ������ run()�� ����
		thread.start();	//���ο� �����带 �����, ������� �����忡 run()�� ����
		for(int i = 0; i<10; i++) {
			System.out.println("+");
		}

	}

}