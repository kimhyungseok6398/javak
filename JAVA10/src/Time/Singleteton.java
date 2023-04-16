package Time;

public class Singleteton {
	// 디자인패턴을 싱글 패턴으로 해서 클래스를 구성 (디자인)
	private Singleteton() {}
	
	private static Singleteton instance;			// 객체를 저장할 멤버변수
	
	// 객체 멤버변수를 반환해줄 static 메서드 : getInstance()
	public static Singleteton getInstance() {		// 얘를 통해 객체화
		if(instance == null) {
			instance = new Singleteton();			// getInstance() 메서드를 사용하면 내부에서 객체화
		}
		return instance;
	}
	
	
	//멤버변수와 메서드
	private String str;
	
	public String getStr() {
		return str;
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
}
		
	
		

