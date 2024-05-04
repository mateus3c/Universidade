// Implemente a classe Administrador como subclasse da classe Empregado. Um determinado administrador tem como atributos, para além dos atributos da classe Pessoa e da classe Empregado, o atributo ajudaDeCusto (ajudas referentes a viagens, estadias, ...). Note que deverá redefinir na classe Administrador o método herdado calcularSalario (o salário de um administrador é equivalente ao salário de um empregado usual acrescido das ajuda de custo). Escreva um programa de teste adequado para esta classe.

package Ex04;

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

    // Método para obter o valor final do salário do empregado.
    public double calcularSalario() {
        return  salarioBase - (salarioBase * (imposto/100));
    }
}

class Administrador extends Empregado {
    private double ajudaDeCusto;

    // Construtor padrão.
    public Administrador() {
        this.ajudaDeCusto = 0;
    }
    // Construtor com parâmetros.
    public Administrador(String nome, String endereco, String telefone, double salarioBase, double imposto, int codigoSetor, double ajudaDeCusto) {
        super(nome, endereco, telefone, salarioBase, imposto, codigoSetor);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // Setters.
    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // Getters.
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    // Método para obter o valor final do salário do administrador.
    @Override
    public double calcularSalario() {
        return  getSalarioBase() - (getSalarioBase() * (getImposto()/100)) + ajudaDeCusto;
    }
}

