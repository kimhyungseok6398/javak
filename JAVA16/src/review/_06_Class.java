package review;

public class _06_Class {
	public static void main(String[] args) {
		// 클래스 변수들과 함수들을 묶어놓은 세트
		//다른 클래스의 변수나 메서드르 사용하고 싶으면 객체화
		//클래스를 자료형으로 사용해서 선언
		Myclass6 myclass6 = new Myclass6();
		//변수와 메서드눈 객체를 통해 사용
		myclass6.func1();
	}

}
class Myclass6{
	//변수--private 멤버변수
	private int num;
	private double dnum;
	private String nstr;
	
	//함수--public 메서드
	public void func1() {}
	public int func2() {
	return 0;
}
	public void func3() {
	}
	public void func4() {
	
		
	}
}
