//Faça um programa que preencha um vetor com dez números inteiros, calcule e mostre os números primos e suas respectivas posições.

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Insira um número: ");
            numeros[i] = sc.nextInt();
            boolean primo = true;
            if (numeros[i] <= 1) {
                primo = false;
            }
            for (int j = 2; j <= Math.sqrt(numeros[i]); j++) {
                if (numeros[i] % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(numeros[i] + " é um número primo. Posição: " + i);
            } else {
                System.out.println(numeros[i] + " não é um número primo. Posição: " + i);
            }
        }
        sc.close();
    }
}
