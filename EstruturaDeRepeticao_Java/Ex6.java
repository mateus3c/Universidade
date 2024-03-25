// Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois modifique o programa para que ele mostre os números um ao lado do outro.
public class Ex6 {
    public static void main(String[] args) {
        int numerosAbaixo = 1;
        System.out.println("Números um abaixo do outro: ");
        while (numerosAbaixo <= 20) {
            System.out.println(numerosAbaixo);
            numerosAbaixo++;
        }
        int numerosLado = 0;
        System.out.println("Números um ao lado do outro: ");
        while (numerosLado <= 20) {
            System.out.print(numerosLado + " ");
            numerosLado++;
        }
    }
}
