//Crie um programa que irá gerar um vetor A com 15 números inteiros e depois crie um vetor B que será a cópia do vetor A de forma reversa.

public class Ex08 {
    public static void main(String[] args) {
        int[] vetorA = new int[15];
        int[] vetorB = new int[15];
        for (int i = 0 ; i < 15 ; i++) {
            vetorA[i] = i + 1;
        }
        for (int i = 0 ; i < 15 ; i++) {
            vetorB[i] = vetorA[14 - i];
        }
        System.out.print("Vetor A: ");
        for (int i = 0 ; i < 15 ; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.print("\nVetor B: ");
        for (int i = 0 ; i < 15 ; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}