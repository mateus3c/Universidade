// Implemente a classe Operario como subclasse da classe Empregado. Um determinado operário tem como atributos, para além dos atributos da classe Pessoa e da classe Empregado, o atributo valorProducao (que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário) e comissao (que corresponde à porcentagem do valorProducao que será adicionado ao vencimento base do operário). Note que deverá redefinir nesta subclasse o método herdado calcularSalario (o salário de um operário é equivalente ao salário de um empregado usual acrescido da referida comissão). Escreva um programa de teste adequado para esta classe.

package Ex06;

public class Main {
    public static void main(String[] args) {
        // Instâncias da classe "Pessoa" e "Vendedor".
        Pessoa pessoa = new Pessoa("João", "Rua A, 123", "498297618");
        Vendedor vendedor = new Vendedor("Maria", "Rua B, 456", "563924332", 3842.26, 3.65, 7, 46.41, 11.97);

        // Exibe informações da pessoa
        System.out.println("Informações da Pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());

        // Exibe informações do vendedor
        System.out.println("\nInformações do Vendedor:");
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Código do Setor: " + vendedor.getCodigoSetor());
        System.out.printf("Salário Base:  %.2fR$", vendedor.getSalarioBase());
        System.out.printf("\nImposto: %.2f%%", vendedor.getImposto());
        System.out.printf("\nValor de Vendas:  %.2fR$", vendedor.getValorVendas());
        System.out.printf("\nComissão:  %.2f%%", vendedor.getComissao());
        System.out.printf("\nSalário Final:  %.2fR$", vendedor.calcularSalario());
    }
}
