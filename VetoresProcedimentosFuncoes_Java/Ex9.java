
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadeRecibos = 0;
        System.out.print("Insira a quantidade desejada de recibos: ");
        int numero = sc.nextInt();
        while (quantidadeRecibos != numero) {
            System.out.println("Recibo " + (quantidadeRecibos + 1));
            quantidadeRecibos++;
        }
        sc.close();
    }
}