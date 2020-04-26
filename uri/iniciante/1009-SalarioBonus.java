import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double comi = b * 0.15;
        double salario = a+comi;
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }

}
