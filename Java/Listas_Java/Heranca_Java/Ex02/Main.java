// Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe Fornecedor. Considere que cada instância da classe Fornecedor tem, para além dos atributos que caracterizam a classe Pessoa, os atributos valorCredito (correspondente ao crédito máximo atribuído ao fornecedor) e valorDivida (montante da dívida para com o fornecedor). Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores, um método obterSaldo() que devolve a diferença entre os valores dos atributos valorCredito e valorDivida. Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe permita verificar o funcionamento dos métodos implementados na classe Fornecedor e os herdados da classe Pessoa.

package Ex02;

public class Main {
    public static void main(String[] args) {
        // Instâncias da classe "Pessoa" e "Fornecedor".
        Pessoa pessoa = new Pessoa("João", "Rua A, 123", "123456789");
        Fornecedor fornecedor = new Fornecedor("Mariana", "Rua F, 1415", "786752314", 3420.91, 8849.33);

        // Exibe informações da pessoa
        System.out.println("Informações da Pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());

        // Exibe informações do fornecedor
        System.out.println("\nInformações do Fornecedor:");
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.printf("Valor do Crédito:  %.2fR$", fornecedor.getValorCredito());
        System.out.printf("\nValor da Dívida:  %.2fR$", fornecedor.getValorDivida());
        System.out.printf("\nSaldo:  %.2fR$", fornecedor.obterSaldo());
    }
}
