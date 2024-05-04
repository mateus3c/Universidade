package Dados;

public class Vilao extends Personagem {
    private int tempoDePrisao;

    public Vilao(String nome, String nomeVidaReal, int tempoDePrisao) {
        super(nome, nomeVidaReal);
        this.tempoDePrisao = tempoDePrisao;
    }

    @Override
    public int getPoderTotal() {
        int poderTotal = super.getPoderTotal();
        poderTotal = (int) (poderTotal * 1.1);
        return poderTotal;
    }
}
