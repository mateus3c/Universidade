//Escreva um programa em java que preencha um vetor com 20 números inteiros aleatórios entre 1 e 30 e depois verifique se o número 25 existe neste vetor.

import java.util.ArrayList;
import java.util.Random;

public class Ex04 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            lista.add(random.nextInt(30) + 1);
        }
        System.out.println("Sequência: ");
        System.out.println(lista);
        int indice = lista.indexOf(25);
        if (indice != -1) {
            System.out.println("\nO número 25 foi encontrado no índice " + indice + " da sequência.");
        } else {
            System.out.println("\nO número 25 não foi encontrado na sequência.");
        }
    }
}
