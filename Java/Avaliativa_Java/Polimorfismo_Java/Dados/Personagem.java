package Dados;

public class Personagem {
    private String nome;
    private String nomeVidaReal;
    private Superpoder[] poderes = new Superpoder[4];

    public Personagem(String nome, String nomeVidaReal) {
        this.nome = nome;
        this.nomeVidaReal = nomeVidaReal;
    }

    public void adicionaSuperpoder(Superpoder sp) {
        for (int i = 0; i < 3; i++) {
            if (poderes[i] == null) {
                poderes[i] = sp;
                break;
            }
        }
    }

    public int getPoderTotal() {
        int poderTotal = 0;
        for (Superpoder sp : poderes) {
            if (sp != null) {
                poderTotal += sp.getCategoria();
            }
        }
        return poderTotal;
    }
}

