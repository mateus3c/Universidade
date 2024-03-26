// A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até que o valor seja maior que 500.

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultado = 0, inicio = 0;
        while (resultado < 500) {
                if (resultado == 0) {
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