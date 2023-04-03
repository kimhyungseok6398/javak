package operator;

public class Review {
	public static void main(String[] args) {
	//변수 : 저장공간 
		//자주변경할수 있는 부분은 저장해놓고 돌려쓰기
		String 글자 = "글자를 저장";
		int 숫자 = 0; //숫자라는 공간에 0을 저장
		
		
		System.out.println(숫자);
		System.out.println("나는 "+글자+숫자);
		
		//산술 연산자
		// +,- * /%
		
		String 문자열더하기 = "글자를"+"붙히기";
		int 점수더하기 = 3+4;
		int 점수뺴기  = 3-4;
		int 점수곱하기 = 3*4;
		int 점수나누기 = 3/4;
		double 실수나누기 =3.0/(double)4;
		
		
		//비교연산자 
		//>,<,>,<=,>=,==,!=
		//결과를 트루 또느 펄스
		System.out.println(3>4);
		System.out.println(3<4);
		System.out.println(3>=4);
		System.out.println(3<=4);
		System.out.println(3==4);
		System.out.println(3!=4);
		
		//대입연산자 
		// *
		//오른쪽에 있는 값을 왼쪽에 변수에 담겠다
		글자 = "abc";   //abc를 글자라는 공간에 담겠다
		
		String 변수1;
		변수1= "이미 만들어져있는 변수에는 자료형 없이 적는다";
		String 변수2 ="새로 만드는 변수에는 자료들을 적어줘야햠";
		
		System.out.println(변수1+변수2);

	
	}
}
