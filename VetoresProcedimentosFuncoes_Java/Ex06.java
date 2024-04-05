//Escreva um programa em java que preencha um vetor com 30 números inteiros aleatórios entre 1 e 100. Peça ao usuário para digitar um valor, verifique se este valor existe no vetor e remova ele do vetor.

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<>(30);
        for (int i = 0; i < 30; i++) {
            lista.add(random.nextInt(100) + 1);
        }
        System.out.println("Sequência: ");
        System.out.println(lista);
        System.out.print("\nInsira um número: ");
        int valor = sc.nextInt();
        if (lista.remove(Integer.valueOf(valor))) {
            System.out.println("\nSequência: ");
            System.out.println(lista);
        } else {
            System.out.println("Sequência: ");
            System.out.println(lista);
        }
        sc.close();
    }
}
