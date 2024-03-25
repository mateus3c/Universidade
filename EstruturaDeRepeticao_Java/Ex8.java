// Faça um programa que leia 5 números e informe a soma e a média dos números.

import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira 5 números: ");
        float numero1 = sc.nextFloat();
        float numero2 = sc.nextFloat();
        float numero3 = sc.nextFloat();
        float numero4 = sc.nextFloat();
        float numero5 = sc.nextFloat();
        float soma = numero1 + numero2 + numero3 + numero4 + numero5;
        float media = soma / 5;
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
        sc.close();
    }
}