//Em uma calculadora, é necessário somar dois números digitados pelo usuário. Escreva um procedimento que receba dois números como parâmetros e imprima a soma deles

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Insira o segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("A soma dos dois números é: " + (num1 + num2));
        sc.close();
    }
}