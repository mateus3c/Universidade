import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
        System.out.println("Insira uma nota entre zero e dez.");
        int nota = sc.nextInt();
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Insira outra.");
        } else {
            System.out.println("Nota inserida: " + nota);
            break;
        }
    }
    }
}