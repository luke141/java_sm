package day6.dowhileex;

import java.util.Scanner;

public class PrintMenuEx {

	public static void main(String[] args) {
		/* 다음과 같은 메뉴를 출력하고 프로그램 종료를 선택하기 전 까지 반복적으로 실행되는 코드를 작성하세요.
		 * Menu
		 * 1. Start
		 * 2. Save
		 * 3. Exit
		 * Select Menu :
		 * */
		int i = 2, j, count = 0;
		
		
		System.out.println("input positive number : ");
	while(i <= 100) {
		/* 내부 반복문 : i가 소수인지 확인하는 반복문
		 * 반복횟수 : j는 1부터 i까지 1씩 증가
		 * 규칙성 : j가 i의 약수이면 약수의 개수를 1증가
		 * 반복문 종류 후 : 약수의 개수가 2개이면 i를 출력
		 * */
		//i가 소수이면 i를 출력하는 코드
		j = 1;
		count = 0;
		while(j <= i) {
			if(i % j== 0) {
				count++;
			}
			j++;
		}
	
		if(count == 2) {
			System.out.println(i + " is a prime number.");
		}
		i++;

		}
	}
}
