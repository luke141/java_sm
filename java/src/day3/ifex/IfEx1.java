package day3.ifex;

public class IfEx1 {

	public static void main(String[] args) {
		//정수 num가 0이면 0입니다라고 출력하는 코드를 작성하세요. ~면 앞에:조건 / ~면 뒤에:실행
		//정수 num가 0이다
		//정수 num가 0과 같다
		int num = 10;
		if(num == 0) {
			//0입니다라고 출력;
			System.out.println("0입니다.");//조건문은 참일 때만 작동!
		}
		//정수 num가 0이 아니면 num is not 0라고 출력하는 코드를 작성하세요.
		//num가 0이 아니다
		//num가 0과 같지 않다
		if(num != 0) {
			System.out.println(num + " is not 0");
		}
	}

}
