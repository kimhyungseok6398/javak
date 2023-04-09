package polymorphism;

public class PolyPet {
	Scanner sc = new Scanner(System.in);
	int select = -1, type = -1;
	Dog dog_list[] = new Dog[20];
	int dog_count = 0;
	Cat cat_list[] = new Cat[20];
	int cat_count = 0;
	
	while(select != 0) {
		System.out.println("===메뉴===");
		System.out.println("1.추가 2.울기 3.먹기 0.종료");
		select = Integer.parseInt(sc.nextLine());	// 메뉴선택	// 문자열 -> int
		
		if(select == 1) {
			System.out.println("0:개, 1:고양이 ?");
			type = Integer.parseInt(sc.nextLine());		// 추가항목 선택
			if(type == 0) {
				// 개 추가
				dog_list[dog_count++] = new Dog();
				System.out.println("개를 추가했습니다.");
			}
			else if(type == 1) {
				// 고양이 추가
				cat_list[cat_count++] = new Cat();
				System.out.println("고양이를 추가했습니다.");
			}
		}else if(select == 2) {
			// 울기
			for(int i=0;i<dog_count;++i) {
				dog_list[i].울기();
			}
			for(int i=0;i<cat_count;++i) {
				cat_list[i].울기();
			}
		}
	}
}
}
	

}
