package br.com.joaocarloslima.tamagotchi.model;

public class Dragao extends Animal {

    public Dragao(int energia, int fome, int felicidade){
        super(energia, fome, felicidade);

    }

    public Dragao() {
        super();
    }

    @Override
    public void brincar() {
        felicidade +=12;
        energia -=15;
        fome +=15;
        maximo();
        minimo();

    }

    @Override
    public void comer() {

        fome-=30;
        energia+=20;
        maximo();
        minimo();

    }

    @Override
    public void dormir() {

        energia+=10;
        fome+=10;
        maximo();
        minimo();

    }

    @Override
    public void turno() {
        energia-=15;
        fome+=10;
        felicidade-=7;
        maximo();
        minimo();

    }


}
