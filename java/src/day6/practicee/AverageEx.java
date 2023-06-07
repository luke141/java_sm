package day6.practicee;

import java.util.Scanner;

public class AverageEx {

	public static void main(String[] args) {
		/* 국어, 영어, 수학 성적을 입력받아 평균을 구하는 코드를 작성하세요.
		 * n을 입력하기 전까지.
		 * */
		int = kor, eng, math;
		char menu = 'y';
		
		Scanner sc = new Scanner(System.in);
		
		//반복문 : menu가 n이 아니면 반복(y, n이 아닌 다른 문자를 입력하면 반복)
		//menu가 y이면 반복(y,n이 아닌 다른 문자를 입력함녀 종료)
		while(menu != 'n') {
			System.out.println("input score(kor, eng, math) : ");
			kor = sc.nextInt();
			eng = sc.nextINt();
			math = sc.nextInt();
			avg = (kor + eng + math) / 3.0;
			System.out.println("average");
		}
		
		
			//국어, 영어, 수학 점수 입력
			//평균을 계산
			//평균을 출력
		
			//더할건지 물어본 후, 입력
		//EXIT를 출력!
		int stu

	}

}
