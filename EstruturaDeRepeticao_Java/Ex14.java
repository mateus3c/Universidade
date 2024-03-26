// Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadeNumerosPares = 0;
        int quantidadeNumerosImpares = 0;
        System.out.println("Insira 10 números inteiros separados por espaço: ");
        String numeros = sc.nextLine();
        String[] numerosSeparados = numeros.split(" ");
        for (int i = 0; i < 10; i++) {
            int numero = Integer.parseInt(numerosSeparados[i]);
            if (numero % 2 == 0) {
                quantidadeNumerosPares++;
                System.out.println("Par: " + numero);
            } else {
                quantidadeNumerosImpares++;
                System.out.println("Impar: " + numero);
            }
        }
        System.out.println("\nQuantidade de números pares: " + quantidadeNumerosPares);
        System.out.println("Quantidade de números impares: " + quantidadeNumerosImpares);
        sc.close();
    }
}

