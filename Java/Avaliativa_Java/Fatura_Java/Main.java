import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite o ID do item: ");
    int id = sc.nextInt();
    sc.nextLine();
    System.out.print("Digite a descrição do item: ");
    String descricao = sc.nextLine();
    System.out.print("Digite a quantidade do item: ");
    int quantidade = sc.nextInt();
    sc.nextLine();
    System.out.print("Digite o preço do item: R$  ");
    float preco = sc.nextFloat();
    sc.nextLine();
    
    Fatura fatura = new Fatura(id, descricao, quantidade, preco);
    fatura.chamar_calcular_valor_fatura();
    
    System.out.println("\nID: " + fatura.getId());
    System.out.println("Descrição: " + fatura.getDescricao());
    System.out.println("Quantidade: " + fatura.getQuantidade());
    System.out.printf("Preço (unidade): %.2fR$", fatura.getPreco());
    System.out.printf("\nValor: %.2fR$", fatura.getValor());
    sc.close();
  }
}