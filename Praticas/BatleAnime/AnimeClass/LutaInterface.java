package curso.exercicio.BatleAnime.AnimeClass;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LutaInterface {

    Scanner scan = new Scanner(System.in);
    Random gerador = new Random();
    public Personagens Escolher1;
    public Personagens Escolher2;
    public Bots[] bots;
    public Bots bot;
    public Personagens[] personagem;

    public static void limpatela() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public void escolher() throws InterruptedException {

        int i = 0;
        System.out.println("-----------------(1)-----------------");
        personagem[0].apresentacao();
        System.out.println("");
        System.out.println("-----------------(2)-----------------");
        personagem[1].apresentacao();
        System.out.print("\nESCOLHA SEU PERSONAGENS(NUMERO)");
        i = scan.nextInt();
        switch (i) {
            case 1:
                Escolher1 = personagem[0];
                break;
            case 2:
                Escolher1 = personagem[1];
                break;
        }
        this.Bot();
        this.luta();
    }

    public void luta() throws InterruptedException {
        int a = 0;
        int b = 0;
        do{
        limpatela();
        System.out.println("VOCE: " + Escolher1.getNome());
        System.out.println("HP " + Escolher1.getHp());
        System.out.println("----------------------------------");
        System.out.println("BOT " + bot.getNome());
        System.out.println("HP " + bot.getHp());
        System.out.println("\n");
        System.out.println("ESCOLHA AÇAO\n (1)ATAQUE ");
        a = scan.nextInt();
        limpatela();
        switch (a) {
            case 1:
                System.out.println("HABILIDADES");
                System.out.println(Escolher1.getHb1() + " DANO " + Escolher1.getD1());
                System.out.println(Escolher1.getHb2() + " DANO " + Escolher1.getD2());
                System.out.println(Escolher1.getHb3() + " DANO " + Escolher1.getD3());
                System.out.println("ESCOLHA(1,2 OU 3) ");
                switch (scan.nextInt()) {
                    case 1:
                        bot.setHp(bot.getHp()-100);
                        System.out.println("VOCE USOU "+Escolher1.getHb1() + "E DEU " + Escolher1.getD1() +"DANO ");
                        break;
                    case 2:
                        bot.setHp(bot.getHp()-200);
                        System.out.println("VOCE USOU "+Escolher1.getHb2() + "E DEU " + Escolher1.getD2() +"DANO ");
                        break;
                    case 3:
                        bot.setHp(bot.getHp()-300);
                        System.out.println("VOCE USOU "+Escolher1.getHb2() + "E DEU " + Escolher1.getD3() +"DANO ");
                        break;

                }   
        }
                Thread.sleep(2500);
                this.lutabot();
    }while (this.Escolher1.getHp()>= 0 && this.bot.getHp() >= 0);
    }
    
    public void lutabot() throws InterruptedException{
        int y = gerador.nextInt(2);
        switch (y) {
                    case 0:
                        Escolher1.setHp(Escolher1.getHp()-100);
                        System.out.println("O BOT USOU "+bot.getHb1() + "E DEU " + bot.getD1() +"DANO ");
                        break;
                    case 1:
                        Escolher1.setHp(Escolher1.getHp()-200);
                        System.out.println("O BOT USOU "+bot.getHb2() + "E DEU " + bot.getD2() +"DANO ");
                        break;
                    case 2:
                        Escolher1.setHp(Escolher1.getHp()-300);
                        System.out.println("O BOT USOU "+bot.getHb2() + "E DEU " + bot.getD3() +"DANO ");
                        break;

                }
        Thread.sleep(2500);
    }
    

    public void Bot() {
        this.bot = bots[gerador.nextInt(2)];
    }

    public void setPersonagem(Personagens[] personagens) {
        this.personagem = personagens;
    }

    public Bots[] getBots() {
        return bots;
    }

    public void setBots(Bots[] bots) {
        this.bots = bots;
    }

    public Bots getBot() {
        return bot;
    }

    public void setBot(Bots bot) {
        this.bot = bot;
    }

 
   
    
}
