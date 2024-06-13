import Processos.Calculos.ReceitaBrutaTotal;
import Processos.Calculos.SimplesNacional;
import Processos.Perfis.AliquotaEfetiva;
import Processos.Perfis.ValorADeduzir;

public class Estacao {
    ReceitaBrutaTotal rbt = new ReceitaBrutaTotal();
    AliquotaEfetiva ae = new AliquotaEfetiva();
    ValorADeduzir vad = new ValorADeduzir();
    SimplesNacional sn = new SimplesNacional();

    private double[] valReceitaBruta = new double[12];
    private double valReceitaBrutaTotal;
    private double valAliquotaEfetiva;
    private double valValorADeduzir;
    private double valSimplesNacional;


    // Construtores
    public Estacao() {
        this.valReceitaBruta = new double[12];
        this.valReceitaBrutaTotal = 0;
        this.valAliquotaEfetiva = 0;
        this.valValorADeduzir = 0;
    }
    //public Estacao(double[] valReceitaBruta, double valReceitaBrutaTotal, double valAliquotaEfetiva) {
    //    this.valReceitaBruta = valReceitaBruta;
    //    this.valReceitaBrutaTotal = valReceitaBrutaTotal;
    //    this.valAliquotaEfetiva = valAliquotaEfetiva;
    //}
    //public Estacao(double[] valReceitaBruta, double valRBTouAE) {
    //    this.valReceitaBruta = valReceitaBruta;
    //    this.valReceitaBrutaTotal = 0;
    //    this.valAliquotaEfetiva = 0;
    //}
    //public Estacao(double valReceitaBrutaTotal, double valAliquotaEfetiva) {
    //    this.valReceitaBrutaTotal = valReceitaBrutaTotal;
    //    this.valAliquotaEfetiva = valAliquotaEfetiva;
    //}
    //public Estacao(double[] valReceitaBruta) {
    //    this.valReceitaBruta = valReceitaBruta;
    //}
    //public Estacao(double valRBTouAE) {
    //    this.valReceitaBrutaTotal = 0;
    //    this.valAliquotaEfetiva = 0;
    //}

    // Métodos
    public double defReceitaBrutaTotal(double[] _valReceitaBruta) {
        valReceitaBrutaTotal = rbt.obtResultado(_valReceitaBruta);
        return valReceitaBrutaTotal;
    }

    public double defAliquotaEfetiva(int anexo, double _valreceitaBrutaTotal) {
        valAliquotaEfetiva = ae.obtDeterminado(anexo, _valreceitaBrutaTotal);
        return valAliquotaEfetiva;
    }

    public double defValorADeduzir(int anexo, double _valreceitaBrutaTotal) {
        valValorADeduzir = vad.obtDeterminado(anexo, _valreceitaBrutaTotal);
        return valValorADeduzir;
    }

    public double defSimplesNacional(double receitaBrutaTotal, double aliquotaEfetiva, double valorADeduzir) {
        valValorADeduzir = sn.obtResultado(receitaBrutaTotal, aliquotaEfetiva, valorADeduzir);
        return valValorADeduzir;
    }

    // Getters e Setters
    public double getValReceitaBrutaTotal() {
        return valReceitaBrutaTotal;
    }
    public void setValReceitaBrutaTotal(double valReceitaBrutaTotal) {
        this.valReceitaBrutaTotal = valReceitaBrutaTotal;
    }
    public double getValAliquotaEfetiva() {
        return valAliquotaEfetiva;
    }
    public void setValAliquotaEfetiva(double valAliquotaEfetiva) {
        this.valAliquotaEfetiva = valAliquotaEfetiva;
    }
    public double[] getValReceitaBruta() {
        return valReceitaBruta;
    }
    public void setValReceitaBruta(double[] valReceitaBruta) {
        this.valReceitaBruta = valReceitaBruta;
    }
    public double getValValorADeduzir() {
        return valValorADeduzir;
    }
    public void setValValorADeduzir(double valValorADeduzir) {
        this.valValorADeduzir = valValorADeduzir;
    }
}