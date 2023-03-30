package review;

public class for3 {
	public static void main(String[] args) {
		//for(초기값 조건식;누적연산){반복대상코드}
		
		//증감량을 2로 할수 있음 
		for(int i=0;i<20;i+=2) {
			System.out.println(i +"");
			
		System.out.println();
		//for문의 초기값을 바깥에서 만들 수 있다 (while처럼)
		int j = 0;
		//변수르  for바깥에서 만들면 for문이 종료 되도 변수는 유지가 됨 
		//for문 안에서 초기값(변수)만들면 for문이 종료되면 변수도 없어짐 
		for(j=1;j<=10;j++) {
			System.out.println(j+"");
			System.out.println("for문끝:");
		//for문 ()의 초기값 ; 조건식; 증감량은 비워둘수 있음
			//포문의 무한 반복
			for(;;) {
				System.out.println("무한반복");
				break;
			}
		
		}
		
		}
	}

}
