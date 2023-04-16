package Time;

public class GetInstance {
	//GetInstance() : 싱글턴 패턴
	//디자인 패턴 : mvc 패턴,싱글턴 패턴,...
	//디자인 패턴이란 코딩 방식(구조)
	
	//싱글턴 패턴 : 한번만 객체화를 허용해주되
	 //생선자를 프라이빗으로 해서 일반적인 겍체화를 불가능하게 함
	private GetInstance() {}
	private static GetInstance instance;
	
	public static  GetInstance getInstance() {
		if(instance==null) {
			instance = new GetInstance();
			
		}
		return instance;
	
	}
		public void print() {
			System.out.println();
			
		}
}
