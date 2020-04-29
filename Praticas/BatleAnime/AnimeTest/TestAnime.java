package curso.exercicio.BatleAnime.AnimeTest;
import curso.exercicio.BatleAnime.AnimeClass.Bots;
import java.util.Scanner;
import curso.exercicio.BatleAnime.AnimeClass.Luta;
import curso.exercicio.BatleAnime.AnimeClass.Personagens;

public class TestAnime {
    public static void main(String[] args) throws InterruptedException {
        
        Scanner scan = new Scanner(System.in);
        Luta luta = new Luta();
        Personagens Luffy = new Personagens("Luffy",19,"One Piece",100,200,300,10,10,5,1000);
        Luffy.setId(0);
        Personagens Goku = new Personagens("Goku",22,"DBZ",100,200,300,10,10,10,1000);
        Goku.setId(1);
        Bots luffy = new Bots("Luffy",19,"One Piece",100,200,300,10,10,10,1000);
        luffy.setId(0);
        Bots goku = new Bots("Goku",22,"DBZ",100,200,300,10,10,10,1000);
        goku.setId(1);
        luta.setPersonagem(new Personagens[]{Luffy,Goku});
        luta.setBots(new Bots[]{luffy,goku});
        
        luta.escolher();
}
}