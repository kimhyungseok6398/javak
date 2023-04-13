package tuto01;

public class Scanner {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = ((Object) sc).nextInt();
        System.out.println(i*1000);
        sc.close();
    }
	

}
