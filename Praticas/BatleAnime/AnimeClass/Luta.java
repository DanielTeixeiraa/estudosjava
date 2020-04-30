package curso.exercicio.BatleAnime.AnimeClass;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Luta {

    public static int a = 0;
    public static int y;
    public static int x = 0;
    Scanner scan = new Scanner(System.in);
    Random gerador = new Random();
    public Personagens Escolher1;
    public Personagens Escolher2;
    public Bots[] bots;
    public Bots bot;
    //  public Personagens bot;
    public Personagens[] personagem;

    public static void limpatela() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public void setY() {
        y =  gerador.nextInt(4);
    }

    public int getY() {
        return y;
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
        int b = 0;
        while (this.Escolher1.getHp() >= 0 && this.bot.getHp() >= 0) {
           // limpatela();
            System.out.println("VOCE: " + Escolher1.getNome());
            System.out.println("HP " + Escolher1.getHp());
            System.out.println("MANA: " + Escolher1.getMana());
            System.out.println("----------------------------------");
            System.out.println("BOT " + bot.getNome());
            System.out.println("HP " + bot.getHp());
            System.out.println("MANA: " + bot.getMana());
            System.out.println("\n");
            if (Escolher1.getMana() > 0) {
                System.out.println("ESCOLHA AÇAO\n (1)ATAQUE (2)DEFESA ");
                a = scan.nextInt();
            } else {
                System.out.println("VOCE NAO TEM MAIS MANA. SE DEFENDENDO AUTOMATICAMENTE");
                a = 2;
                Thread.sleep(2500);
            }

            //limpatela();
            setY();
            //limpatela();
            switch (a) {
                case 1:
                    System.out.println("HABILIDADES");
                    System.out.println(Escolher1.getHb1() + " DANO " + Escolher1.getD1());
                    System.out.println(Escolher1.getHb2() + " DANO " + Escolher1.getD2());
                    System.out.println(Escolher1.getHb3() + " DANO " + Escolher1.getD3());
                    System.out.println("ESCOLHA(1,2 OU 3) ");
                    x = scan.nextInt();
                    while(x == 3 && Escolher1.getMana() < 3){
                        System.out.println("VOCE NAO TEM MANA SUFICIENTE\n ESCOLHA OUTRA HABILIDADE");
                        x = scan.nextInt();
                    }
                    while(x == 2 && Escolher1.getMana() < 2){
                        System.out.println("VOCE NAO TEM MANA SUFICIENTE\n USADO A HABILIDADE 1");
                         Thread.sleep(1500);
                        x = 1;
                    }
                    switch (x) {
                        case 1:
                            bot.setHp(bot.getHp() - 100);
                            Escolher1.setMana(Escolher1.getMana() - 1);
                            System.out.println("voce usou " + Escolher1.getHb1() + " e deu " + Escolher1.getD1() + " dano \n");
                            break;
                        case 2:
                            bot.setHp(bot.getHp() - 200);
                            Escolher1.setMana(Escolher1.getMana() - 2);
                            System.out.println("voce usou " + Escolher1.getHb2() + " e deu " + Escolher1.getD2() + " dano \n");
                            break;
                        case 3:
                            Escolher1.setMana(Escolher1.getMana() - 3);
                            bot.setHp(bot.getHp() - 300);
                            System.out.println("voce usou " + Escolher1.getHb2() + " e deu " + Escolher1.getD3() + " dano \n");
                            break;

                    }
                    Thread.sleep(2500);
                    this.lutabot();
                    break;

                case 2:
                    this.lutabot();
                    Escolher1.setMana(Escolher1.getMana() + 1);
                    switch (this.getY()) {
                        case 0:
                            System.out.println("VOCE NAO RECEBEU NENHUM DANO\nO BOT NAO DEU DANO");
                            bot.setMana(bot.getMana() + 1);
                            break;
                        case 1:
                            System.out.println("VOCE SE DEFENDEU E RECEBEU 50 DE DANO\n");
                            Escolher1.setHp(Escolher1.getHp() + 50);
                            break;
                        case 2:
                            System.out.println("VOCE SE DEFENDEU E RECEBEU 100 DE DANO\n");
                            Escolher1.setHp(Escolher1.getHp() + 100);
                            break;
                        case 3:
                            System.out.println("VOCE SE DEFENDEU E RECEBEU 150 DE DANO\n");
                            Escolher1.setHp(Escolher1.getHp() + 150);
                            break;
                    }
                    Thread.sleep(2500);
                    break;
            }
        }
    }

    public void lutabot() throws InterruptedException {
        while(this.getY() == 3 && bot.getMana() < 3){
            this.setY();
        }
        if(this.getY() == 2 && bot.getMana() < 2){
            setY(1);
        }
        if(bot.getMana() == 0 && this.getY() > 0){
            setY(0);      
        }
//        while (bot.getMana() > 0 && this.getY() == 2 && this.getY() == 1){
//            this.setY();
//        }
        switch (this.getY()) {
            case 0:
                switch (a) {
                    case 1:
                        switch (x) {
                            case 1:
                                System.out.println("O BOT SE DEFENDEU E RECEBEU 50 DE DANO\n");
                                bot.setHp(bot.getHp() + 50);
                                bot.setMana(bot.getMana() + 1);
                                break;
                            case 2:
                                System.out.println("O BOT SE DEFENDEU E RECEBEU 100 DE DANO\n");
                                bot.setHp(bot.getHp() + 100);
                                bot.setMana(bot.getMana() + 1);
                                break;
                            case 3:
                                System.out.println("O BOT SE DEFENDEU RECEBEU 150 DE DANO\n");
                                bot.setHp(bot.getHp() + 150);
                                bot.setMana(bot.getMana() + 1);
                                break;
                        }
                        break;
//                    case 2:
//                        System.out.println("O BOT SE DEFENDEU E NAO RECEBEU NENHUM DANO\n");
                      // break;
                }
                break;
            case 1:
                Escolher1.setHp(Escolher1.getHp() - 100);
                bot.setMana(bot.getMana() - 1);
                System.out.println("o bot usou " + bot.getHb1() + " e deu " + bot.getD1() + " dano \n");
                break;
            case 2:
                Escolher1.setHp(Escolher1.getHp() - 200);
                bot.setMana(bot.getMana() - 2);
                System.out.println("o bot usou " + bot.getHb2() + " e deu " + bot.getD2() + " dano \n");
                break;
            case 3:
                Escolher1.setHp(Escolher1.getHp() - 300);
                bot.setMana(bot.getMana() - 3);
                System.out.println("o bot usou " + bot.getHb2() + " e deu " + bot.getD3() + " dano \n");
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

    public static void setY(int y) {
        Luta.y = y;
    }

    
    
}
