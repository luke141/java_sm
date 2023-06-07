package day6.practicee;

import java.util.Scanner;

public class UpDownEx {

	public static void main(String[] args) {
		/* UpDown 게임을 하는 코드를 작성하세요. 
		한판이 끝나면 더할건지를 물어서 n을 입력하면 종료, y를 입력하면 이어서 게임이 진행.
		 * */
		int min = 1, max = 100
		char mueu
		int num;
		Scanner sc = new Scanner(System.in);
		/* 외부 반복문 : 게임으 ㄹ더 진행할걸진 결정하는 반복문
		 * 반복횟수 : 입력받은 문자가 n이 아니면 바놉ㄱ
		 * 규칙성 : up down 게임 한 판 진행
		 * */
		do {
			/* 내부 반복문 : Up Down 게임 진행하는 반복문
			 * 반복 횟수 : 입력받은 숫자가 랜덤한 숫자아ㅗ 일치하지 않으면 반복
			 * 규칙성 : 입력받은 숫자가 정답보다 크면 Down!, 적으면 Up! 맞으면 Good!을 출력
			 * */
			
			//menu를 선택(더할건지 말건지)
			System.out.println("continue?(y/n) : ");
			menu = sc.next().charAt(0);
		}while(menu != 'n');
		
		sc.close();

	}

}
