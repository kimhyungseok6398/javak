package loop;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		//for문을 통해서 구현
		
		//1. 안녕 5번 
		for(int i=0;i<5;i++) {
			System.out.println("안녕");
			
		
		}
			
		//2, 1~10까지 합계{구하기 
		int 합계=0;
		for(int i=1;i<10;i++) {
			합계=합계+i;
		}
		 System.out.println(합계);
		//3. 1~ 입력값까지{ 구하기 
		//(예시: 10 =>55)
		//(예시: 50 =>1275}
		 합계=0;
		 for(int i=10;i<55;i++) {
		합계=합계+i;  }
		 System.out.println();
		  
		 
		 
		
		
	
	int sum1 = 0;
	int last_num =0;
	Scanner sc = new Scanner(System.in);
	System.out.println("몇까지 더할까요?");
	last_num = sc.nextInt();
	
	for(int i=1; i<=last_num;++i) {
		sum1 +=i;
		System.out.println("합계는 :"+sum1);
		
	}
	}
}
	
	
	
	
	
	
			

