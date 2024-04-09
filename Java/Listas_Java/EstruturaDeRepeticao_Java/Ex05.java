// Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a população do Pais A: ");
        double populacaoA = sc.nextDouble();
        System.out.print("Insira a taxa de crescimento do Pais A: ");
        double crescimentoA = sc.nextDouble();
        double populacaoB;
        double crescimentoB;
        while (true) {
            System.out.print("Insira a população do Pais B: ");
            populacaoB = sc.nextDouble();
            if (populacaoB < populacaoA) {
                System.out.println("Erro: A população do País B deve ser maior que a do País A.");
            } else {
                break;
            }
        }
        while (true) {
            System.out.print("Insira a taxa de crescimento do Pais B: ");
            crescimentoB = sc.nextDouble();
            if (crescimentoB > crescimentoA) {
                System.out.println("Erro: O crescimento do País B deve ser menor que a do País A.");
            } else {
                break;
            }
        }
        int anos = 0;
        while (populacaoA < populacaoB) {
            populacaoA += populacaoA * crescimentoA;
            populacaoB += populacaoB * crescimentoB;
            anos++;
        }
        System.out.println("Número de anos necessários: " + anos);
        sc.close();
    }
}


