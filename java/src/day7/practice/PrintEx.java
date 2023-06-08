package day7.practice;

public class PrintEx {

	public static void main(String[] args) {
		//원하는 값을 출력한 후 엔터까지 입력
		System.out.println("abc");
		System.out.println('a');
		System.out.println(1);
		//print*():원한느 값을 출력
		System.out.println("abc");
		System.out.println('a');
		System.out.println(1);
		System.out.println();
		//printF() : 문자열 형태로 만들어서 출력, 서식문자를 이용
		System.out.println("String : %s\n", "abc"); // \은 엔터를 의미
		System.out.println("Inteeger : %d\n", 1);
		System.out.println("Char : %c\n", 'a');
		System.out.println("double : %.2f\n", 3.12345678978);
		
	}

}
