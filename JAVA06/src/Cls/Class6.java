package Cls;

public class Class6 {
	public static void main(String[] args) {
		Car 아빠차 =new Car();
		//아빠차,name = "";   //private하면 직접 사용이 불가능해짐(대입x)
		//System.out.println(아빠차.name);       (사용x)
		아빠차.setname("제네시스");
		System.out.println(아빠차.setname);
	
	}

}
//멤버변수는 private, 메서드는 public
/*
접근권한 제어자 
private:



//캡슐화 : 멤버변수를 privat으로 만들어서 외부 클래스로부터 데이터를 보호하고 public 메서드로 보호한다
*/
class Car{
	// 차명, 제조사,색상 차번호 (뒷자리)
	private String name; 
	private String color;     //private이 되면 다른 클래스에서 사용 불가능 
	private int num;
	
	//대입을 위해선  set
	public void setName(String name) {
		this.name=name;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setNum(int num) {
		this.num =num; 
	}
	public String getName() {
		return name;	
	}
	public String getColor() {
		return color;
	}
	public String getnum() {
		return num;
	}
	
	

	