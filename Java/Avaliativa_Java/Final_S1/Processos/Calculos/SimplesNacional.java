package Processos.Calculos;

import Processos.Calculo;

public class SimplesNacional extends Calculo {
    private double simplesNacional;

    @Override
    public double obtResultado(double[] _val1) {
        return 0;
    }

    @Override
    public double obtResultado(double receitaBrutaTotal, double aliquotaEfetiva, double valorADeduzir) {
            this.simplesNacional = ((receitaBrutaTotal * aliquotaEfetiva) - valorADeduzir)/receitaBrutaTotal;
            resultado = this.simplesNacional;

        return resultado;
    }
}