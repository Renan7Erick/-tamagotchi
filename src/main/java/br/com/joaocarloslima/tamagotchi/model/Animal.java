package br.com.joaocarloslima.tamagotchi.model;

public abstract class Animal {

    protected int energia;
    protected int fome;
    protected int felicidade;

    public Animal(int energia, int fome, int felicidade){
        this.energia = energia;
        this.fome = fome;
        this.felicidade = felicidade;

    }

    public Animal() {

    }

    public void maximo(){
        if(fome>100) fome=100;
        if(felicidade>100) felicidade =100;
        if(energia>100) energia=100;
    }

    public void minimo(){
        if(fome<0) fome=0;
        if(felicidade<0) felicidade =0;
        if(energia<0) energia=0;
    }

    public abstract void brincar();
    public abstract void comer();
    public abstract void dormir();
    public abstract void turno();


    public int getFome() {
        return fome;
    }


    public int getEnergia() {
        return energia;
    }


    public int getFelicidade() {
        return felicidade;
    }


}
