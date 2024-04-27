package Todos;

public class Main {
    public static void main(String[] args) {
        // Instâncias das classes "Pessoa", "Fornecedor", "Empregado", "Administrador", "Operario" e "Vendedor".
        Pessoa pessoa = new Pessoa("João", "Rua A, 123", "498297618");
        Fornecedor fornecedor = new Fornecedor("Mariana", "Rua F, 1415", "786752314", 3420.91, 8849.33);
        Empregado empregado = new Empregado("Ana", "Rua E, 1213", "352323371", 4042.55, 9.88, 2);
        Administrador administrador = new Administrador("Carlos", "Rua D, 1011", "626467558", 1935.71, 6.34, 4, 79.99);
        Operario operario = new Operario("José", "Rua C, 789", "228465717", 4125.82, 8.53, 1, 94.52, 32.27);
        Vendedor vendedor = new Vendedor("Maria", "Rua B, 456", "563924332", 3842.26, 3.65, 7, 46.41, 11.97);

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

        // Exibe informações do empregado
        System.out.println("\n\nInformações do Empregado:");
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Código do Setor: " + empregado.getCodigoSetor());
        System.out.printf("Salário Base:  %.2fR$", empregado.getSalarioBase());
        System.out.printf("\nImposto: %.2f%%", empregado.getImposto());
        System.out.printf("\nSalário Final:  %.2fR$", empregado.calcularSalario());

        // Exibe informações do administrador
        System.out.println("\n\nInformações do Administrador:");
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Código do Setor: " + administrador.getCodigoSetor());
        System.out.printf("Salário Base:  %.2fR$", administrador.getSalarioBase());
        System.out.printf("\nImposto: %.2f%%", administrador.getImposto());
        System.out.printf("\nAjuda de Custo:  %.2fR$", administrador.getAjudaDeCusto());
        System.out.printf("\nSalário Final:  %.2fR$", administrador.calcularSalario());

        // Exibe informações do operário
        System.out.println("\n\nInformações do Operário:");
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Código do Setor: " + operario.getCodigoSetor());
        System.out.printf("Salário Base:  %.2fR$", operario.getSalarioBase());
        System.out.printf("\nImposto: %.2f%%", operario.getImposto());
        System.out.printf("\nValor de Produção:  %.2fR$", operario.getValorProducao());
        System.out.printf("\nComissão:  %.2f%%", operario.getComissao());
        System.out.printf("\nSalário Final:  %.2fR$", operario.calcularSalario());

        // Exibe informações do vendedor
        System.out.println("\n\nInformações do Vendedor:");
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
