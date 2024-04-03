/*
Faça um programa que preencha um vetor com os modelos de cinco carros (exemplos de modelos: Fusca, Gol, Vectra etc). Carregue outro vetor com o consumo desses carros, isto é, quantos quilômetros cada um deles faz com um litro de combustível. Calcule e mostre:
1. O modelo de carro mais econômico.
2. Quantos litros de combustível cada um dos carros cadastrados consome para percorrer uma distância de 1.000 km.
*/
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] modelos = new String[5];
        float[] consumo = new float[5];
        String modeloEconomico = "";
        float consumoEconomico = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Modelo do carro: ");
            modelos[i] = sc.nextLine().strip();
            System.out.println("Consumo do carro (KM/L): ");
            consumo[i] = sc.nextFloat();
            sc.nextLine();
            if (i == 0 || consumo[i] > consumoEconomico) {
                consumoEconomico = consumo[i];
                modeloEconomico = modelos[i];
            }
        }
        System.out.println("\nModelo mais econômico: " + modeloEconomico);
        for (int i = 0; i < 5; i++) {
           System.out.printf("\nConsumo do %s para percorrer 1.000km: %.2f litros", modelos[i], 1000/consumo[i]);
        }
        sc.close();
    }
}