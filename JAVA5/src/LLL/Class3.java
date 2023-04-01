package LLL;

public class Class3 {
	public static void main(String[] args) {
		자동차 아빠차=new 자동차();
		자동차 엄마차=new 자동차();
		자동차 나=new 자동차();
		}

}
//Class 자동차 
//데이터 : 차주인 차종 차색상
//기능 : 차정보(주인은 누구인지 차종은 무엇인지,차색상은무엇인지)

class 자동차{
	String 차주인="아빠";
	String 차종="벤츠";
	String 차색상="블랙";
	
	void 차정보() {
		System.out.println("주인 "+차주인",차종:"차종")
		System.out.println();
		
	}
}