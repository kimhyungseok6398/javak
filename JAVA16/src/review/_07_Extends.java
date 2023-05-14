package review;

public class _07_Extends {
	public static void main(String[] args) {
	MyExtends me = new MyExtends();
	me.getStr("123");
	String str = me.getStr();
	System.out.println(str);
	}

}
// 상속(extends) Myclass7을 : MyExtend에 복붙
class MyExtends extends MyClass7{
	//여기서 My클래스7 변수와 메서드 사용가능
	//오버라이딩(재정의) : 조금 바꿔야 할 메서드가 있다
	public String getStr() {
		return "==" + super.getStr()+"==";
		//super. : 부모의 
	}
}
class MyClass7{
	//클래스 : 변수 + 함수
	private String str;
	
	//생성자 (클래스의 이름과 동일한 이름의 메서드 ,객체화할때 자동호출)
	public MyClass7() {
		
	}
public void setdtr(String str) {
	this.str = str;		//매개변수() str을 멤버변수 str에 담는다
	//this가 어디서 나왔나
	//함수 --메서드로 바뀔때 매개변수로 삽입
	//this : 내 클래스의 멤버(변수또는 메서드)
	
	
}
public String getStr(/*클래스명 this*/) {
	return str;	//곂치는 명칭이 없으면 this.생략가능
}
//오버로딩 : 메서드명이 같아도 메개변수가 다르면 다른 메서드 취급
public String getStr(String str) {
	return this.str;
	
}
}
