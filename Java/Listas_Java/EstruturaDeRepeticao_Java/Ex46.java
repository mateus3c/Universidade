// Em uma competição de salto em distância cada atleta tem direito a cinco saltos. No final da série de saltos de cada atleta, o melhor e o pior resultados são eliminados. O seu resultado fica sendo a média dos três valores restantes. Você deve fazer um programa que receba o nome e as cinco distâncias alcançadas pelo atleta em seus saltos e depois informe a média dos saltos conforme a descrição acima informada (retirar o melhor e o pior salto e depois calcular a média). Faça uso de uma lista para armazenar os saltos. Os saltos são informados na ordem da execução, portanto não são ordenados. O programa deve ser encerrado quando não for informado o nome do atleta. A saída do programa deve ser conforme o exemplo abaixo:

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Float> valoresMedia = new ArrayList<>();
        float soma = 0;
        System.out.print("Atleta: ");
        String atleta = sc.nextLine();
        if (!atleta.isEmpty()) {
            System.out.print("Primeiro salto: ");
            float primeiro = sc.nextFloat();
            System.out.print("Segundo salto: ");
            float segundo = sc.nextFloat();
            System.out.print("Terceiro salto: ");
            float terceiro = sc.nextFloat();
            System.out.print("Quarto salto: ");
            float quarto = sc.nextFloat();
            System.out.print("Quinto salto: ");
            float quinto = sc.nextFloat();
            float melhor = Math.max(primeiro, Math.max(segundo, Math.max(terceiro, Math.max(quarto, quinto))));
            float pior = Math.min(primeiro, Math.min(segundo, Math.min(terceiro, Math.min(quarto, quinto))));
            if (primeiro != melhor && primeiro != pior) {
                valoresMedia.add(primeiro);
            }
            if (segundo != melhor && segundo != pior) {
                valoresMedia.add(segundo);
            }
            if (terceiro != melhor && terceiro != pior) {
                valoresMedia.add(terceiro);
            }
            if (quarto != melhor && quarto != pior) {
                valoresMedia.add(quarto);
            }
            if (quinto != melhor && quinto != pior) {
                valoresMedia.add(quinto);
            }
            for (float valor : valoresMedia) {
                soma += valor;
            }
            float media = soma / valoresMedia.size();
            System.out.println("Atleta: " + atleta);
            System.out.println("\nPrimeiro Salto: " + primeiro + " m");
            System.out.println("Segundo Salto: " + segundo + " m");
            System.out.println("Terceiro Salto: " + terceiro + " m");
            System.out.println("Quarto Salto: " + quarto + " m");
            System.out.println("Quinto Salto: " + quinto + " m");
            System.out.println("\nMelhor Salto: " + melhor + " m");
            System.out.println("Pior salto: " + pior + " m");
            System.out.printf("Média dos demais saltos: %.1f m", media);
            System.out.println("\n\nResultado final: ");
            System.out.printf("%s: %.1f m", atleta, media);

        } else {
            System.exit(0);
        }
        sc.close();
    }
}