// Faça um programa que peça um número inteiro e determine se ele é ou não um número primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1.

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Insira um número inteiro para determinar se ele é ou não primo: ");
            int n = sc.nextInt();
            boolean primo = true;
            if (n < 1)
                primo = false;
            for (int i = 2 ; i < n - 1 ; i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(n + " é um número primo");
            }
            if (!primo) {
                System.out.println(n + " não é um número primo");
            }
      }
}