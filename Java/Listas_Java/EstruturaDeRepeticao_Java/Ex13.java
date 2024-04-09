// Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem.

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira dois números, base e expoente: ");
        int base = sc.nextInt();
        int expoente = sc.nextInt();
        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        System.out.println(resultado);
        sc.close();
    }
}