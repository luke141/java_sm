package day4.practice;

import java.util.Scanner;

public class IfMultipleEX1 {

	public static void main(String[] args) {
		//정수 num가 2의 배수(홀짝판별)인지 아닌지 판별하는 코드를 작성하세요.
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("input number : ");
		num = sc.nextInt();
		
		if(num % 2 ==0) {
			System.out.println("A multiple of 2");
		}else {
			System.out.println("Not multiple of 2");
		}
		
		

	}

}
