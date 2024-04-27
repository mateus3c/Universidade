package Todos;

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
        return salarioBase - (salarioBase * (imposto / 100));
    }
}

class Fornecedor extends Pessoa {
    private double valorCredito, valorDivida, valorSaldo;

    // Construtor padrão.
    public Fornecedor() {
        this.valorCredito = 0;
        this.valorDivida = 0;
        this.valorSaldo = 0;
    }
    // Construtor com parâmetros.
    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida, double valorSaldo) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
        this.valorSaldo = valorSaldo;
    }

    // Construtor único ("nome", "endereço", "telefone", "valorCredito" e "valorDivida").
    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    // Setters.
    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }
    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    public void setValorSaldo(double valorSaldo) {
        this.valorSaldo = valorSaldo;
    }

    // Getters.
    public double getValorCredito() {
        return valorCredito;
    }
    public double getValorDivida() {
        return valorDivida;
    }
    public double getValorSaldo() {
        return valorSaldo;
    }

    // Método para obter o saldo a partir da diferença entre os valores de "dívida" e "crédito".
    public double obterSaldo() {
        return  valorCredito - valorDivida;
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

    // Método para obter o valor final do sálario do administrador.
    @Override
    public double calcularSalario() {
        return  getSalarioBase() - (getSalarioBase() * (getImposto()/100)) + ajudaDeCusto;
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

    // Método para obter o valor final do sálario do operário.
    @Override
    public double calcularSalario() {
        return getSalarioBase() - (getSalarioBase() * (getImposto() / 100)) + (valorProducao * (comissao / 100));
    }
}

class Vendedor extends Empregado {
    private double valorVendas, comissao;

    // Construtor padrão.
    public Vendedor() {
        this.valorVendas = 0;
        this.comissao = 0;
    }

    // Construtor com parâmetros.
    public Vendedor(String nome, String endereco, String telefone, double salarioBase, double imposto, int codigoSetor, double valorVendas, double comissao) {
        super(nome, endereco, telefone, salarioBase, imposto, codigoSetor);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    // Setters.
    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    // Getters.
    public double getValorVendas() {
        return valorVendas;
    }
    public double getComissao() {
        return comissao;
    }

    // Método para obter o valor final do sálario do operário.
    @Override
    public double calcularSalario() {
        return getSalarioBase() - (getSalarioBase() * (getImposto() / 100)) + (valorVendas * (comissao / 100));
    }
}

