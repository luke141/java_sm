package day4.ifex;

public class EvenNumberEx2 {

	public static void main(String[] args) {
		//홀짝 판별 예제를 조건 연산자를 이용하여 작성
		
		int num = 98;
		String result = num % 2 == 0 ? "even" : "odd";
		if(num % 2 == 0) {
			System.out.println(num + " is a even number. ");
		}else {
			System.out.println(num + " is a " + result + " number. ");
		}

	}

}
