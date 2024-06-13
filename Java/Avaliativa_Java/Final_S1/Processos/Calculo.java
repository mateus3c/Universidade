package Processos;

public abstract class Calculo {
    protected double resultado;

    public Calculo() {
        this.resultado = 0;
    }

    public abstract double obtResultado(double[] _val1);
    public abstract double obtResultado(double _val1, double _val2, double _val3);
    // public abstract double obtResultado(double _val);
}