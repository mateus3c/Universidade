// Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores.

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, numeros;
        System.out.println("Insira um conjunto de N números separados por espaço: ");
        String conjunto = sc.nextLine();
        String[] numerosString = conjunto.split(" ");
        int menor = Integer.parseInt(numerosString[0]);
        int maior = Integer.parseInt(numerosString[0]);
        for (String numero : numerosString) {
            numeros = Integer.parseInt(numero);
            if (numeros < menor) {
                menor = numeros;
            }
            if (numeros > maior) {
                maior = numeros;
            }
            soma += numeros;
        }
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Soma dos valores: " + soma);
        sc.close();
    }
}