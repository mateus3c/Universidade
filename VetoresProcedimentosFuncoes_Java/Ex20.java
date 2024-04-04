//Em um sistema de classificação de produtos, é necessário ordenar os produtos por preço. Escreva um programa que leia os preços de 10 produtos e, em seguida, ordene esses preços em ordem crescente e imprima o vetor ordenado.

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> preco = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            System.out.printf("Insira o preço do produto %s: ", i + 1);
            preco.add(sc.nextInt());
        }
        Collections.sort(preco);
        System.out.print("\nPreços ordenados: ");
        for (int i = 0; i < preco.size(); i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(preco.get(i));
        }
        sc.close();
    }
}
