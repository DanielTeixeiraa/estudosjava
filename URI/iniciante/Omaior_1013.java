import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int ab = (a + b + Math.abs(a - b))/2;
		int abc = (ab + c + Math.abs(ab - c))/2;
		
		System.out.println(abc + " e o maior");
	}
}
