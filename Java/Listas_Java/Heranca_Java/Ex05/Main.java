// Implemente a classe Operario como subclasse da classe Empregado. Um determinado operário tem como atributos, para além dos atributos da classe Pessoa e da classe Empregado, o atributo valorProducao (que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário) e comissao (que corresponde à porcentagem do valorProducao que será adicionado ao vencimento base do operário). Note que deverá redefinir nesta subclasse o método herdado calcularSalario (o salário de um operário é equivalente ao salário de um empregado usual acrescido da referida comissão). Escreva um programa de teste adequado para esta classe.

package Ex05;

public class Main {
    public static void main(String[] args) {
        // Instâncias da classe "Pessoa" e "Operario".
        Pessoa pessoa = new Pessoa("João", "Rua A, 123", "498297618");
        Operario operario = new Operario("José", "Rua C, 789", "228465717", 4125.82, 8.53, 1, 94.52, 32.27);

        // Exibe informações da pessoa
        System.out.println("Informações da Pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());

        // Exibe informações do operário
        System.out.println("\nInformações do Operário:");
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Código do Setor: " + operario.getCodigoSetor());
        System.out.printf("Salário Base:  %.2fR$", operario.getSalarioBase());
        System.out.printf("\nImposto: %.2f%%", operario.getImposto());
        System.out.printf("\nValor de Produção:  %.2fR$", operario.getValorProducao());
        System.out.printf("\nComissão:  %.2f%%", operario.getComissao());
        System.out.printf("\nSalário Final:  %.2fR$", operario.calcularSalario());
    }
}
