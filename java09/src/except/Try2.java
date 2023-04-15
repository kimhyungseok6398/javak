package except;

import java.util.Scanner;

public class Try2 {
	public static void main(String[] args) {
		//#1
		//try-catch를 사용해서 나누기를 헤보세요
		//숫자 2개를 나누기 하되
		//0이 들어올구 있으니까 try로 예외처리
		int x = 10;
		int y = 0;
		
		//#2
		
//		Scanner sc = new Scanner(System.in);	
		while(true) {
			int a = 0;
			
			try {
				a = sc.nextInt();
				System.out.println(a);
				
			}catch(Exception e) {
				System.out.println("예외");
			
				//형변환 String ->int
				int c = 0;
				String str = "123";
				try {
					c = Integer.parseInt(str);
					System.out.println();
				}
		
					
				
			
			
			}
	
		}
	}
}
	
