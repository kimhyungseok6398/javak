package Cls;

public class Constructor1 {
	public static void main(String[] args) {
		//클래스의 생성자
		//클래스는 초보자를 위한 문법, 초기에 먼저 해줘야할 작업을 자꾸 빼먹는다...
		//생성자 : 사람이 초기값을 입력하지 않으면 실행이 안되게끔 해버리는 문법 (반드시 초기값을 입력하게끔 해놓는 문법)
		//생성자는 메서드 클래스의 이름과 동일한 이름의 메서드
		
		// 클래스의 생성자
				MyClass9 m1 = new MyClass9();
				MyClass9 m2 = new MyClass9();
				
				// 해당 놀이기구는 나이가 13세 이상이면서 키가 150cm이상이어야 탑승이 가능합니다
				
			}
		}

		class MyClass9{
			// 멤버변수
			private int age;
			private String name;
			private double height;
			public int getAge() {
				return age;
			}
			
			// 메서드
			public void setAge(int age) {
				this.age = age;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public double getHeight() {
				return height;
			}
			public void setHeight(double height) {
				this.height = height;
			}
			
		}

		class MyClass9Test{
			public void test(MyClass9 mc) {
				if(mc.getAge() < 13) {
					System.out.println(mc.getName()+"은(는) 나이가 적습니다. 탑승불가");
				}else if(mc.getHeight() < 150) {
					System.out.println(mc.getName()+"은(는) 키 미달. 탑승불가");
				}else {
					System.out.println(mc.getName()+"은 탑승 가능");
				}
			}
			
		}