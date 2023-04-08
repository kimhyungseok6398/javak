package extend;

public class Ex3 {
	public static void main(String[] args) {
		
			
		}
	}

	// class : 변수 + 함수
	class MyString{
		private String str1;
		String str2;
		protected String str3;
		public String str4;
		
		MyString(String str){
			System.out.println("MyString 객체화");
			this.str1 = str;
			this.str2 = str;
			this.str3 = str;
			this.str4 = str;
		}
		
		public void myPrint1(){
			System.out.println(str1);
		}
		
		public void myPrint2(){
			System.out.println(str1+str2+str3+str4);
		}
		
		public void setStr(String str) {
			this.str1 = str;
		}
		
		public String getStr() {
			return str1;
		}
		
	}