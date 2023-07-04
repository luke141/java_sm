package day21.practice;

import java.util.HashMap;
import java.util.Scanner;

public class UpDwonEx {

	public static void main(String[] args) {
		int min = 1, max = 100; 
		int num = min - 1;
		int random;
		Scanner sc = new Scanner(System.in);
		
		
		random = (int)(Math.random()*(max - min + 1) + min);
		System.out.println(random);
		
		while(random != num) {
		
		System.out.println("input(1~100) : ");
		num = sc.nextInt();
		
		
		if(num > random) {
			System.out.println("Down!");
		}else if(num < random) {
			System.out.println("Up!");
		}else {
			System.out.println("Good!");
		}

		}
		sc.close();
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < 100; i++) {
			map.put(i, i + 1);
		}
		
	}

}

