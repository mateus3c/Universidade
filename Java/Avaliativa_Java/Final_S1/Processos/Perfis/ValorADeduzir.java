package Processos.Perfis;

import Processos.Perfil;

public class ValorADeduzir extends Perfil {

    public ValorADeduzir() {
        super();
    }

    @Override
    public double obtDeterminado(int perfil, double receitaBrutaTotal) {
        switch (perfil) {
            case 1:
                if (receitaBrutaTotal >= 0 && receitaBrutaTotal <= 180000) {
                    determinado = 0.00;
                } else if (receitaBrutaTotal >= 180000 && receitaBrutaTotal <= 360000) {
                    determinado = 5940.00;
                } else if (receitaBrutaTotal >= 360000 && receitaBrutaTotal <= 720000) {
                    determinado = 13860.00;
                } else if (receitaBrutaTotal >= 720000 && receitaBrutaTotal <= 1800000) {
                    determinado = 22500.00;
                } else if (receitaBrutaTotal >= 1800000 && receitaBrutaTotal <= 3600000) {
                    determinado = 87300.00;
                } else if (receitaBrutaTotal >= 3600000 && receitaBrutaTotal <= 4800000) {
                    determinado = 378000.00;
                }
                break;
            case 2:
                if (receitaBrutaTotal >= 0 && receitaBrutaTotal <= 180000) {
                    determinado = 0.00;
                } else if (receitaBrutaTotal >= 180000 && receitaBrutaTotal <= 360000) {
                    determinado = 5949.00;
                } else if (receitaBrutaTotal >= 360000 && receitaBrutaTotal <= 720000) {
                    determinado = 13860.00;
                } else if (receitaBrutaTotal >= 720000 && receitaBrutaTotal <= 1800000) {
                    determinado = 22500.00;
                } else if (receitaBrutaTotal >= 1800000 && receitaBrutaTotal <= 3600000) {
                    determinado = 85500.00;
                } else if (receitaBrutaTotal >= 3600000 && receitaBrutaTotal <= 4800000) {
                    determinado = 720000.00;
                }
                break;
            case 3:
                if (receitaBrutaTotal >= 0 && receitaBrutaTotal <= 180000) {
                    determinado = 0.00;
                } else if (receitaBrutaTotal >= 180000 && receitaBrutaTotal <= 360000) {
                    determinado = 9360.00;
                } else if (receitaBrutaTotal >= 360000 && receitaBrutaTotal <= 720000) {
                    determinado = 17640.00;
                } else if (receitaBrutaTotal >= 720000 && receitaBrutaTotal <= 1800000) {
                    determinado = 35640.00;
                } else if (receitaBrutaTotal >= 1800000 && receitaBrutaTotal <= 3600000) {
                    determinado = 125640.00;
                } else if (receitaBrutaTotal >= 3600000 && receitaBrutaTotal <= 4800000) {
                    determinado = 648000.00;
                }
                break;
            case 4:
                if (receitaBrutaTotal >= 0 && receitaBrutaTotal <= 180000) {
                    determinado = 0.00;
                } else if (receitaBrutaTotal >= 180000 && receitaBrutaTotal <= 360000) {
                    determinado = 8100.00;
                } else if (receitaBrutaTotal >= 360000 && receitaBrutaTotal <= 720000) {
                    determinado = 12420.00;
                } else if (receitaBrutaTotal >= 720000 && receitaBrutaTotal <= 1800000) {
                    determinado = 39780.00;
                } else if (receitaBrutaTotal >= 1800000 && receitaBrutaTotal <= 3600000) {
                    determinado = 183780.00;
                } else if (receitaBrutaTotal >= 3600000 && receitaBrutaTotal <= 4800000) {
                    determinado = 828000.00;
                }
                break;
            case 5:
                if (receitaBrutaTotal >= 0 && receitaBrutaTotal <= 180000) {
                    determinado = 0.00;
                } else if (receitaBrutaTotal >= 180000 && receitaBrutaTotal <= 360000) {
                    determinado = 4500.00;
                } else if (receitaBrutaTotal >= 360000 && receitaBrutaTotal <= 720000) {
                    determinado = 9900.00;
                } else if (receitaBrutaTotal >= 720000 && receitaBrutaTotal <= 1800000) {
                    determinado = 17100.00;
                } else if (receitaBrutaTotal >= 1800000 && receitaBrutaTotal <= 3600000) {
                    determinado = 62100.00;
                } else if (receitaBrutaTotal >= 3600000 && receitaBrutaTotal <= 4800000) {
                    determinado = 540000.00;
                }
                break;
        }
        return determinado;
    }
}