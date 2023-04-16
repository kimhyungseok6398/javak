package Time;

public class Staticvar {
	//이렇게 하면 안됨 싱글패턴으로!!
	static String str1 = "안녕하세요";
	static String str2 = "안녕하세요";
	static int num1 = 314;
	static int nums[] = new int[100];
		
	public static void name(String[]args) {
		Test.print(); //static메서드
	
		Singleteton singleteton = Singleteton.getInstance();
		singleteton.setStr("안녕하세요 싱글턴입니다");
		System.out.println(singleteton.getStr());
		
	
	}
}
class Test{
	public static void print() {
		System.out.println(Staticvar.str1);
		Staticvar.nums[0] = 0;
		Staticvar.nums[1] = 1;
		Staticvar.nums[2] = 2;
		
		
		System.out.println(Staticvar.num1);
	}
}

