public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        double c = scan.nextDouble();
        double salario = b * c;
        System.out.println("NUMBER = " + a);
        System.out.printf("SALARY = U$ %.2f ", salario);
    }

}
