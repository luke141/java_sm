package day17.interfaceex;

import day15.practice.shop.controller.ShopManager;

public class InterFaceEx {

	public static void main(String[] args) {
		/* �������̽��� �̿��Ͽ� ��ü�� ������ �� ����. */
		//RunInterface run = new RunInterface();
		System.out.println(RunInterface.NUM);
		//���� Ŭ������ ��ü�� ������ �� �ִ�.
		Run run = new Run();
		run.run();
		run.load();
		//����Ŭ������ ������ ��ü�� RunInterface�� ����
		RunInterface runInterface = new Run();
		runInterface.run();
		//RunInterface���� load�� �߻�޼���� �������� �ʱ� ������ ������ �߻�
		//runInterface.load();
		//�Ʒ� �ڵ�� RunŬ������ ��ü�� Ŭ������ȯ�� �Ʊ� ������ load()�޼��带 ȣ���� �� ����
		((Run)runInterface).load();
		run(new ShopManager());//�ܾ���, �ǸŰ���
		//run(new VocabularyNoteController());
	}
	/* �������̽� �Ű����� ������
	 * - �Ű������� �������̽��� ��ä�� �����ϸ�,
	 * ȣ���� �� �Ű������� ���� Ŭ�������� ��ü���� �� �� ����
	 * => �پ��� Ŭ�������� ��ü�� �� �� �ִ�.
	 * - RunInterface�� ��ü�� �Ű������� �ϸ�, RunInterface�� ������
	 * ���� Ŭ������ ShopManager, VocabuluaryNoteController�� ��ü��
	 * �ͼ� ���α׷��� ������ �� �ִ�.
	 *  */
	public static void run(RunInterface program) {
		//���α׷� ����
		program.run();
	}
}


interface Stop{
	void stop();
}

//���� Ŭ���� : �������̽��� ������ Ŭ����
//���� Ŭ������ �������̽��� ��� �߻� �޼��带 �ݵ�� �������̵��ؾ���.
//���� Ŭ������ ���� �������̽��� ������ �� �ִ�.
class Run implements RunInterface, Stop{
	
	public void load() {
		System.out.println("loading...");
	}
	
	@Override
	public void run() {
		System.out.println("Program start!");
		stop();
	}
	
	@Override
	public void stop() {
		System.out.println("Program Stop!");
	}
}