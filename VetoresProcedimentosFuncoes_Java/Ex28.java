/*
Implemente um array de escrita única de valores de um tipo numérico qualquer. Um array de escrita única é um array cujos elementos só podem ser modificados uma única vez. Para a implementação, devemos ter, para cada elemento do array, um valor booleano associado que diz se o elemento pode ser modificado ou não. Faça um for que percorra esses arrays e na primeira vez, todos os elementos do array poderão ser modificados, mas assim que um elemento for modificado pela primeira vez o seu valor booleano associado será modificado de forma que da próxima vez que o elemento for modificado nada ocorrerá.
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