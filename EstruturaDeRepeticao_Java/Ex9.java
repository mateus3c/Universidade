// Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
public class Ex9 {
    public static void main(String[] args) {
        int numeros = 1;
        System.out.println("Números ímpares de 1 a 50: ");
        while (numeros <= 50) {
            if (numeros % 2 == 0) {
                System.out.println(numeros);
            }
            numeros++;
        }
    }
}
