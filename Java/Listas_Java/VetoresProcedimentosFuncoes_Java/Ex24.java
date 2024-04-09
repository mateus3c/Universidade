//Em um sistema de validação de dados, é importante identificar se um número é par ou ímpar. Crie uma função que receba um número inteiro como argumento e retorne True se ele for par e False se for ímpar.

import java.util.Scanner;
public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numero = sc.nextFloat();
        boolean par = (numero % 2 == 0);
        System.out.println(par);
        sc.close();
    }
}