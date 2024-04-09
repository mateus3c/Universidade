//Durante a verificação de estoque, é necessário identificar a presença de determinados produtos. Crie um programa que solicite ao usuário inserir um código de produto e, em seguida, verifique se esse código está presente em um vetor pré-definido.
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] codigoProdutos = {"001", "002", "003", "004", "005"};
        boolean encontrado = false;
        System.out.print("Digite o código do produto (001 - 010): ");
        String codigoInserido = sc.nextLine();
        for (String codigo : codigoProdutos) {
            if (codigo.equals(codigoInserido)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Produto presente no estoque.");
        } else {
            System.out.println("Produto ausente no estoque.");
        }
        sc.close();
    }
}
