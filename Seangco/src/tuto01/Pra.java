package tuto01;

import java.util.Iterator;

public class Pra {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j =10 ; j >=i; j--) {
				System.out.print(" ");
				
			}
			for (int k =0; k<=i;k++) {

				System.out.print("*");
				
			}
			for (int k =0; k<=i-1;k++) {

				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
	
}


