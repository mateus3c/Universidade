// Cria uma Class Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters) e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas opções de construtores conforme sua percepção. Atributos: String nome; String endereço; String telefone;

package Ex01;

public class Pessoa {
    private String nome, endereco, telefone;

    // Construtor padrão.
    public Pessoa() {
        this.nome = "";
        this.endereco = "";
        this.telefone = "";
    }
    // Construtor com parâmetros.
    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    // Construtor único ("nome" e "telefone").
    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.endereco = "";
        this.telefone = telefone;
    }

    // Setters.
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Getters.
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getTelefone() {
        return telefone;
    }
}
