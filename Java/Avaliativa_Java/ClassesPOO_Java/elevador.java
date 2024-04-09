public class Elevador {
    public int andarAtual = 0;
    public int pessoasPresentes = 0;
    public int capacidadeMaxima;
    public int totalAndares;

    public void inicializar(int inputCapacidadeMaxima, int inputTotalAndares) {
        capacidadeMaxima = inputCapacidadeMaxima;
        totalAndares = inputTotalAndares;
        andarAtual = 0;
        pessoasPresentes = 0;
    }

    public void entrar() {
        if (pessoasPresentes < capacidadeMaxima) {
            pessoasPresentes++;
        } else {
            System.out.println("O elevador está cheio. Não é possível entrar mais pessoas.");
        }
    }

    public void sair() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
        } else {
            System.out.println("O elevador já está vazio. Não há ninguém para sair.");
        }
    }

    public void subir(){
        if (andarAtual < totalAndares) {
            andarAtual++;
        } else {
            System.out.println("O elevador já está no último andar. Não é possível subir mais.");
        }
    }

    public void descer(){
        if (andarAtual > 0) {
            andarAtual--;
        } else {
            System.out.println("O elevador já está no térreo. Não é possível descer mais.");
        }
    }
}
