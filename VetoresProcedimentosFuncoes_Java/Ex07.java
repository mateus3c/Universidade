//Crie um programa em java para instanciar um vetor de 5 posições de números decimais e encontre o maior valor e o menor valor deste um

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor para a posição " + (i + 1) + ": ");
            vetor[i] = sc.nextDouble();
        }
        double maior = vetor[0];
        double menor = vetor[0];
        for (int i = 1; i < 5; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.println("O maior valor no vetor é: " + maior);
        System.out.println("O menor valor no vetor é: " + menor);
        sc.close();
    }
}
