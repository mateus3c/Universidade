//Em um sistema de controle acadêmico, é preciso calcular a média das notas dos alunos. Escreva um programa que leia as notas de 10 alunos e, em seguida, calcule e imprima a média dessas notas.
import java.util.Scanner;

public class Ex17 {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double[] notas = new double[10];
            double soma = 0;

            for (int i = 0; i < 10; i++) {
                System.out.printf("\nDigite a nota do aluno: %d", (i + 1));
                notas[i] = sc.nextDouble();
                soma += notas[i];
            }
            double media = soma / 10;
            System.out.println("A media das notas dos alunos foi: " + media);
        }
    }
