package operator;

public class Oper6 {
	public static void main(String[] args) {
		//관계 연산자
		//&&,
		//트루또는 펄스애 영향
		//&& : and(그리고 앞과 위가 모두 트루아여만 트루
		
		System.out.println(2>1&&2==2);
		//키는 130 이상 나이는 13이여야한다
		
		int 키 = 120;
		int 나이 = 14;
		boolean 참거짓 = 키 >= 130&& 나이 >=13;
		System.out.println(참거짓);
		//&는 앞과 뒤가 모두 맞아야함
		//130이거나 나이가 13이상이여야 한다
		참거짓 = 키>= 130 || 나이 >= 13;
				
		
		
		
	}

}
