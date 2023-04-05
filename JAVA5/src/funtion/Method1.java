package funtion;

public class Method1 {
	public static void main(String[] args) {
		//메서드 사용하는법 ()
		//함수명();
		int result = 3+4;
		//int err = 3+; //+기호는 앞뒤로 숫자를 한개씩 넣어줘야함
		Myclass4 mc4 = new Myclass4();
		int result2 = mc4.더하기(3,4);
		System.out.println(result2);
	}
		
		
	}
	
class Myclass4{
	//메서드 : ㅋ,클래스 안에 있는 함수, this를 갖고있음 
	//메서드를 만든이유는 함수에 포인터사용을 생략위해
	
	//메서드 만드는 방법 (){}
	//자료형 함수명 (){}
	
	//+
	//더하기 하는 기호를 직접 만들어보겠습니다
	int 더하기(int num1,int num2) {    //값을 받기 위해 ()에 변수를 생성해놓는다
		int result = num1 + num2;   //받은 값 2개를 더한다
		return result;  //결과값을 반환한다 (반환  : 사용한곳에 전달한다)
	}

	}