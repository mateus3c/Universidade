import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrayRacasCao = { "Vira-lata", "Salsicha", "Poodle" };
        String[] arrayRacasGato = { "Persa", "Siames", "Sphynx" };
        String[] arrayNome = { "Rex", "Luna", "Bolinha", "Vladmir" };
        String[] arraySaude = { "Saudável", "Doente" };
        String[] arrayPortes = { "Pequeno", "Medio", "Grande" };
        String[] arrayPersonalidades = { "Bravo", "Calmo", "Preguiçoso" };
        int idadeMaxima = 15;

        while(true) {
            System.out.println("Qual animal você deseja?\n[1] Cachorro\n[2] Gato");
            String animal = sc.nextLine();
            if (animal.equals("1")) {
                Cao cao = new Cao(arrayNome, arraySaude, idadeMaxima, arrayRacasCao, arrayPortes);
                System.out.print("\033[H\033[2J");
                System.out.println("Raça: " + arrayRacasCao[cao.getIndexRacasCao()]);
                System.out.println("Nome: " + arrayNome[cao.getIndexNome()]);
                System.out.println("Idade: " + cao.getIdade());
                System.out.println("Saúde: " + arraySaude[cao.getIndexSaude()]);
                System.out.println("Porte: " + arrayPortes[cao.getIndexPortes()]);
            } else if (animal.equals("2")) {
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

