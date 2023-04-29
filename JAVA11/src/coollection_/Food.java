package coollection_;

import java.util.ArrayList;
import java.util.Scanner;

public class Food {
	public static void main(String[] args) {
		// 1. 추가 2. 변경 3. 삭제 4. 전체보기 0. 끝내기
				// 음식점 항목을 관리하는 프로그램 만들기
				// 기본메뉴 : 김밥, 떡볶이, 순대
				// 가격 : 1000, 2000, 3000
				FoodList food = new FoodList();
				Scanner sc = new Scanner(System.in);
				int choice = 0;
				String food_name = "";
				int food_price = 0;
				
				System.out.println("==항목을 선택하세요==");
				while(true) {
					System.out.println("1.추가 2.변경 3.삭제 4.보기 0.끝내기");
					choice = sc.nextInt();
					if(choice == 1) {
						// 1. 추가
						System.out.println("추가할 음식명:");
						food_name = sc.next();
						System.out.println("추가 음식의 가격:");
						food_price = sc.nextInt();
						food.addFood(food_name, food_price);
					}else if(choice == 2) {
						// 2. 변경
						System.out.println("변경할 음식: ");
						food_name = sc.next();
						System.out.println("변경 후 음식명: ");
						String after = sc.next();
						System.out.println("변경 음식의 가격:");
						food_price = sc.nextInt();
						food.setFood(food_name, after);
					}else if(choice == 3) {
						// 3. 삭제
						System.out.println("삭제할 음식:");
						food_name = sc.next();
						food.deleteFood(food_name);
					}else if(choice == 4) {
						// 전체 보기
						food.showAll();
					}else if(choice == 0){
						System.out.println("프로그램 종료");
						break;
					}else {
						/* no actions */
					}
				}
			}
		}

class FoodList {
	ArrayList<String> name = new ArrayList<>();
	ArrayList<Integer> price = new ArrayList<>();

	public FoodList() {
		name.add("김밥");
		name.add("떡볶이");
		name.add("순대");
		price.add(1000);
		price.add(2000);
		price.add(3000);
		
	}

	public void addFood(String str,int a) {
		name.add(str);
		price.add(a);
	}
	public void setFood(String prev, String after) {
		int number = Food.indexOf(prev);
		Food.set(number, after);
	}
	public void deleteFood(String str) {
		int number = Food.indexOf(str); 
		Food.remove(number);
	}
	public void showAll() {
		for (int i = 0; i < name.size(); ++i) {
			System.out.println(name.get(i)+":"+price.get(i)+"원");
		
	}
	}
}
