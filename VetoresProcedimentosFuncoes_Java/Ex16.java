//Em uma pesquisa de opinião, é necessário registrar as respostas dos entrevistados. Crie um programa que leia 5 respostas (números inteiros) de entrevistados e, em seguida, imprima essas respostas na ordem inversa em que foram registradas.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> opniao = new ArrayList<>(10);
        System.out.println("[Entrevistador] \"Senhores, respondam de forma honesta a entrevista, pois é importante sabermos vossa opnião.\" \n[Entrevistador] \"Pois bem, qual o número favorito de cada um de vocês??\" ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("[Senhor Num.%d] ", i + 1);
            opniao.add(sc.nextInt());
        }
        opniao.sort(Collections.reverseOrder());
        System.out.print("[Entrevistador] \"Nossa, quantos números bons. Vou ordenar eles de trás pra frente agora. Pois bem, lá vou eu...\" \n[Entrevistador] \"");
        for (int i = 0; i < opniao.size(); i++) {
            if (i > 0) {
                System.out.print("... ");
            }
            System.out.print(opniao.get(i));
        }
        System.out.print("[Entrevistador] \"Bacana, né?\"");
        sc.close();
    }
}
