import java.util.*;
public class Main {

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		double raio = scan.nextDouble();
		double n = 3.14159;
		
		double area = n*(raio*raio);
		System.out.printf("A=%.4f\n",area);
	}
}
