import java.util.Random;

public class Animais {
    protected Random rand = new Random();
    public int indexNome;
    public int indexSaude;
    public int idade;

    public Animais(String[] arrayNome, String[] arraySaude, int idadeMaxima) {
        this.indexNome = rand.nextInt(arrayNome.length);
        this.indexSaude = rand.nextInt(arraySaude.length);
        this.idade = rand.nextInt(idadeMaxima);

    }

    // Getter para indexNome
    public int getIndexNome() {
        return indexNome;
    }
    // Setter para indexNome
    public void setIndexNome(int indexNome) {
        this.indexNome = indexNome;
    }
    // Getter para indexSaude
    public int getIndexSaude() {
        return indexSaude;
    }
    // Setter para indexSaude
    public void setIndexSaude(int indexSaude) {
        this.indexSaude = indexSaude;
    }
    // Getter para idade
    public int getIdade() {
        return idade;
    }
    // Setter para idade
    public void setIdade(int idade) {
        this.idade = idade;
    }
}

class Cao extends Animais {
    public int indexRacasCao;
    public int indexPortes;

    public Cao(String[] arrayNome, String[] arraySaude, int idadeMaxima, String[] arrayRacasCao, String[] arrayPortes) {
        super(arrayNome, arraySaude, idadeMaxima);
        this.indexRacasCao = rand.nextInt(arrayRacasCao.length);
        this.indexPortes = rand.nextInt(arrayPortes.length);
    }

    // Getter para indexRacasCao
    public int getIndexRacasCao() {
        return indexRacasCao;
    }
    // Setter para indexRacasCao
    public void setIndexRacasCao(int indexRacasCao) {
        this.indexRacasCao = indexRacasCao;
    }
    // Getter para indexPortes
    public int getIndexPortes() {
        return indexPortes;
    }
    // Setter para indexPortes
    public void setIndexPortes(int indexPortes) {
        this.indexPortes = indexPortes;
    }
}


class Gato extends Animais {
    public int indexRacasGato;
    public int indexPersonalidades;

    public Gato(String[] arrayNome, String[] arraySaude, int idadeMaxima, String[] arrayRacasGato, String[] arrayPersonalidades) {
        super(arrayNome, arraySaude, idadeMaxima);
        this.indexRacasGato = rand.nextInt(arrayRacasGato.length);
        this.indexPersonalidades = rand.nextInt(arrayPersonalidades.length);
    }
    // Getter para indexRacasGato
    public int getIndexRacasGato() {
        return indexRacasGato;
    }
    // Setter para indexRacasGato
    public void setIndexRacasGato(int indexRacasGato) {
        this.indexRacasGato = indexRacasGato;
    }
    // Getter para indexPersonalidades
    public int getIndexPersonalidades() {
        return indexPersonalidades;
    }
    // Setter para indexPersonalidades
    public void setIndexPersonalidades(int indexPersonalidades) {
        this.indexPersonalidades = indexPersonalidades;
    }
}


