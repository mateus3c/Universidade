//Em um sistema de monitoramento de temperaturas, é importante identificar a temperatura mais alta registrada. Faça um programa que leia 8 valores de temperatura e, em seguida, encontre e imprima a maior temperatura registrada.
import java.util.Scanner;

public class Ex18 {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double[] temperaturas = new double[8];
            double maiorTemperatura = 0;
            System.out.println("Digite oito temperaturas: ");
            for (int i = 0; i < 8; i++) {
                System.out.printf("Temperatura %d: ", i + 1);
                temperaturas[i] = sc.nextDouble();
            }
            sc.close();
            for (int i = 0; i < 8; i++) {
                if (i == 0) {
                    maiorTemperatura = temperaturas[i];
                }
                if (temperaturas[i] > maiorTemperatura) {
                    maiorTemperatura = temperaturas[i];
                }
            }
            System.out.println("A maior temperatura registrada é: " + maiorTemperatura);
        }
    }
