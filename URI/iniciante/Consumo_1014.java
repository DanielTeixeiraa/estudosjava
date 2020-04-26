
package uri.iniciante;

import java.util.Scanner;

public class Consumo_1014 {
        public static void main(String[] args) {
        
    
    Scanner scan = new Scanner(System.in);

    int x = scan.nextInt();
    float y = scan.nextFloat();

    float km =((float) x)/ y ;
    
        System.out.printf("%.3f km/l\n",km);

            }
    
}
