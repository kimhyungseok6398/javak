package Away;

public class arr2 {
	public static void main(String[] args) {
		//배열 
		// 하나의 주제로 여러 변수를 묶기위해 만듦
		
		// 카페에서 커피메뉴를 전시해야한다
		String menu1 = "에스프레소";
		String menu2 = "아메리카노";   //메뉴에서  제거
		//일반 변수로 나열했을때의 문제점
		// 1. 메뉴가 총 몇개인지 바로 알수 없음 
		// 2. 전체 메뉴가 총 몇개인지 바로 알수없음 
		// 3. 저네체 출력이 불가능 (메뉴 전시를 하려면 일일히 다 써줘야함,반복문이 안되기 때문
		
		//==> 같은 주제로 이루어진 변수들은 배열이라는 문법을 통해서 변수나열을 한다
		
		
		
		int arr_size = menus.length;  //총 갯수를 알고싶다 
		System.out.println("메뉴의 총갯수:" +arr_size);
		
		
		//첫번째 메뉴를 보고싶다 ==> 0번방을 출력 
		// 변수명 [번호] 
		System.out.println("=="+menus[0]+"=="]);
		
		menu1 = "일반변수 바꾸기";
		menus[0] = "배열요소 바꾸기";
		
		
		//배열을 만들고 값을 채워 넣고 싶다 
		int nums[];
		nums = new int[3];  //nums에 정수변수 총 3개를 연결 {0번방,1번방,2번방}
		
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 4;
		
		
		//
	}

}
