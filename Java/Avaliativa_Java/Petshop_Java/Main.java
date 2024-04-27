import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Inicia arrays com várias características dos animais.
        String[] arrayRacasCao = { "Vira-lata", "Salsicha", "Poodle" };
        String[] arrayRacasGato = { "Persa", "Siames", "Sphynx" };
        String[] arrayNome = { "Rex", "Luna", "Bolinha", "Vladmir" };
        String[] arraySaude = { "Saudável", "Doente" };
        String[] arrayPortes = { "Pequeno", "Medio", "Grande" };
        String[] arrayPersonalidades = { "Bravo", "Calmo", "Preguiçoso" };
        // A idade máxima não é array, mas apenas um valor que servirá como limite para o tamanho dos números que poderão vir no sorteio.
        int idadeMaxima = 15;

        // Loop infinito para que o programa não finalize.
        while(true) {
            System.out.println("Qual animal você deseja?\n[1] Cachorro\n[2] Gato");
            String animal = sc.nextLine();
            if (animal.equals("1")) {
                // Cria uma instância de "Cao" com o apelido "cao", e chama seus métodos, que pegarão os valores disponíveis na lista de arrays acima.
                Cao cao = new Cao(arrayNome, arraySaude, idadeMaxima, arrayRacasCao, arrayPortes);
                System.out.print("\033[H\033[2J");
                // Significa: "Texto" + "Array[Index do Array]"
                System.out.println("Raça: " + arrayRacasCao[cao.getIndexRacasCao()]);
                //O index do array é obtido dentro da classe "Animais", e por isso deve-se chamar o método getter que retorna o valor desejado. Neste caso, o valor desejado é o index de "arrayNome", que é retornado pelo método "getIndexNome" localizado na subclasse "Cao" da superclasse "Animais", por isso é necessário preceder o método getter com o apelido da subclasse.
                System.out.println("Nome: " + arrayNome[cao.getIndexNome()]);
                System.out.println("Idade: " + cao.getIdade());
                System.out.println("Saúde: " + arraySaude[cao.getIndexSaude()]);
                System.out.println("Porte: " + arrayPortes[cao.getIndexPortes()]);
            } else if (animal.equals("2")) {
                // Cria uma instância de "Gato" com o apelido "gato", e chama seus métodos, que pegarão os valores disponíveis na lista de arrays acima.
                Gato gato = new Gato(arrayNome, arraySaude, idadeMaxima, arrayRacasGato, arrayPersonalidades);
                System.out.print("\033[H\033[2J");
                System.out.println("Raça: " + arrayRacasGato[gato.getIndexRacasGato()]);
                System.out.println("Nome: " + arrayNome[gato.getIndexNome()]);
                System.out.println("Idade: " + gato.getIdade());
                System.out.println("Saúde: " + arraySaude[gato.getIndexSaude()]);
                System.out.println("Porte: " + arrayPersonalidades[gato.getIndexPersonalidades()]);
            } else {
                System.out.println("Entrada inválida");
            }
        }
    }
}

