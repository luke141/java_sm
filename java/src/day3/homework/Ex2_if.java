package day3.homework;

import java.util.Scanner;

public class Ex2_if {

	public static void main(String[] args) {
		/*성별(M:남성,W:여성)를 입력받아 M이면 남성을, W이면 여성을 출력하는 코드를 작성하세요. if문 이용
		(package : day3.homework, file : Ex1_ifjava) 
		input gender : 
		M
		Are you a woman? man
		input gender : 
		W
		Are you a woman? women
		* */
		char gender;
		Scanner sc = new Scanner(System.in);
		System.out.println("input gender : ");
		gender = sc.next().charAt(0);
		if(gender == 'M') {
			System.out.println("Are you a woman?" + "man");
		}
		if(gender == 'w') {
			System.out.println("Are you a woman?" + "woman");
		}
		sc.close();
	}

}
