package day17.interfaceex;

public interface RunInterface{
	/*public final=>상수를 의미(값을 처음부터 넣어줘야함) static*/
	int NUM = 10;//굵음=final 기울어짐=static, 클래스 상수 => 클래스를 이용하여 호출
	/*public abstract*/ void run(); //==>추상 메서드
	default void stop() {
		System.out.println("program stop");
	}
}
