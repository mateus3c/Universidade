import java.util.Random;

// Superclasse "Animais".
public class Animais {
    // Protegeu o pacote "Random", para que o mesmo possa ser usado pela própria superclasse mas também por suas subclasses.
    protected Random rand = new Random();
    // Atributos que serão compartilhados por ambas subclasses, "Cao" e "Gato".
    public int indexNome;
    public int indexSaude;
    public int idade;
    // Construtor da superclasse "Animais".
    public Animais(String[] arrayNome, String[] arraySaude, int idadeMaxima) {
        this.indexNome = rand.nextInt(arrayNome.length  - 1);
        this.indexSaude = rand.nextInt(arraySaude.length - 1);
        this.idade = rand.nextInt(idadeMaxima);
    }

    // Métodos setter da superclasse "Animais".
    public void setIndexNome(int indexNome) {
        this.indexNome = indexNome;
    }
    public void setIndexSaude(int indexSaude) {
        this.indexSaude = indexSaude;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Métodos getters da superclasse "Animais".
    public int getIndexNome() {
        return indexNome;
    }
    public int getIndexSaude() {
        return indexSaude;
    }
    public int getIdade() {
        return idade;
    }
}


// Subclasse "Cao" da superclasse "Animais".
class Cao extends Animais {
    //Atributos únicos da subclasse "Cao".
    public int indexRacasCao;
    public int indexPortes;

    // Construtor da subclasse "Cao".
    public Cao(String[] arrayNome, String[] arraySaude, int idadeMaxima, String[] arrayRacasCao, String[] arrayPortes) {
        super(arrayNome, arraySaude, idadeMaxima); // Apesar de chamar o construtor da superclasse, nesse caso, os atributos da superclasse "Animais" não foram utilizados para nada em específico.
        this.indexRacasCao = rand.nextInt(arrayRacasCao.length - 1); // Determina que a raça escolhida será aquela que estiver no index sorteado. O index será um número aleatório entre 0 e a quantidade de termos dentro de "arrayRacasCao".
        this.indexPortes = rand.nextInt(arrayPortes.length - 1); // Determina que o porte escolhida será aquela que estiver no index sorteado. O index será um número aleatório entre 0 e a quantidade de termos dentro de "arrayPortes".
    }

    // Métodos setter da superclasse "Animais".
    public void setIndexRacasCao(int indexRacasCao) {
        this.indexRacasCao = indexRacasCao;
    }
    public void setIndexPortes(int indexPortes) {
        this.indexPortes = indexPortes;
    }

    // Métodos getters da superclasse "Animais".
    public int getIndexRacasCao() {
        return indexRacasCao;
    }
    public int getIndexPortes() {
        return indexPortes;
    }
}


// Subclasse "Gato" da superclasse "Animais".
class Gato extends Animais {
    // Atributos únicos da subclasse "Gato".
    public int indexRacasGato;
    public int indexPersonalidades;

    // Construtor da subclasse "Gato".
    public Gato(String[] arrayNome, String[] arraySaude, int idadeMaxima, String[] arrayRacasGato, String[] arrayPersonalidades) {
        super(arrayNome, arraySaude, idadeMaxima); // Apesar de chamar o construtor da superclasse, nesse caso, os atributos da superclasse "Animais" não foram utilizados para nada em específico.
        this.indexRacasGato = rand.nextInt(arrayRacasGato.length - 1); // Determina que a raça escolhida será aquela que estiver no index sorteado. O index será um número aleatório entre 0 e a quantidade de termos dentro de "arrayRacasGato".
        this.indexPersonalidades = rand.nextInt(arrayPersonalidades.length - 1); // Determina que a personalidade escolhida será aquela que estiver no index sorteado. O index será um número aleatório entre 0 e a quantidade de termos dentro de "arrayPersonalidades".
    }

    // Métodos setter da superclasse "Animais".
    public void setIndexRacasGato(int indexRacasGato) {
        this.indexRacasGato = indexRacasGato;
    }
    public void setIndexPersonalidades(int indexPersonalidades) {
        this.indexPersonalidades = indexPersonalidades;
    }

    // Métodos getters da superclasse "Animais".
    public int getIndexRacasGato() {
        return indexRacasGato;
    }
    public int getIndexPersonalidades() {
        return indexPersonalidades;
    }
}


