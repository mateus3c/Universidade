public class Elevador {
    Logger log = new Logger();
    // Define atributos.
    private int andarAtual;
    private int pessoasPresentes;
    private int capacidadeMaxima;
    private int totalAndares;

    // Método construtor.
    public Elevador(int capacidadeMaxima, int totalAndares) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.pessoasPresentes = 0;
    }

    // Método que verifica se ainda há espaço para entrar mais pessoas no elevador.
    // Se houver, adiciona uma pessoa ao elevador, se não houver, retorna uma
    // mensagem indicando que o elevador está cheio.
    public void entrar(String mensagemEntrar) {
        if (pessoasPresentes < capacidadeMaxima) {
            pessoasPresentes++;
            log.registrarLog("TRACE - Uma pessoa entrou no elevador. Pessoas presentes: " + pessoasPresentes);
        } else {
            System.out.println(mensagemEntrar);
            log.registrarLog("TRACE - Tentativa de entrar com o elevador cheio.");
        }
    }

    // Método que verifica se pelo menos uma pessoa no elevador. Se houver, remove
    // uma pessoa do elevador, se não houver, retorna uma mensagem indicando que o
    // elevador está vazio.
    public void sair(String mensagemSair) {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            log.registrarLog("TRACE - Uma pessoa saiu do elevador. Pessoas presentes: " + pessoasPresentes);
        } else {
            System.out.println(mensagemSair);
            log.registrarLog("TRACE - Tentativa de sair com o elevador vazio.");
        }
    }

    // Método que verifica se o elevador não está no último andar. Se estiver,
    // retorna uma mensagem indicando que o elevador já está no último andar e por
    // isso não pode subir mais, se não estiver, sobe um andar.
    public void subir(String mensagemSubir) {
        if (andarAtual < totalAndares) {
            andarAtual++;
            log.registrarLog("TRACE - Elevador subiu para o andar: " + andarAtual);
        } else {
            System.out.println(mensagemSubir);
            log.registrarLog("TRACE - Tentativa de subir além do último andar.");
        }
    }

    // Método que verifica se o elevador não está no térreo. Se estiver, retorna uma
    // mensagem indicando que o elevador já está no térreo e por isso não pode
    // descer mais, se não estiver, desce um andar.
    public void descer(String mensagemDescer) {
        if (andarAtual > 0) {
            andarAtual--;
            log.registrarLog("TRACE - Elevador desceu para o andar: " + andarAtual);
        } else {
            System.out.println(mensagemDescer);
            log.registrarLog("TRACE - Tentativa de descer além do térreo.");
        }
    }

    // Métodos getters
    public int getAndarAtual() {
        return andarAtual;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    // Métodos setters.
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }
}