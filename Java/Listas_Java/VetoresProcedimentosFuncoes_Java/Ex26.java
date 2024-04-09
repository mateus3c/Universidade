//Em um sistema de controle de notas de alunos, é necessário calcular a média das notas de uma turma. Crie um procedimento que receba um vetor de números inteiros como parâmetro e imprima a média dos valores contidos nesse vetor.
import java.util.Scanner;
public class Ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[5];
        float somaNotas = 0;
        for (int i = 0; i < 5; i++) {
            System.out.printf("Insira a nota do aluno %d: ", i + 1);
            notas[i] = sc.nextInt();
            somaNotas += notas[i];
        }
        float media = somaNotas / 5;
        System.out.println("Media das notas: " + media);
        sc.close();
    }
}