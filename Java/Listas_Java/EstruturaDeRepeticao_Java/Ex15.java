// A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série até o n−ésimo termo.

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o n−ésimo termo para a sequência de Fibonacci: ");
        int n = sc.nextInt();
        int resultado = 0, inicio = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                resultado = 1;
            } else {
                resultado = inicio + resultado;
                inicio = resultado - inicio;
            }
            System.out.println(resultado);
        }
        sc.close();
    }
}