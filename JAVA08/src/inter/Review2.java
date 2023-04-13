package inter;

public class Review2 extends Review1 {

	public Review2(int num1, int num2, int num3, int num4) {
		super(num1, num2, num3, num4); //슈퍼 부모의 생성자룰 사용
		super.num4 = 4;
		
		// TODO Auto-generated constructor stub
	}
	//Review1 의 코드가 복붙되었음
	//상속을 했더니 클래스명에 빨간밑줄이 간다? 명시해줘야 하는 메서드가 있는 것(생성자)
	//super.  :  부모의 변수 또는 메서드를 사용
	//this.   :  나의 변수 또는 메서드 사용

	//복붙울 하는 이유는 기존 클라스를 유지한채로 기능을 수정 추가하기 위해
	//수정 (오버라이딩)
@Override
	public void printNum() {
	// TODO Auto-generated method stub
	super.printNum();   //super.printNum() : 부모의 PrintNumdmf 사용(코드실행)
	System.out.println("결과:(num2+ㅜnum3));
}
}