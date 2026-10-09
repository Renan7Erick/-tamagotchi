package br.com.joaocarloslima.tamagotchi.model;

public class Cachorro extends Animal {

    public Cachorro(int energia, int fome, int felicidade){
        super(energia, fome, felicidade);

    }

    public Cachorro() {

    }

    @Override
    public void brincar() {
        felicidade +=10;
        energia -=10;
        fome +=10;
        maximo();
        minimo();

    }

    @Override
    public void comer() {

        fome-=20;
        energia+=15;
        maximo();
        minimo();

    }

    @Override
    public void dormir() {

        energia+=15;
        fome+=10;
        maximo();
        minimo();

    }

    @Override
    public void turno() {
        energia-=10;
        fome+=10;
        felicidade-=5;
        maximo();
        minimo();

    }


}

