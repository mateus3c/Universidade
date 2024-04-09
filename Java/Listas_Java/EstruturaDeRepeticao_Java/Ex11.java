// Altere o programa anterior para mostrar no final a soma dos números.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> valores = new ArrayList<>();
        float soma = 0;
        System.out.println("Insira dois números inteiros: ");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        if (numero1 < numero2) {
            for (int i = numero1; i <= numero2; i++) {
                valores.add(i);
            }
        } else {
            for (int i = numero2; i <= numero1; i++) {
                valores.add(i);
            }
        }
        for (float valor : valores) {
            soma += valor;
        }
        System.out.println(soma);
        sc.close();
    }
}