package tuto01;

class Calculator1 {
	int left, right;
	static double PI = 3.14;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class Calculator {

	public static void main(String[] args) {

		Calculator1 c1 = new Calculator1();
		Calculator1 c2 = new Calculator1();
		
		System.out.println(c1.PI);
		System.out.println(c2.PI);
		System.out.println(Calculator1.PI);
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();

		c2.setOprands(20, 40);
		c2.sum();
		c2.avg();

		
	}

}
