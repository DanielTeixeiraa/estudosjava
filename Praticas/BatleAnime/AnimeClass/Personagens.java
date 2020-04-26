package curso.exercicio.BatleAnime.AnimeClass;

import java.util.Arrays;

public class Personagens {
    public Luta luta;
    public int id;
    public String nome;
    public int idade;
    public String anime;
    public String hb1;
    public String hb3;
    public String hb2;
    public int d1;
    public int d2;
    public int d3;
    public int força;
    public int defesa;
    public int mana;
    public int hp;

    public Personagens(String nome, int idade, String anime, int d1,int d2,int d3, int força, int defesa, int mana, int hp) {
        this.nome = nome;
        this.idade = idade;
        this.anime = anime;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.força = força;
        this.defesa = defesa;
        this.mana = mana;
        this.hp = hp;
    }
    
    public void apresentacao(){
            System.out.println("NOME: " +this.nome);
            System.out.println("IDADE: " +this.idade);
            System.out.println("ANIME "+ this.anime);
            System.out.println("HP "+ this.hp);
            System.out.println("FORÇA "+ this.força);
            System.out.println("DEFESA "+ this.defesa);
            System.out.println("MANA "+ this.mana);
            System.out.println("----------HABILIDADES----------");
            System.out.println(this.hb1 +" DANO: " + this.d1 );
            System.out.println(this.hb2 +" DANO: " + this.d2 );
            System.out.println(this.hb3 +" DANO: " + this.d3 );
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        this.setHb1(hb1);
        this.setHb2(hb2);
        this.setHb3(hb3);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAnime() {
        return anime;
    }

    public void setAnime(String anime) {
        this.anime = anime;
    }

    public String getHb1() {
        return hb1;
    }

    public void setHb1(String hb1) {
        if(this.getId()==0){
        this.hb1 = "Gomu Gomu no Pistol";
        }
        if(this.getId()==1){
        this.hb1 = "KAMER";
        }
        
    }
    public String getHb2() {
        return hb2;
    }

    public void setHb2(String hb2) {
        if(this.getId()==0){
        this.hb2 = "Gomu Gomu no Gatling";
    }
        if(this.getId()==1){
        this.hb2 = "KAIO";
    }
    }
    
    public String getHb3() {
        return hb3;
    }

    public void setHb3(String hb3) {
        if(this.getId()==0){
        this.hb3 = "Gomu Gomu no Bazooka";
    }
        if(this.getId()==1){
        this.hb3 = "RAI";
    }
    }


    public int getD1() {
        return d1;
    }

    public void setD1(int d1) {
        this.d1 = d1;
    }

    public int getD2() {
        return d2;
    }

    public void setD2(int d2) {
        this.d2 = d2;
    }

    public int getD3() {
        return d3;
    }

    public void setD3(int d3) {
        this.d3 = d3;
    }

    public int getForça() {
        return força;
    }

    public void setForça(int força) {
        this.força = força;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }



    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    

    
    
    
    
    
}