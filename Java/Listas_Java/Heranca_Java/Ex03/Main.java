// Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada instância da classe Empregado tem, para além dos atributos que caracterizam a classe Pessoa, os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem retida dos impostos). Implemente a classe Empregado com métodos seletores e modificadores e um método calcularSalario. Escreva um programa de teste adequado para a classe Empregado.

package Ex03;

public class Main {
    public static void main(String[] args) {
        // Instâncias da classe "Pessoa" e "Empregado".
        Pessoa pessoa = new Pessoa("João", "Rua A, 123", "123456789");
        Empregado empregado = new Empregado("Ana", "Rua E, 1213", "352323371", 4042.55, 9.88, 2);

        // Exibe informações da pessoa
        System.out.println("Informações da Pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());

        // Exibe informações do empregado
        System.out.println("\nInformações do Empregado:");
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Código do Setor: " + empregado.getCodigoSetor());
        System.out.printf("Salário Base:  %.2fR$", empregado.getSalarioBase());
        System.out.printf("\nImposto: %.2f%%", empregado.getImposto());
        System.out.printf("\nSalário Final:  %.2fR$", empregado.calcularSalario());
    }
}
