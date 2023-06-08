package day7.practice;

public class StarsEx3 {

	public static void main(String[] args) {
		/* *	    i=1 공백 =4 *=1
		 * **	    i=2 공백 =3 *=2
		 * ***	    i=3 공백 =2 *=3
		 * ****	    i=4 공백 =1 *=4
		 * *****	i=5 공백 =0 *=5
		 * 				공백=5-i*=1
		 * */
		/* 외부 반복문
		 * 반복횟수 : i는 1부터 5까지 1씩 증가
		 * 규칙성 : * 5개를 출력후 엔터
		 * */
		for(int i = 1 ; i <= 5 ; i++) {
			//* 공백을 출력
			/* 내부 반복문
			 * 반복횟수 : j는 1부터 5까지 1씩 증가
			 * 규칙성 : *을 출력
			 * */
			
			
			for(int j = 1; j <= i ; j++) {
				System.out.print(' ');
			}
			
			System.out.println('*');//엔터
	}

}
}