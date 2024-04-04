//Em um sistema de contabilidade, é necessário somar os valores de entrada e saída de recursos. Faça um programa que leia dois vetores com 5 elementos cada um (valores de entrada e saída) e, em seguida, calcule e imprima o saldo final.

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] entrada = new int[5];
        int[] saida = new int[5];
        int somaEntrada = 0;
        int somaSaida = 0;
        System.out.println("Insira cinco valores de entrada separados por espaços: ");
        String[] entradaStr = sc.nextLine().split(" ");
        for (int i = 0; i < entradaStr.length; i++) {
            entrada[i] = Integer.parseInt(entradaStr[i]);
            somaEntrada += entrada[i];
        }
        System.out.println("Insira cinco valores de saída separados por espaços: ");
        String[] saidaStr = sc.nextLine().split(" ");
        for (int i = 0; i < saidaStr.length; i++) {
            saida[i] = Integer.parseInt(saidaStr[i]);
            somaSaida += saida[i];
        }
        int saldo = somaEntrada - somaSaida;
        System.out.println("Saldo final: " + saldo);
        sc.close();
    }
}
