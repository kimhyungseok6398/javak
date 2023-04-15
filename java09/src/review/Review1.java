package review;

public class Review1 {
		// 자바1
		// 변수, 자료형, 연산자, 조건문, 반복문, 클래스, 메서드, 접근권한제어자, 캡슐화, this, 생성자, 상속, 인터페이스, 추상클래스
			public static void main(String[] args) {
				// 다른 클래스의 내용을 사용하기 위해선 '객체화' 라는 작업이 필요
				// 객체를 통해서 사용
				// 클래스명 객체명 = new 생성자명();
				MyClass1 mc = new MyClass1();			// 객체화
				
				mc.myMethod();
				
				MyClass2 mc2 = new MyClass2();
				mc2.myMethod();
			}
		}

		class MyClass1{
			// 변수와 자료형
			String str;			// 변수 선언(공간 생성)
			int num = 0;		// 변수 초기화(공간 생성 + 처음값 대입)
			double dNum;
			// 멤버변수는 private, 메서드는 public (캡슐화, 정보은닉)
			private boolean bool;		// 클래스 멤버변수
			
			// 메서드(){}
			public int myMethod() {
				// 변수 대입
				this.str = "hello";				// 멤버변수
				String str = "world";			// 지역변수
				
				// 연산자 +, -, *, /, %, >, <, >=, ,<=, ==, !=, ||, &&, !, |, &, ~, ...
				this.str = this.str + str;
				
				for(int i=0;i<3;++i) {
					if(this.str != null || !(this.str.equals(""))) {
						System.out.println(this.str);							
					}
				}
				
				return 0;		// return은 함수의 자료형과 맞춰준다
			}
		}


class Myclas2 extends Myclass1{
	// MyClass1의 내용이 복붙되어있음
	
		// 추가
		String arr[] = {"일","이","삼","사"};
		int[] nums = new int[4];
		
		// 수정(오버라이딩, 재정의)
		public int myMethod() {
			System.out.println("오버라이딩");
			
			return 1;
		}
		
		// 생성자의 이름은 클래스의 이름과 동일해야한다
		public MyClass2(){
			System.out.println("MyClass2 객체화 성공!");
		}
		
	}
class Myclass3 extends Adapter1{
	
	
	public void must2() {
		System.out.println("머스트2");
		
		
	}

	@Override
	public void must() {
		// TODO Auto-generated method stub
		
	}
	public void must3() {
		// TODO Auto-generated method stub
		
	}
	public void must3() {
		// TODO Auto-generated method stub
		
	}
}
