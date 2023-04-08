package extend;

public class Ex4 {
	public static void main(String[] args) {
		스타벅스 cafe1 = new 스타벅스("본점",123);
		cafe1.prinMenu();
		부평점 cafe2 = new 부평점("부평점",321);
		cafe2.prinMenu();
		강남점 cafe3 =  new 강남점("강남점", 0331);
		cafe2.prinMenu();
		
		
	}

}
//스타벅스
class 스타벅스{
	protected String 지점명;
	protected String 메뉴[]= new String [3];
	protected int 매출;
	
	public 스타벅스 (String 지점명 ,int 매출) {
		this.지점명 =  지점명;
		this.매출 =  매출;
		setMenu();
		
	}	
	public void setMenu() {
		메뉴[0] = "카푸치노";
		메뉴[1] = "카페라떼";
		메뉴[2] = "오렌지주스";
		
		
		
	}	
	public void prinMenu() {
		System.out.print(지점명+"의 메뉴판 : ");
		for(int i=0;i<메뉴.length;++i) {
			System.out.print(메뉴[i]+" ");
		}
		System.out.println();
	}
}

//스타벅스-부평점
class 부평점 extends 스타벅스{

	public 부평점(String 지점명, int 매출) {
		super(지점명, 매출);
		// TODO Auto-generated constructor stub
	}
	public void setMenu() {
		메뉴[0] = "아메리카노";
		메뉴[1] = "카라멜라떼";
		메뉴[2] = "딸기주스";
		
		
		
	}	
	
}
//스타벅스-강남점
class 강남점 extends 스타벅스{

	public 강남점(String 지점명, int 매출) {
		super(지점명, 매출);
		// TODO Auto-generated constructor stub
	}
	//수정
	//오버라이딩 : 상속받은 메서그를 재정의 (수정)
	public void setMenu() {
		메뉴[0] = "스위트아메리카노";
		메뉴[1] = "우유라떼";
		메뉴[2] = "키위주스";
		
	}
}

