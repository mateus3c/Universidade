package Processos.Calculos;

import Processos.Calculo;

public class ReceitaBrutaTotal extends Calculo {
    private double receitaBrutaTotal;

    @Override
    public double obtResultado(double[] _valReceitaBruta) {
        for (int i = 0; i < _valReceitaBruta.length; i++) {
            this.receitaBrutaTotal += _valReceitaBruta[i];
            resultado = this.receitaBrutaTotal;
        }
        return resultado;
    }

    @Override
    public double obtResultado(double _val1, double _val2, double _val3) {
        return 0;
    }
}