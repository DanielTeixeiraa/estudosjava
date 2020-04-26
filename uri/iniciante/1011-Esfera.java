import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    
    Scanner scan = new Scanner(System.in);

    double pi = 3.14159;
    double R = scan.nextDouble();

    double area =((4/3.0) * pi * (R*R*R));
    
        System.out.printf("VOLUME = %.3f\n",area);

            }
}
