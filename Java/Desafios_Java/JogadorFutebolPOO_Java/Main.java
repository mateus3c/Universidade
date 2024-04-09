import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Jogador jogador = new Jogador(); 
    boolean loop = true;
    
    System.out.print("Digite o nome do jogador: ");
    jogador.nome = sc.nextLine();
    System.out.print("Digite a idade do jogador: ");
    jogador.idade = sc.nextInt();
    sc.nextLine();
    System.out.print("Digite a altura do jogador (m): ");
    jogador.altura = sc.nextFloat();
    sc.nextLine();
    System.out.print("Digite o peso do jogador (kg): ");
    jogador.peso = sc.nextFloat();
    sc.nextLine();
    System.out.print("Digite a nacionalidade do jogador: ");
    jogador.nacionalidade = sc.nextLine();
    
    while (loop) {
      System.out.println("Digite a posição do jogador: \n [1]Defesa \n [2]Meio-Campo  \n [3]Atacante ");
      jogador.posicao = sc.nextLine();
      if (jogador.posicao.equals("1")) {
          jogador.posicao = "defesa";
          loop = false;
      } else if (jogador.posicao.equals("2")) {
          jogador.posicao = "meio-campo";
          loop = false;
      } else if (jogador.posicao.equals("3")) {
          jogador.posicao = "atacante";
          loop = false;
      } else {
          System.out.println("Entrada inválida.");
      }
    }

    sc.close();
    jogador.dados();

    System.out.println("\n\t- Sumário -");
    System.out.println("\nNome: " + jogador.nome);
    System.out.println("Idade: " + jogador.idade + " anos");
    System.out.println("Altura: " + jogador.altura + "m");
    System.out.println("Peso: " + jogador.peso + "kg");
    System.out.println("Posição: " + jogador.posicao);
    System.out.println("Nacionalidade: " + jogador.nacionalidade);
    if (jogador.anosRestantes < 0) {
      System.out.println("\nO jogador já se aposentou.");
    } else {
      System.out.println("\nFaltam " + jogador.anosRestantes + " anos para se aposentar.");
    }  
  }
}