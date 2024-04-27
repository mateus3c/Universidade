// Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada instância da classe Empregado tem, para além dos atributos que caracterizam a classe Pessoa, os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem retida dos impostos). Implemente a classe Empregado com métodos seletores e modificadores e um método calcularSalario. Escreva um programa de teste adequado para a classe Empregado.

package Ex03;

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

class Empregado extends Pessoa {
    private double salarioBase, imposto;
    private int codigoSetor;

    // Construtor padrão.
    public Empregado() {
        this.salarioBase = 0;
        this.imposto = 0;
        this.codigoSetor = 0;
    }
    // Construtor com parâmetros.
    public Empregado(String nome, String endereco, String telefone, double salarioBase, double imposto, int codigoSetor) {
        super(nome, endereco, telefone);
        this.salarioBase = salarioBase;
        this.imposto = imposto;
        this.codigoSetor = codigoSetor;
    }

    // Setters.
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    // Getters.
    public double getSalarioBase() {
        return salarioBase;
    }
    public double getImposto() {
        return imposto;
    }
    public int getCodigoSetor() {
        return codigoSetor;
    }

    // Método para obter o valor final do sálario do empregado.
    public double calcularSalario() {
        return  salarioBase - (salarioBase * (imposto/100));
    }
}

