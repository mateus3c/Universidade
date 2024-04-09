//Um laboratório de pesquisa coleta dados de temperatura em diferentes regiões. Escreva um programa que solicite ao usuário digitar 10 valores de temperatura e, em seguida, calcule e imprima a temperatura média dessas regiões.

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Temperatura da região " + i + ": ");
            double temperatura = sc.nextDouble();
            soma += temperatura;
        }
        double media = soma / 10;
        System.out.println("A temperatura média das regiões é: " + media + " graus Celsius");
        sc.close();
    }
}