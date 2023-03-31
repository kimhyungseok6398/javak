package control;

public class For_for {
	public static void main(String[] args) {
		//반복문 안에 반복을 사용
		//한번 반복할때마다 안쪽에 있는 반복문을 수행
		
		for(int i=0;i<2;i++) {
			System.out.println("==i:"+i+"==");
			
			for(int j=0;j<3;j++) {
			//System.out.println("i="+i+",j="+j);
				System.out.println("j="+j);
			
		}
		
	}

}
} 