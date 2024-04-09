//Um sistema de gerenciamento de projetos precisa gerar estimativas de prazos com base em sequências de tarefas. Faça um programa que solicite ao usuário inserir um número inteiro positivo N e, em seguida, gere e imprima os N primeiros termos da sequência de Fibonacci, que representa os prazos estimados.

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o n−ésimo termo para a sequência de Fibonacci: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.println("Os primeiros " + n + " termos da sequência de Fibonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        sc.close();
    }
}
