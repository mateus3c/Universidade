//Implemente um array de escrita única de valores de um tipo numérico qualquer. Um array de escrita única é um array cujos elementos só podem ser modificados uma única vez. Para a implementação, devemos ter, para cada elemento do array, um valor booleano associado que diz se o elemento pode ser modificado ou não. Faça um for que percorra esses arrays e na primeira vez, todos os elementos do array poderão ser modificados, mas assim que um elemento for modificado pela primeira vez o seu valor booleano associado será modificado de forma que da próxima vez que o elemento for modificado nada ocorrerá.

import java.util.Scanner;

class Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] elementos = new int[5];
        int[] elementosBackup = new int[5];
        boolean[] modificavel = new boolean[5];
        boolean algumModificavel = true;
        for (int i = 0; i < 5; i++) {
            System.out.printf("Elemento %d (Valor atual: 0):", i);
            elementos[i] = sc.nextInt();
            elementosBackup[i] = elementos[i];
            modificavel[i] = true;
        }
        while (algumModificavel) {
            for (int i = 0; i < 5; i++) {
                System.out.printf("\n\nElemento %d (Valor atual: %d):", i, elementos[i]);
                elementos[i] = sc.nextInt();
                if (elementos[i] != elementosBackup[i]) {
                    if (modificavel[i]) {
                        System.out.printf("Novo valor do elemento %d: %d", i, elementos[i]);
                        modificavel[i] = false;
                    } else {
                        System.out.printf("O elemento %d não pode ser modificado.", i);
                    }
                    if (!modificavel[0] && !modificavel[1] && !modificavel[2] && !modificavel[3] && !modificavel[4]) {
                        algumModificavel = false;
                    }
                } else {
                    System.out.printf("Valor mantido do elemento %d: %d", i, elementos[i]);
                }
            }
        }
        System.out.printf("\n\n- Sumário - \nElemento %d: %d\nElemento %d: %d\nElemento %d: %d\nElemento %d: %d\nElemento %d: %d", 0, elementos[0], 1, elementos[1], 2, elementos[2], 3, elementos[3], 4, elementos[4]);
        sc.close();
    }
}