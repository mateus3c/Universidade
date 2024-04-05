//Faça um programa que preencha dois vetores de dez elementos numéricos cada um e mostre o vetor resultante da intercalação deles.

import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] intercalado = new int[20];
        for (int i = 0; i < 10; i++) {
            vetorA[i] = random.nextInt(100) + 1;
            vetorB[i] = random.nextInt(100) + 1;
        }
        for (int i = 0; i < 10; i++) {
            intercalado[i] = vetorA[i];
            intercalado[i + 10] = vetorB[i];
        }
        System.out.println("Vetor A: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("\nVetor B: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println("\nIntercalado: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(intercalado[i] + " ");
        }
    }
}
