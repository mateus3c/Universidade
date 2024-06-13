package Processos;

public abstract class Perfil {
    protected double determinado;

    public Perfil() {
        this.determinado = 0;
    }

    // Possibilidade de sobrecarga para criar mais tipos de perfis com requisitos diferentes
    // de dados.
    public abstract double obtDeterminado(int _anexo, double _receitaBrutaTotal);
}