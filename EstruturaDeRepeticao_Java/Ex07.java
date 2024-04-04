// Faça um programa que leia 5 números e informe o maior número.

import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira cinco números: ");
        float numero1 = sc.nextFloat();
        float numero2 = sc.nextFloat();
        float numero3 = sc.nextFloat();
        float numero4 = sc.nextFloat();
        float numero5 = sc.nextFloat();
        float numeroMaior = Math.max(numero1, Math.max(numero2, Math.max(numero3, Math.max(numero4, numero5))));
        System.out.println(numeroMaior);
        sc.close();
    }
}