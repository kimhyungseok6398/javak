package Time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDateTime {
	String str1 = "멤버변수";
	static String str2 =  "static전적 멤버변수";
	
	public static void main(String[] args) {
		MyTime mt = new MyTime();
		
		System.out.println(mt.dateTime());
		System.out.println(mt.date());
		System.out.println(mt.time());
		System.out.println(mt.tomorrow());
		System.out.println(mt.after30());
		
		System.out.println(MyDateTime.str2);
		
		GetInstance get = GetInstance.getInstance(); //GetInstance . Static 으로 올려놔서 접근가능
		GetInstance get2 =GetInstance.getInstance(); ///Get==get2
		
		//GetInstance():static으로 객체화
 		get.print();
		
 		// Singleteton sing1 = new Singleteton();
 		// Singleteton sing1 = new Singleteton();
 		
 		 Singleteton 홍길동 =  Singleteton.getInstance();
 		 Singleteton 이순신 =  Singleteton.getInstance();
 		 
 		 홍길동.setStr("홍길동입니다");
 		 System.out.println(이순신.getStr());
 		
 		 //getInstance() : 객체화하는 작업
 		 
 		 
	}
}

// 클래스
class MyTime{
	// 자바 코드로 현재 시간을 가져오는 법
	// Calendar, Date, SimpleDateFormat, String
	
	// 멤버 변수
	private String str;
	
	// 메서드
	public String dateTime() {
		// 현재 시간을 반환
		Calendar cal = Calendar.getInstance();			// 객체화(싱글턴패턴, 1회용 객체화)
		Date date = cal.getTime();					// 시간을 가져옴
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");		// 시간을 출력할 형태를 생성자로 결정
		
		str = sdf.format(date);
		return str;
	}
	
	public String date() {
		// 년.월.일 반환
		Calendar cal = Calendar.getInstance();			// 싱글턴패턴 객체화
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		
		str = sdf.format(date);
		
		return str;
	}
	
	public String time() {
		// 10:00:55
		Calendar cal = Calendar.getInstance();			// 싱글턴패턴 객체화
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		
		str = sdf.format(date);
		
		return str;
	}
	
	public String tomorrow() {
		// 내일, 한시간 뒤
		Calendar cal = Calendar.getInstance();			// 싱글턴패턴 객체화 (이때 시간을 가져옴)
		Date date = cal.getTime();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd");
		SimpleDateFormat sdf4 = new SimpleDateFormat("HH");
		SimpleDateFormat sdf5 = new SimpleDateFormat("mm");
		SimpleDateFormat sdf6 = new SimpleDateFormat("ss");
		
		String year = sdf1.format(date);			// 년
		String month = sdf2.format(date);			// 월
		String day = sdf3.format(date);				// 일
		String hour = sdf4.format(date);			// 시
		String minute = sdf5.format(date);			// 분
		String second = sdf6.format(date);			// 초
		
		// 년-월-일 시:분:초
		str = year + "년-" + month + "월-" + (Integer.parseInt(day)+1) +"일 " +
				(Integer.parseInt(hour)+1) + "시:" + minute + "분:" + second + "초";  
		
		return str;
	}
	
	public String after30() {
		// 30분 뒤 시간
		Calendar cal = Calendar.getInstance();			// 싱글턴패턴 객체화 (이때 시간을 가져옴)
		cal.add(Calendar.DATE, -1);			// 일 (하루전)
		cal.add(Calendar.MINUTE, 30);		// 분 (30분 후)
		Date date = cal.getTime();			// Date형변환
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd");
		SimpleDateFormat sdf4 = new SimpleDateFormat("HH");
		SimpleDateFormat sdf5 = new SimpleDateFormat("mm");
		SimpleDateFormat sdf6 = new SimpleDateFormat("ss");
		String year = sdf1.format(date);			// 년
		String month = sdf2.format(date);			// 월
		String day = sdf3.format(date);				// 일
		String hour = sdf4.format(date);			// 시
		String minute = sdf5.format(date);			// 분
		String second = sdf6.format(date);			// 초
		
		str = year + "년-" + month + "월-" + day +"일 " +
				hour + "시:" + minute + "분:" + second + "초";  
		
		return str;
	}
}