package LLL;

public class Class4 {
	public static void main(String[] args) {
		//1 객체화 
		//2 setstr을 써서 글자를 씀
		//3 getstr을 써서 사용
		
		myclass mc8 = new myclass8();
		mc8.setstr("담기!");
		mc8,getstr();
		
		
	}
	

}
class myclass8{
	//클래스 : 변수와 함수를 묶어놓운 것
	//변수 ==>멤버 변수
	//함수 ==>메서드
	string str; //클래스에 있는 변수는 클래스 맴버변수 라고 한다
	void func() {}// 클래스에 있는 함수는  메서드 라고 한다
	//클래스 기원 : 초보자를 위해서 (초보자에게 코그를 교육하지 않고 사용하게 하기 위해
	void setstr(String a _str) {
		//str 변수에 값을 담는 함수
		str = a_str;
		
	}
string getstr() {
	//str 변수를 사용하는 힘수
	string str = "hello";
	System.out.println(str);
	return
}
}