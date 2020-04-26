import java.util.*;

public class main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		double tri = (a*c)/2;
		double cir = (3.14159 * c *c);
		double tra = ((a+b)/2)*c;
		double qua = b*b;
		double re  = a*b;
		
		System.out.printf("TRIANGULO: %.3f\n", tri);
		System.out.printf("CIRCULO: %.3f\n", cir);
		System.out.printf("TRAPEZIO: %.3f\n", tra);
		System.out.printf("QUADRADO: %.3f\n", qua);
		System.out.printf("RETANGULO: %.3f\n", re);
	}
}