//Durante a contagem de produtos em um estoque, é necessário identificar os produtos com quantidades pares. Faça um programa que imprima todos os números pares de 1 a 50, que representam a contagem de produtos, utilizando um loop for.

public class Ex12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}