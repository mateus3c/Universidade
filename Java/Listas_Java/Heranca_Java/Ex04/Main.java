// Implemente a classe Administrador como subclasse da classe Empregado. Um determinado administrador tem como atributos, para além dos atributos da classe Pessoa e da classe Empregado, o atributo ajudaDeCusto (ajudas referentes a viagens, estadias, ...). Note que deverá redefinir na classe Administrador o método herdado calcularSalario (o salário de um administrador é equivalente ao salário de um empregado usual acrescido das ajuda de custo). Escreva um programa de teste adequado para esta classe.

package Ex04;

public class Main {
    public static void main(String[] args) {
        // Instâncias da classe "Pessoa" e "Administrador".
        Pessoa pessoa = new Pessoa("João", "Rua A, 123", "498297618");
        Administrador administrador = new Administrador("Carlos", "Rua D, 1011", "626467558", 1935.71, 6.34, 4, 79.99);

        // Exibe informações da pessoa
        System.out.println("Informações da Pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());

        // Exibe informações do administrador
        System.out.println("\nInformações do Administrador:");
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Código do Setor: " + administrador.getCodigoSetor());
        System.out.printf("Salário Base:  %.2fR$", administrador.getSalarioBase());
        System.out.printf("\nImposto: %.2f%%", administrador.getImposto());
        System.out.printf("\nAjuda de Custo:  %.2fR$", administrador.getAjudaDeCusto());
        System.out.printf("\nSalário Final:  %.2fR$", administrador.calcularSalario());
    }
}
