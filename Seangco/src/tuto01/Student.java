package tuto01;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		int korea_score;
		int english_score;
		int math_name;
	
		if(score>90) {
			System.out.println("a");
			
		}else if(score>80) {
			System.out.println("b");
		}else if(score>70) {
			System.out.println("c");
			
		}else
		System.out.println("f");
		
	}
	
}
