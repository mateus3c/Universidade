//Escreva um programa em java que crie um vetor com 10 números inteiros aleatórios e depois calcule a média dos elementos deste vetor.

import java.util.Random;

public class Ex03 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[10];
        double soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
            soma += numeros[i];
        }
        double media = soma / numeros.length;
        System.out.println("A media dos elementos do vetor é: " + media);
    }
}
