/*
Uma pequena loja de artesanato possui apenas um vendedor e comercializa dez tipos de objetos. O vendedor recebe, mensalmente, salário de R$545,00, acrescido de 5% do valor total de suas vendas. O valor unitário dos objetos deve ser informado e armazenado em um vetor; a quantidade vendida de cada peça deve ficar em outro vetor, mas na mesma posição. Crie um programa que receba os preços e as quantidades vendidas, armazenando-os em seus respectivos vetores (ambos com tamanho dez). Depois, determine e mostre:
Um relatório contendo: quantidade vendida, valor unitário e valor total de cada objeto. Ao final, deverão ser mostrados o valor geral das vendas e o valor da comissão que será paga ao vendedor; e o valor do objeto mais vendido e sua posição no vetor (não se preocupe com empates).
*/

import java.util.Scanner;

 class Ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] valoresUnitarios = new float[10];
        float[] quantidadesVendidas = new float[10];
        float[] dinheiroProduto = new float[10];
        double dinheiroTotal = 0, comissao;
        for (int i = 0 ; i < 10 ; i++) {
            System.out.printf("\nInsira o valor do produto número n.%d: ", i);
            valoresUnitarios[i] = sc.nextFloat();
            System.out.printf("Insira a quantidade vendida do produto número %d: ", i);
            quantidadesVendidas[i] = sc.nextFloat();
            dinheiroProduto[i] = valoresUnitarios[i] * quantidadesVendidas[i];
            dinheiroTotal += dinheiroProduto[i];
        }
        for (int i = 0 ; i < 10 ; i++) {
            System.out.printf("\n\n- Produto número n.%d - \nQuantidade vendida: %.0f \nValor Unitário: %.2f R$ \nValor total da venda do produto %d: %.2f R$", i, valoresUnitarios[i], quantidadesVendidas[i], i, dinheiroProduto[i]);
        }
        comissao = dinheiroTotal * 0.05;
        System.out.printf("\n\nValor total das vendas: %.2f R$O \nValor da comissão pelas vendas: %.2f R$", dinheiroTotal, comissao);
    }
}