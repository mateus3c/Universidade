//Em uma escola, os professores precisam ensinar a tabuada aos alunos. Crie um programa que peça ao usuário inserir um número inteiro correspondente à tabuada desejada e, em seguida, imprima a tabuada desse número até 10.

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira qualquer número para saber a sua tabuada: ");
        int numero = sc.nextInt();
            System.out.println("Tabuada de " + numero + ": ");
            System.out.println(numero + " X 1 = " + (numero));
            System.out.println(numero + " X 2 = " + (numero * 2));
            System.out.println(numero + " X 3 = " + (numero * 3));
            System.out.println(numero + " X 4 = " + (numero * 4));
            System.out.println(numero + " X 5 = " + (numero * 5));
            System.out.println(numero + " X 6 = " + (numero * 6));
            System.out.println(numero + " X 7 = " + (numero * 7));
            System.out.println(numero + " X 8 = " + (numero * 8));
            System.out.println(numero + " X 9 = " + (numero * 9));
            System.out.println(numero + " X 10 = " + (numero * 10));
            sc.close();
    }
}