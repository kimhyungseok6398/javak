package review;

public class Review {
	public static void main(String[] args) {
		
		//수 형태 비밀번호 맞추기
		
		
		
		
		//3. 시험점수는  국어 영어 수학이 각각 40점 이상이고 총점수가 
		//150점이상이면 합격 각과목이 40점 이상이나 총점이,미달이면 총첨 미달  
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
