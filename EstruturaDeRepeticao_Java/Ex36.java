/*
Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será digitado pelo usuário, mas a tabuada não deve necessariamente iniciar em 1 e terminar em 10, o valor inicial e final devem ser informados também pelo usuário, conforme exemplo abaixo:
Montar a tabuada de: 5
Começar por: 4
Terminar em: 7

Vou montar a tabuada de 5 começando em 4 e terminando em 7:
5 X 4 = 20
5 X 5 = 25
5 X 6 = 30
5 X 7 = 35
*/

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Montar a tabuada de: ");
        int numero = sc.nextInt();
        System.out.print("Começar por: ");
        int comecar = sc.nextInt();
        System.out.print("Terminar em: ");
        int terminar = sc.nextInt();
        for (int i = comecar; i <= terminar; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
            sc.close();
        }
    }
}