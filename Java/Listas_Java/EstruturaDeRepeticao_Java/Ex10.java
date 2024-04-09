// Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.

import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira dois números inteiros: ");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        if (numero1 < numero2) {
            for (int i = numero1; i <= numero2; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = numero2; i <= numero1; i++) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}