import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Define variáveis
    int opcao;
    int capacidadeMaxima = 0;
    int totalAndares = 0;
    boolean sucesso = false;
    // Repete o bloco de código até que a variável 'sucesso' seja verdadeira - e a
    // variável 'sucesso' só se torna verdadeira quando não houver nenhum erro na
    // execução do programa.
    while (!sucesso) {
      // Tratamento de exceção para evitar com que erros parem a execução do programa.
      try {
        System.out.print("Insira a capacidade máxima do elevador: ");
        capacidadeMaxima = sc.nextInt();
        System.out.print("Insira o total de andares do prédio: ");
        totalAndares = sc.nextInt();
        // A variável 'sucesso' se torna verdadeira caso o bloco de código execute até o
        // fim, e isso só é possível se não houver nenhum erro.
        sucesso = true;
      } // Caso o usuário digite um caractere ou um número não inteiro, a exceção será
        // tratada e ele receberá uma mensagem indicando o erro.
      catch (InputMismatchException e) {
        System.out.println("\nENTRADA INVÁLIDA. POR FAVOR, DIGITE UM NÚMERO INTEIRO.\n\n");
      }
      // Para evitar que a entrada que causou o erro continue sendo lida
      // infinitamente, é necessário limpar o buffer do scanner. Esse trecho de código
      // é executado logo após do 'try' e do 'catch' (apenas caso um erro aconteça)
      // independentemente se houver ou não um erro.
      finally {
        sc.nextLine();
      }
    }
    // Define objeto da classe 'Elevador', que recebe os valores digitados pelo
    // usuário em seu construtor.
    Elevador elevador = new Elevador(capacidadeMaxima, totalAndares);
    // Loop infinito.
    while (true) {
      System.out.println("\n\t\t\t  - O que deseja fazer? -");
      System.out.println("[1]Subir o elevador " + "\t|\tTotal de andares: " + elevador.getTotalAndares()
          + "\n[2]Descer o elevador " + "\t|\tAndar atual: " + elevador.getAndarAtual() + "\n[3]Entrar no elevador "
          + "\t|\tCapacidade máxima: " + elevador.getCapacidadeMaxima() + "\n[4]Sair do elevador "
          + "\t|\tPessoas presentes: " + elevador.getPessoasPresentes());
      // Tratamento de exceção para evitar com que erros parem a execução do programa.
      try {
        opcao = sc.nextInt();
        switch (opcao) {
          case 1:
            elevador.subir("O elevador já está no último andar. Não é possível subir mais.");
            break;
          case 2:
            elevador.descer("O elevador já está no térreo. Não é possível descer mais.");
            break;
          case 3:
            elevador.entrar("O elevador já está cheio. Não é possível entrar mais pessoas.");
            break;
          case 4:
            elevador.sair("O elevador já está vazio. Não é possível sair mais pessoas.");
            break;
          // Caso o usuário digite um número que não esteja entre as opções (1, 2, 3 ou 4)
          // ele receberá uma mensagem padrão, que aparece caso a entrada seja qualquer
          // número inteiro que não seja uma das opções. Neste caso, optei por uma
          // mensagem que indique que o usuário deve necessáriamente dar entrada a umas
          // das opções do programa (1, 2, 3 ou 4).
          default:
            System.out.println("\nOPÇÃO INVÁLIDA. POR FAVOR, DIGITE UMA DAS OPÇÕES DISPONÍVEIS (1, 2, 3, 4)\n\n");
            // Normalmente não há 'break' na resposta padrão, mas neste caso eu optei por
            // utilizar o 'break' pois o switch já está dentro de um loop infinito, então a
            // ausencia do 'break' causaria um consumo desnecessário de memória.
            break;
        }
      }
      // Caso o usuário digite um caractere ou um número não inteiro, a exceção será
      // tratada e ele receberá uma mensagem indicando o erro.
      catch (InputMismatchException e) {
        System.out.println("\nOPÇÃO INVÁLIDA. POR FAVOR, DIGITE UMA DAS OPÇÕES DISPONÍVEIS (1, 2, 3, 4)\n\n");
      } // Para evitar que a entrada que causou o erro continue sendo lida infinitas
        // vezes, é necessário limpar o buffer do scanner.
      finally {
        sc.nextLine();
      }
    }
  }
}

// System.out.println(e.getMessage());
// e.printStackTrace();
// System.out.print("\033[H\033[2J");
