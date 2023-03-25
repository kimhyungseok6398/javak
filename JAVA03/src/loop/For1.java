package loop;

public class For1 {
	public static void main(String[] args) {
		// 반복문 : while, for
		//for : while이 너무 가독성이 떨어져서 
		
		//0~9까지 출력 while 
		int i =0;
		while(i<10) {
			// 반복할 코드 
			System.out.println("while "+i);
			i++;
		}
		
	//while 단점 : 바깥에 플래그를 만들어줘야함, {}안에서 플래그를 증감, 결론으로 가독성 떨어짐 
		
		//0~9까지 출력 for
		//for문 플래그 관련 코드느 ()에 몰어버리자 반복할 코드만 {}남기자
		for(int j =0; j < 10; j++){
			System.out.println("for");
			
		}
			
		}
			
		}
	
		
		


