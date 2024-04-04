//Um sistema de gerenciamento de projetos precisa gerar estimativas de prazos com base em sequências de tarefas. Faça um programa que solicite ao usuário inserir um número inteiro positivo N e, em seguida, gere e imprima os N primeiros termos da sequência de Fibonacci, que representa os prazos estimados.

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o número de etapas de produção: ");
        int numEtapas = scanner.nextInt();
        int tempoTotal = numEtapas * 30;
        System.out.println("O tempo total de produção é de " + tempoTotal + " minutos.");
        scanner.close();
    }
}