package Time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDateTime2 {
	public static void main(String[] args) throws Exception {
		MyDate md = new MyDate();
		
		
		while (true) {
		System.out.println(md.now());
		Thread.sleep(1000);
		
	}
}
}

class MyDate {
	// 현재시간을 가져오기
	// 0000년 00월 00일 00분 00분 00초
	public String now() {

		String str = null;

		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		str = sdf.format(date);
		return str;
	}
}
