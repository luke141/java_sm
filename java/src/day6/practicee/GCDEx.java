package day6.practicee;

import java.util.Scanner;

public class GCDEx {

	public static void main(String[] args) {
		/*두 정수 num1과 num2를 입력받아 두 정수의 최대 공약수를 구하는 코드를 작성하세요.
		(package : day6.practice, file : GCDEx)
		약수 : 나누어 떨어지는 수
		공약수 : 공통으로 있는 약수
		최대 공약수 : 공약수 중 가장 큰 수
		8과 12의 공약수 : 1, 2, 4
		8과 12의 최대 공약수 : 4
		* */
		int num1, num2, i = 1, gcd = 1;
		Scanner sc = new Scanner(System.in);
		//두 정수를 입력
		System.out.println("input 2 numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		//
		//반복문(최대공약수를 구하기 위한) : i가 num1까지
		while(i <= num1) {
		if(num1 % i == 0 && num2 % i == 0) {
		gcd = i;
		}
		//i를 1증가
		i++;
	}
		System.out.println(num1 + "and" + num2 + "gcd : " + gcd);

}
}