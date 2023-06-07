package day6.practicee;

public class PrimeNumberEx {

	public static void main(String[] args) {
		/* 2부터 100사이의 소수를 출력하는 코드를 작성하세요.
		 * 
		 * */
		int i = 1;
		while(i <= 5) {
			System.out.println(2*i);
			++i;
		}
		System.out.println("============");
		
		/* 방법2.
		 * 반복횟수 : i는 2부터 10까지 2씩 증가
		 * 규칙성 : i를 출력 
		 */
		i = 2;
		while(i <= 10) {
			System.out.println(i);
			i = i + 2;// i += 2;
		}
		System.out.println("============");
		
		/* 방법3.
		 * 반복횟수 : i는 1부터 10까지 1씩 증가
		 * 규칙성 : i가 짝수이면 i를 출력 
		 */
		i = 1;
		while(i <= 10) {
			//i가 짝수이면 i를 출력 
			if(i % 2 == 0) {
				System.out.println(i);
			}
			++i;
		}

}

}
