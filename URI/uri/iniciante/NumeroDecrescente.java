package uri.iniciante;

import java.util.Scanner;
public class NumeroDecrescente {
    public static void main(String[] args) {
        Scanner say = new Scanner(System.in);
        int b = 0;
        int a = say.nextInt();
        do{
            System.out.println(a);
            a--;
        }while(a > b);
        }
    }
  
