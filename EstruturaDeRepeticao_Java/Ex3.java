import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
        System.out.println("Insira o nome do usuário: ");
        String nome = sc.nextLine();
        System.out.println("Insira a senha do usuário: ");
        String senha = sc.nextLine();
        if (nome.equals(senha)) {
            System.out.println("Error: A senha deve ser diferente do nome.");
        } else {
            System.out.println("Nome do usuário: " + nome + "\nSenha do usuário: " + senha);
            break;
        }
    }
    }
}