package day3.homework;

import java.util.Scanner;

public class Ex1_conditional2 {

	public static void main(String[] args) {
		/*성별(M:남성,W:여성)를 입력받아 여성인지 확인하는 코드를 작성하세요. 조건 연산자 이용
		(package : day3.homework, file : Ex1_conditional) 
		input gender : 
		M
		Are you a woman? false
		
		input gender : 
		W
		Are you a woman? true
		* */
		String gender; //필요한 변수 설정, ''=>빈문자는 불가능 but ""=>빈 문자열은 가능 char=>문자, String=>문자열
		Scanner sc = new Scanner(System.in);
		System.out.println("input gender : ");
		gender = sc.next();
		boolean result = gender.equals("W") ? true : false;
		System.out.println("Are you a women? " + result);
		sc.close();//꼭 필요한건 아님
		
		
	}

}
