import Dados.*;

public class Jogo {
    public static void main(String[] args) {
        // Cria objetos das classes "SuperHeroi" e "Vilao"
        SuperHeroi superHeroi = new SuperHeroi("Superman", "Clark Kent");
        Vilao vilao = new Vilao("Lex Luthor", "Lex Luthor", 10);

        // Cria superpoderes e os atribui aos objetos "superHeroi" e "vilao"
        Superpoder poder1 = new Superpoder("Voar", 3);
        Superpoder poder2 = new Superpoder("Força", 5);
        Superpoder poder3 = new Superpoder("Visão de Raio-X", 4);
        Superpoder poder4 = new Superpoder("Sopro Congelante", 4);
        Superpoder poder5 = new Superpoder("Mente Aguçada", 5);

        superHeroi.adicionaSuperpoder(poder1);
        superHeroi.adicionaSuperpoder(poder2);
        superHeroi.adicionaSuperpoder(poder3);
        superHeroi.adicionaSuperpoder(poder4);

        vilao.adicionaSuperpoder(poder5);

        // Cria um objeto da classe "Confronto" e executa o confronto
        Confronto confronto = new Confronto();
        int resultado = confronto.executar(superHeroi, vilao);

        // Exibe o resultado do confronto
        if (resultado == 1) {
            System.out.println("1");
        } else if (resultado == 2) {
            System.out.println("2");
        } else {
            System.out.println("0");
        }
    }
}
