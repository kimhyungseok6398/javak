package inter;

public interface Review3 {
	//상속용 클래스
		//인터페이스 상수 또는 메서드의 선언부만 올수 있음
		final static String str = "Review Interface";  //상수 final 한번 정하면 못바꿈
		String str2 = "final static 이 생략되어 있음";     //자료형 엎에 "final static이 자동 생략
		public void test1();
		public void test2();     //{}없이도 메서드 선언까지만
		                        //상속받은 곳에서 반드시 오버라이딩 {}를 구현해줘야함
}
