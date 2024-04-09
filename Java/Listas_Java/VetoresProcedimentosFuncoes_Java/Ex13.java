//Em um sistema de segurança, é importante identificar números primos para gerar chaves de acesso. Crie um programa que solicite ao usuário inserir um número inteiro N e, em seguida, imprima todos os números primos menores ou iguais a N.


import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        int N = scan.nextInt();
        for (int i = 2; i <= N; i++) {
            boolean numPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    numPrimo = false;
                    break;
                }
            }
            if (numPrimo) {
                System.out.println(i);
            }
        }
        scan.close();
    }
}