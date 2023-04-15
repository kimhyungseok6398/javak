package polymorphism;

import java.util.Scanner;

public class PolyPet {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//	int select = -1,type = -1;
//	Dog dog_list[] = new Dog[20];
//	Cat cat_list[] = new Cat[20];
//	int dog_count = 0;
//	int cat_count = 0;
//	Bird bird_list[] = new Bird[20];
//	int 
	//항목이 추가할때마다 전반적으로 프로그램이 수정됨 ==> 다형성 (을 제공, 자료형을 통일)
	pet pet_list [] = new pet [60];
	int pet_count = 0;
	
	while(select != 0) {
	System.out.println("===메뉴===");
		System.out.println("1.추가 2.울기 3.먹기 0.종료");
		select = Integer.parseInt(sc.nextLine());   //문자열 ->int
	
		if(select == 1) {
			System.out.println("0:개, 1:고양이 ?");
			type = Integer.parseInt(sc.nextLine());// 추가항목 선택}
			if(type == 0) {
				// 개 추가
				dog_list[dog_count++] = new Dog();
			}
			else if(type == 1) {
				// 고양이 추가
				cat_list[cat_count++] = new Cat();
				
			// 울기
			else if(select == 2) {
				for(int i=0;i<dog_count;++i) {
			}
				dog_list[i].울기();System.out.println("고양이를 추가했습니다.");
			}
				System.out.println("개를 추가했습니다.");
			}
		

	
	
	
	
	
	 {
	class cat implements pet{     //고양이
		public void 울기() {
		System.out.println("야옹");
		}
	public void 먹기() {
		System.out.println("츄르");
	}
	}
	class cat implements pet{ 
	public void 울기() {           //강아지
	 System.out.println("멍멍");
	}
	public void 먹기() {
	 System.out.println("개껌");
	}
	}
	class Bird implements pet{    //새 
		public void 울기() { 
			System.out.println("잭짹");
			
		}
	}

		
		
		
		s// 메뉴선택	// 문자열 -> int
		
		}
			
			}
			
		}
			}
			for(int i=0;i<cat_count;++i) {
				cat_list[i].울기();
			}
		}
		
	
