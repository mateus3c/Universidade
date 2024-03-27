// Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial várias vezes e limitando o fatorial a números inteiros positivos e menores que 16.

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Insira um número inteiro positivo entre 0 e 16 para o cálculo do fatorial: ");
            int n = sc.nextInt();
            if (n < 0 || n > 16) {
                System.out.println("Erro: o fatorial so pode ser calculado entre 0 e 16" + "\n");
                continue;
            }
            int resultado = 1;
            for (int i = n; i > 0; i--) {
                resultado *= i;
            }
            System.out.println(resultado);
        }

    }
}