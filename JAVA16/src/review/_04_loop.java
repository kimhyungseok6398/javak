package review;

public class _04_loop {
	public static void main(String[] args) {
		//반복문 코드의 반복명시 또는 대량의 반복코드를 작성할때 사용
		//while for do~while
		int 초기값 = 0;
		while(초기값 < 4) {
			System.out.println("반복할 문장 "+초기값+"번째");
			초기값++;
		if(초기값==2) {
			break;
		}
		
		}
		for(int i = 0;i<4;i++) {
			
			if(i==2) {
				continue;		//밑에 문장 무시하고 위로 올라감(1회성 취소)
			}
	System.out.println("반복할 문장 "+초기값+"번째");
		}

}
}