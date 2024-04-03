//Em um sistema de construção, é necessário calcular o perímetro de uma área para cercá-la. Faça um procedimento que calcule e imprima o valor do perímetro de um círculo, dado o raio fornecido pelo usuário.

import java.util.Scanner;
public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o raio do círculo: ");
        int raio = sc.nextInt();
        float circunferencia = 2 * 3.14f * raio;
        System.out.printf("\nO valor da circunferência é: %.2f", circunferencia);
        sc.close();
    }
}