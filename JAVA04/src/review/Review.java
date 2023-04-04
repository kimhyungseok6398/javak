package review;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.1~10 중 짝수만 출력
		//for(초기값;조건식 증감량 )(반복할 코드;}
		for(int i=1;i<=10;++i) {
			if(i % 2  ==0) {
			System.out.println(i);
		}
		} 
		//2.정수형태 비번 맞투기 (기회는 5번 ,맞투면 맞췄다!, 기회를 모두 사용하면 점속불가.
		int pwd =1234;
		int user_input = 0;
		
		for(int i=0;i<5;++i) {
		System.out.print("비밀번호를 입력하세요>>");
		user_input = sc.nextInt();
		if(user_input == pwd) {
			System.out.println("맞았습니다!");
			break;
 }
		if(i==4) {
			System.out.println("접속불가");
		}
		}

		//3. 시험점수는  국어 영어 수학이 각각 40점 이상이고 총점수가 
		//150점이상이면 합격 각과목이 40점 이상이나 총점이,미달이면 총첨 미달 : 
		//39,40.40 ==> 과락 
		//40,40/40,==> 총점 미달 
		//40,40,100==> 합격 
	    int 국어 = 39;
	    int 영어 = 40;
	    int 수학 = 40;
	    int 총점수 = 0;
	     총점수 = 국어 + 영어 + 수학;
	      if(국어>=40 && 영어 >=40 && 수학>=40) {
	    	  
	      
		      //과락 x
		      if(총점수 >= 150) {
		    	  System.out.println("합격");
		      }else {
		    	  System.out.println("총점미달");
		      }
		      } else {
		    	  System.out.println("과락");
		      }
	    		  
		//4.1~10까지 합 구하기 // 55
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
			//System.out.println(i);
		}
		System.out.println(sum);
		
		//5. 10~1 까지 구하기 
		for(int i=10;i>=1;i--) {
			System.out.println(i+"");
			
			
		}
	}
	
	
	
	
	
	
	

}
