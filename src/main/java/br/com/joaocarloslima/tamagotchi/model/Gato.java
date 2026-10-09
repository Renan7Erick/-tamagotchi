package br.com.joaocarloslima.tamagotchi.model;

public class Gato extends Animal{

    public Gato(int energia, int fome, int felicidade){
        super(energia, fome, felicidade);

    }

    public Gato(){

    }

    @Override
    public void brincar() {
        felicidade = getFelicidade()+10;
        energia = getEnergia()-5;
        fome = getFome()+5;
        maximo();
        minimo();

    }

    @Override
    public void comer() {

        fome-=15;
        energia+=10;
        maximo();
        minimo();

    }

    @Override
    public void dormir() {

        energia+=20;
        fome+=5;
        maximo();
        minimo();

    }

    @Override
    public void turno() {
        energia-=5;
        fome+=5;
        felicidade-=3;
        maximo();
        minimo();

    }

}
