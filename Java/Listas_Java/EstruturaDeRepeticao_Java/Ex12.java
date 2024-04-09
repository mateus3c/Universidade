/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
        Tabuada de 5:
        5 X 1 = 5
        5 X 2 = 10
        ...
        5 X 10 = 50
*/

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira qualquer número inteiro entre 1 a 10: ");
        int numero = sc.nextInt();
        if (numero >= 1 && numero < 10) {
            System.out.println("Tabuada de " + numero + ":");
            System.out.println(numero + " X 1 = " + (numero));
            System.out.println(numero + " X 2 = " + (numero * 2));
            System.out.println(numero + " X 3 = " + (numero * 3));
            System.out.println(numero + " X 4 = " + (numero * 4));
            System.out.println(numero + " X 5 = " + (numero * 5));
            System.out.println(numero + " X 6 = " + (numero * 6));
            System.out.println(numero + " X 7 = " + (numero * 7));
            System.out.println(numero + " X 8 = " + (numero * 8));
            System.out.println(numero + " X 9 = " + (numero * 9));
            System.out.println(numero + " X 10 = " + (numero * 10));
            sc.close();
        }
    }
}