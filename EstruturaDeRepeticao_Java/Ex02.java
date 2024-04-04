// Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
        System.out.print("Insira o nome do usuário: ");
        String nome = sc.nextLine();
        System.out.print("Insira a senha do usuário: ");
        String senha = sc.nextLine();
        if (nome.equals(senha)) {
            System.out.println("Erro: A senha deve ser diferente do nome.");
        } else {
            System.out.println("Nome do usuário: " + nome + "\nSenha do usuário: " + senha);
            break;
        }
    }
        sc.close();
    }
}