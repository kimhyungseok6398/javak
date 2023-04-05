package funtion;

public class Class2 {
	public static void main(String[] args) {
		//객체화할때 구체적으로 누구인지 명시
		//사람은 사람인데 이순신
		Person 이순신 = new Person();
		Person 아빠 = new Person();
		Person 엄마= new Person();
		Person 나 = new Person();
		
		
		//.클래스 : 대상 없음 (설계도)
		//객체(object) : 대상을 정한다
		이순신.이름 = "이순신";
		이순신.나이 = 36;
		이순신.키 = 188.8;
		이순신.말하기();
		
		나.이름 = "홍길동";
		나.나이 = 20;
		나.키 = 177.7;
		// 나라는 객체는 홍길동 20 177.1 이라는 정보를 갖고 있음
		// ==>메서드를 사용할때 활용되는 정보가 다르다는 뜻
		나.말하기();
	}	
	

		
		

			
						
						
						
			

}

//클래스는 포괄적인 개념 ==>객체는 구체적인 물체
class Person{
	//사람 . 클래스 
	
	//변수 == 정보 (사람이라면 갖고 있는 정보)
	String 이름;
	int 나이;
	double 키 ;        //변수는 클래스의 정보들을 저장하기 위해 생성\\
	//매서드 행위 (사람이 할수 있는 행위)
	void 말하기 () {
		System.out.println(이름+"가 말합니다");
				System.out.println();
	}
}