// Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o n−ésimo termo para o calculo do fatorial: ");
        int n = sc.nextInt();
        int resultado = 1;
        for (int i = n; i > 0; i--) {
            resultado *= i;
        }
        System.out.println(resultado);
        sc.close();
    }
}