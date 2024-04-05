//Escreva um programa em java que preencha um vetor com 15 números inteiros aleatórios entre 1 e 50. Verifique se o número 20 existe nesse vetor e retorne seu índice caso ele exista.

import java.util.ArrayList;
import java.util.Random;

public class Ex05 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<>(15);
        for (int i = 0; i < 15; i++) {
            lista.add(random.nextInt(50) + 1);
        }
        System.out.println("Sequência: ");
        System.out.println(lista);
        int indice = lista.indexOf(20);
        if (indice != -1) {
            System.out.println("\nO número 20 foi encontrado no índice " + indice + " da sequência.");
        } else {
            System.out.println("\nO número 20 não foi encontrado na sequência.");
        }
    }
}
