package tuto01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int score = sc.nextInt();
	 
	

	 if(score>=90 && score<=100) {

	 System.out.println("A");

	 	}

	

	 else if(score>=70) {

	 System.out.println("B");

	 }

	 // 80점 이상이면 B 출력

	 else if(score>=40) {

	 System.out.println("C");

	     }

	 // 70점 이상이면 C 출력

	 else if(score>=39) {

	 System.out.println("D");

	 	}

	 // 60점 이상이면 D 

	 else if(score>=0) {

	 System.out.println("F");

	 	}
	}
}





