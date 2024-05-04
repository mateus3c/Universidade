// Implemente a classe Operario como subclasse da classe Empregado. Um determinado operário tem como atributos, para além dos atributos da classe Pessoa e da classe Empregado, o atributo valorProducao (que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário) e comissao (que corresponde à porcentagem do valorProducao que será adicionado ao vencimento base do operário). Note que deverá redefinir nesta subclasse o método herdado calcularSalario (o salário de um operário é equivalente ao salário de um empregado usual acrescido da referida comissão). Escreva um programa de teste adequado para esta classe.

package Ex05;

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
        return salarioBase - (salarioBase * (imposto / 100));
    }
}

class Operario extends Empregado {
    private double valorProducao, comissao;

    // Construtor padrão.
    public Operario() {
        this.valorProducao = 0;
        this.comissao = 0;
    }

    // Construtor com parâmetros.
    public Operario(String nome, String endereco, String telefone, double salarioBase, double imposto, int codigoSetor, double valorProducao, double comissao) {
        super(nome, endereco, telefone, salarioBase, imposto, codigoSetor);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    // Setters.
    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    // Getters.
    public double getValorProducao() {
        return valorProducao;
    }
    public double getComissao() {
        return comissao;
    }

    // Método para obter o valor final do salário do operário.
    @Override
    public double calcularSalario() {
        return getSalarioBase() - (getSalarioBase() * (getImposto() / 100)) + (valorProducao * (comissao / 100));
    }
}

