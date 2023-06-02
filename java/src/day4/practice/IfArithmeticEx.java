package day4.practice;

import java.util.Scanner;

public class IfArithmeticEx {

	public static void main(String[] args) {
		/* 산술 연산자와 두 정수를 입력받아 산술연산자에 맞는 연산 결과를 출력하는 코드를 작성하세요.
		 * 산술연산자 : operator(op), 두 정수 : num1, num2
		 * op가 +이면 num1 + num2를 출력하고
		 * op가 -이면 num1 - num2를 출력하고
		 * op가 *이면 num1 * num2를 출력하고
		 * op가 /이면 num1 / num2를 출력하고
		 * op가 %이면 num1 % num2를 출력하고
		 * op가 산술연산자가 아니면 op is not arithmetic operator!를 출력
		 * */
		
		int num1, num2;
		char operator;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input 2 nums and arithemic operator(ex : 1 + 2) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		operator = sc.next().charAt(0);
		
		if(operator == '+') {
			System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 + num2));
		}
		else if(operator == '-') {
			System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 - num2));
		}
		else if(operator == '*') {
			System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 * num2));
		}
		else if(operator == '/') {
			System.out.println(num1 + " " + operator + " " + num2 + " = " + ((double)num1 / num2));
		}
		else if(operator == '%') {
			System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 % num2));
		}
		else {
			System.out.println("op is not arithmetic operator! ");
		}
		sc.close();
	}

}
