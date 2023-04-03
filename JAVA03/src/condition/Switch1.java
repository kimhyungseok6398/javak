package condition;

import java.util.Scanner;

public class Switch1 {
	public static void main(String[] args) {
		
		//제어문 : if switch while for break continue
		//조건문 if switch
		//if가 기본조건믄 switch 는 같은경우만 비교 
		//왠만하면 안씀
		int num =0;
		if(num == 0) {
			System.out.println("num은 0이다");
		}else if (num==1) {
			System.out.println("num은 1이다");
		}else if(num==2 ) {
			System.out.println("num은 2이다");
		}else {
			System.out.println("그밖에");
		}
			
			System.out.println();
		//이렇게 같은것을 찾는 조건문은 스위치로 변경할수 있다
		
			
			
	
		// 스위치문
		int choice=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("번호를 입력하세요>>");
		choice = sc.nextInt();
		switch (choice) {
			
		case 1 : 
			System.out.println("안녕하세요");
			break;
		case 2 :
			System.out.println("반갑습니다");
			break;
		case 3 :
			System.out.println("잘있어요");
			default :
				System.out.println("잘못입력하셨습니다");
			}
}		
			
	}
	
		
	
		 
		
	
