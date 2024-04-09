import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Elevador elevador = new Elevador();
    String opcao;
    System.out.print("Insira a capacidade maxima do elevador: ");
    elevador.capacidadeMaxima = sc.nextInt();
    System.out.print("Insira o total de andares do predio: ");
    elevador.totalAndares = sc.nextInt();
    sc.nextLine();
    elevador.inicializar(elevador.capacidadeMaxima, elevador.totalAndares);
    while (true) {
      System.out.println("\t\t\t\tO que deseja fazer?");
      System.out.println("[1]Subir o elevador " + "\t|\tTotal de andares: " + elevador.totalAndares + "\n[2]Descer o elevador " + "\t|\tAndar atual: " + elevador.andarAtual + "\n[3]Entrar no elevador " + "\t|\tCapacidade maxima: " + elevador.capacidadeMaxima + "\n[4]Sair do elevador " + "\t|\tPessoas presentes: " + elevador.pessoasPresentes);
      opcao = sc.nextLine();
        switch (opcao) {
            case "1" -> elevador.subir();
            case "2" -> elevador.descer();
            case "3" -> elevador.entrar();
            case "4" -> elevador.sair();
            default -> System.out.println("Opcão inválida.");
        }
    }
  }
}