package day17.interfaceex;

public interface RunInterface{
	/*public final=>����� �ǹ�(���� ó������ �־������) static*/
	int NUM = 10;//����=final ������=static, Ŭ���� ��� => Ŭ������ �̿��Ͽ� ȣ��
	/*public abstract*/ void run(); //==>�߻� �޼���
	default void stop() {
		System.out.println("program stop");
	}
}
