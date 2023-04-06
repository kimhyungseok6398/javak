package funtion;
//public class 한 파일에 한개만
public class Class1 {
	public static void main(String[] args) {
		//클래스와 메서드(코디방법론)
		//객체지향 oop
		
		//c언어에는 구조체라는 문법이 있었음
		//구조체는 변ㅅㄷㄹ을 뭉쳐놓는 문법
		//포인터 개념을 가리기 위헤서 구조체에 함수를 넣고 이름을 바꾼것이 '클래스'
		
		//클래스 : 변수 와 함수 담아놓는 공간(class : 변수 + 함수)
		//클래스를 다른 클래스에서 사용하기 위해서는 객체화라는 작업을 거쳐야함
		//객체화 하는 방법
		//클래스명 객체명 = new 클래스명();
		//class1에서 Myclass을 사용하고 싶다 ==>Myclass을 '객체화'해줘야 한다
		
		Myclass1 변수명1 = new Myclass1();
		//변수명1이라는 이름으로 '객체화' (클래스를 통해서 객체를 생성)
		//객체(변수명1)을 통해서 클래스(Myclass)의 변수와 메서드를 사용할수 있다
		변수명1.메서드명();
		변수명1. num = 3;
		System.out.println(변수명1.num);    //사용할때는 객체명.으로 사용
		
		
				
		
		
		
		//
		
		
		
}
}
class Myclass1{
	//클래스 : 변수 + 함수
	//변수

	
	int num;
String str;

	//메서드 (클래스 안에 있는 함수는 메서드 라고 부릅니다)
	void 메서드명() {
		System.out.println("자료향이 없는 메서드");
		
		
	}
	int 정수형_메서드명() {
		System.out.println("정수형 메서드를 사용했다");
		return 0;
		String 문자열형_메서드() {
			System.out.println("문자렿형 메서드를 사용한다");
		
		}
		
		
		
		
		
		
	}



