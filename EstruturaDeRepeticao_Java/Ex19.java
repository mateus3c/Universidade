// Altere o programa anterior para que ele aceite apenas números entre 0 e 1000.

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, numeros = 0;
        System.out.println("Insira um conjunto de N números separados por espaço que esteja entre 0 e 1000: ");
        String conjunto = sc.nextLine();
        String[] numerosString = conjunto.split(" ");
        for (String numero : numerosString) {
            numeros = Integer.parseInt(numero);
            if (numeros >= 0 && numeros <= 1000) {
                soma += numeros;
            }
        }
        int menor = Integer.parseInt(numerosString[0]);
        int maior = Integer.parseInt(numerosString[0]);;
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