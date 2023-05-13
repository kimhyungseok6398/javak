package tuto01;

import java.io.InputStream;
import java.util.Scanner;

//***메소드***중요!! 
public class Method {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		switch (num) {
		case "+":
			System.out.println(sum(10,2));
			break;
		case"-":
			System.out.println(del(10,2));
			break;
		case"*":
			System.out.println(mul(10,2));
			break;
		case"/":
			System.out.println(div(10,2));
			break;
		
			
		}
	}


	static int sum(int a, int b) {
		return a + b;
	}
	static int del(int a, int b) {
		return a - b;
	}
	static int mul(int a, int b) {
		return a * b;
	}
	static int div(int a, int b) {
		return a / b;
	}
}