package review;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		//if문
		//if~else if else 
		//조건이 맞으면 실행 조건이 틀리면 무시
		//if(){} () 조건식을 {}에는 코드를 입력
		
		// 예제 버스카드(20세이상이면 성인입니다 1000원
		//14~19세면 청소년입니다 650
		//13세 이하면 400원)
		
		int age = 19;
		int money = 0;
		if(age>19) {
			//나이가 19보다 크면 실행할 코드
			System.out.println("성인입니다");
			money = 1000;
		}else if(age>13) {
			//나이가 19보다는 크지않고 13보다 크면 실행할 코드
			System.out.println("청소년입니다");
			money = 650;
		}else {
			//나이가 19보다 크지않고 13보다 크지않으면 
			System.out.println("어린이입니다");
			money = 400;
			System.out.println(money+'원');
			
			int year =0;
			Scanner sc = new Scanner(System.in);
			//사용장입력을 위해 먼저 해야할 작업
		    System.out.println("년도를 입력하세요>>");
		    year = sc.nextInt();//사용자에게 int값을 입력받고 year 에 담기
		    if((year % 4== 0&& year %100 !=0)|| year % 400==0){
		    	System.out.println("윤년입니다.");
		    }else {
		    	System.out.println("윤년이 아닙니다");
		    	
		    }
		     
		      
			
			
		  
		}
	}

}
